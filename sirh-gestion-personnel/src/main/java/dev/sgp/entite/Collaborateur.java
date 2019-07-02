package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

    private String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String adresse;
    private String numeroSecuriteSociale;
    private String emailPro;
    private String photo;
    private ZonedDateTime dateHeureCreation;
    private boolean actif;
    private String intitulePoste;
    private Departement departement;

    public Collaborateur() {
    }

    public Collaborateur(String matricule, String nom, String prenom, LocalDate dateDeNaissance, String adresse,
            String numeroSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation,
            boolean actif) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.emailPro = emailPro;
        this.photo = photo;
        this.dateHeureCreation = dateHeureCreation;
        this.actif = actif;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ZonedDateTime getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public String getIntitulePoste() {
        return intitulePoste;
    }

    public void setIntitulePoste(String intitulePoste) {
        this.intitulePoste = intitulePoste;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Collaborateur [matricule=");
        builder.append(matricule);
        builder.append(", nom=");
        builder.append(nom);
        builder.append(", prenom=");
        builder.append(prenom);
        builder.append(", dateDeNaissance=");
        builder.append(dateDeNaissance);
        builder.append(", adresse=");
        builder.append(adresse);
        builder.append(", numeroSecuriteSociale=");
        builder.append(numeroSecuriteSociale);
        builder.append(", emailPro=");
        builder.append(emailPro);
        builder.append(", photo=");
        builder.append(photo);
        builder.append(", dateHeureCreation=");
        builder.append(dateHeureCreation);
        builder.append(", actif=");
        builder.append(actif);
        builder.append(", intitulePoste=");
        builder.append(intitulePoste);
        builder.append(", departement=");
        builder.append(departement);
        builder.append("]");
        return builder.toString();
    }

}
