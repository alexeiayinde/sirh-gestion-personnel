package dev.sgp.entite;

public class Statistiques {

    private String chemin;
    private int nbreVisites;
    private int tempsExecutionMin;
    private int tempsExecutionMax;
    private int tempsExecutionMoyenne;

    public Statistiques() {
    }

    public Statistiques(String chemin, int nbreVisites, int tempsExecutionMin, int tempsExecutionMax,
            int tempsExecutionMoyenne) {
        this.chemin = chemin;
        this.nbreVisites = nbreVisites;
        this.tempsExecutionMin = tempsExecutionMin;
        this.tempsExecutionMax = tempsExecutionMax;
        this.tempsExecutionMoyenne = tempsExecutionMoyenne;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public int getNbreVisites() {
        return nbreVisites;
    }

    public void setNbreVisites(int nbreVisites) {
        this.nbreVisites = nbreVisites;
    }

    public int getTempsExecutionMin() {
        return tempsExecutionMin;
    }

    public void setTempsExecutionMin(int tempsExecutionMin) {
        this.tempsExecutionMin = tempsExecutionMin;
    }

    public int getTempsExecutionMax() {
        return tempsExecutionMax;
    }

    public void setTempsExecutionMax(int tempsExecutionMax) {
        this.tempsExecutionMax = tempsExecutionMax;
    }

    public int getTempsExecutionMoyenne() {
        return tempsExecutionMoyenne;
    }

    public void setTempsExecutionMoyenne(int tempsExecutionMoyenne) {
        this.tempsExecutionMoyenne = tempsExecutionMoyenne;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Statistiques [chemin=");
        builder.append(chemin);
        builder.append(", nbreVisites=");
        builder.append(nbreVisites);
        builder.append(", tempsExecutionMin=");
        builder.append(tempsExecutionMin);
        builder.append(", tempsExecutionMax=");
        builder.append(tempsExecutionMax);
        builder.append(", tempsExecutionMoyenne=");
        builder.append(tempsExecutionMoyenne);
        builder.append("]");
        return builder.toString();
    }

}
