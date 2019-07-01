package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String matriculeParam = req.getParameter("matricule");
//        if (matriculeParam != null) {
//            resp.setStatus(200);
//            resp.setContentType("text/html");
//
//            resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "<p>Matricule : " + matriculeParam + "</p>");
//        } else {
//            resp.sendError(400);
//        }
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String matriculeParam = req.getParameter("matricule");
//        String titreParam = req.getParameter("titre");
//        String nomParam = req.getParameter("nom");
//        String prenomParam = req.getParameter("prenom");
//
//        if ((req.getParameter("matricule") != null) && (req.getParameter("titre") != null)
//                && (req.getParameter("nom") != null) && (req.getParameter("prenom") != null)) {
//            resp.setStatus(201);
//
//            resp.getWriter().write("Création d'un collaborateur avec les informations suivantes : \n" + "matricule="
//                    + matriculeParam + ", titre=" + titreParam + ", nom=" + nomParam + ", prenom=" + prenomParam);
//
//        } else {
//
//            resp.getWriter()
//                    .write("Les paramètres suivants sont incorrects : " + ((matriculeParam == null) ? " matricule" : "")
//                            + ((titreParam == null) ? " titre" : "") + ((nomParam == null) ? " nom" : "")
//                            + ((prenomParam == null) ? " prenom" : ""));
//            resp.setStatus(400);
//        }
//    }

}
