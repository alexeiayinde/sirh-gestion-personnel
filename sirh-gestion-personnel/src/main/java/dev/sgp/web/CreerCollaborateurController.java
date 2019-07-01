package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateurController extends HttpServlet {

    private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
    private static int compteurMatricule;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateur.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String matricule = String.valueOf(compteurMatricule++);
        String nomParam = req.getParameter("nom");
        String prenomParam = req.getParameter("prenom");
        LocalDate dateNaissanceParam = LocalDate.parse(req.getParameter("dateNaissance"),
                DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String adresseParam = req.getParameter("adresse");
        String securiteSocialeParam = req.getParameter("securiteSociale");
        ZonedDateTime dateHeureCreation = ZonedDateTime.now();
        String emailProParam = prenomParam + "." + nomParam + "@societe.com";

        if (nomParam.trim().isEmpty()) {
            resp.setStatus(400);
            resp.getWriter().write("Erreur au niveau de la saisie du nom");
        } else if (prenomParam.trim().isEmpty()) {
            resp.setStatus(400);
            resp.getWriter().write("Erreur au niveau de la saisie du prénom");
        } else if (adresseParam.trim().isEmpty()) {
            resp.setStatus(400);
            resp.getWriter().write("Erreur au niveau de la saisie de l'adresse");
        } else {
            Collaborateur collab = new Collaborateur(matricule, nomParam, dateNaissanceParam, adresseParam,
                    securiteSocialeParam, emailProParam, "test", dateHeureCreation, true);

            collabService.sauvegarderCollaborateur(collab);

            req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp").forward(req, resp);
        }

    }

}
