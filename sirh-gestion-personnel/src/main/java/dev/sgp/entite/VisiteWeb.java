package dev.sgp.entite;

public class VisiteWeb {

    private int id;
    private String chemin;
    private int tempsExecution;
    private static int compteurId = 1;

    public VisiteWeb() {
        this.id = compteurId;
        compteurId++;
    }

    public VisiteWeb(String chemin, int tempsExecution) {
        this();
        this.chemin = chemin;
        this.tempsExecution = tempsExecution;
    }

    public int getId() {
        return id;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getTempsExecution() {
        return tempsExecution;
    }

    public void setTempsExecution(int tempsExecution) {
        this.tempsExecution = tempsExecution;
    }

    public static int getCompteurId() {
        return compteurId;
    }

    public static void setCompteurId(int compteurId) {
        VisiteWeb.compteurId = compteurId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VisiteWeb [id=");
        builder.append(id);
        builder.append(", chemin=");
        builder.append(chemin);
        builder.append(", tempsExecution=");
        builder.append(tempsExecution);
        builder.append("ms]");
        return builder.toString();
    }

}
