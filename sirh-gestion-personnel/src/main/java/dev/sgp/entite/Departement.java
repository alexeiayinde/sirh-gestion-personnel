package dev.sgp.entite;

public class Departement {

    private int id;
    private String nom;
    private static int compteurId = 1;

    public Departement() {
        this.id = compteurId;
        compteurId++;
    }

    public Departement(String nom) {
        this();
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Departement [id=");
        builder.append(id);
        builder.append(", nom=");
        builder.append(nom);
        builder.append("]");
        return builder.toString();
    }

}
