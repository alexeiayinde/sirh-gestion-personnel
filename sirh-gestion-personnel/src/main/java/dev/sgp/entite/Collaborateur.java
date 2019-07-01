package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

    private String matricule;
    private String nom;
    private LocalDate dateDeNaissance;
    private String adresse;
    private String numeroSecuriteSociale;
    private String emailPro;
    private String photo;
    private ZonedDateTime dateHeureCreation;
    private boolean actif;

    public Collaborateur() {
    }

    public Collaborateur(String matricule, String nom, LocalDate dateDeNaissance, String adresse,
            String numeroSecuriteSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation,
            boolean actif) {
        this.matricule = matricule;
        this.nom = nom;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Collaborateur [matricule=");
        builder.append(matricule);
        builder.append(", nom=");
        builder.append(nom);
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
        builder.append("]");
        return builder.toString();
    }

}
