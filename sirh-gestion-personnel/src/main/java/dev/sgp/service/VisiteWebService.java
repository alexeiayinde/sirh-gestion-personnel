package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Statistiques;
import dev.sgp.entite.VisiteWeb;

public class VisiteWebService {

    private List<VisiteWeb> listeVisiteWebs = new ArrayList<>();
    private List<Statistiques> listeStatistiques = new ArrayList<>();
    private List<String> listeChemins = new ArrayList<>();

    public List<VisiteWeb> listerVisites() {
        return listeVisiteWebs;
    }

    public void sauvegarderVisite(VisiteWeb visite) {
        listeVisiteWebs.add(visite);
        calculerStatistiques();
    }

    public void sauvegarderChemin(String path) {
        if (!listeChemins.contains(path))
            listeChemins.add(path);
    }

    public List<Statistiques> listerStatistiques() {
        return listeStatistiques;
    }

    public void calculerStatistiques() {
        Statistiques stat;
        List<Statistiques> temp = new ArrayList<>();

        for (String chemin : listeChemins) {
            stat = new Statistiques();
            stat.setChemin(chemin);
            stat.setNbreVisites(
                    (int) listeVisiteWebs.stream().filter(visite -> chemin.equals(visite.getChemin())).count());
            stat.setTempsExecutionMin(listeVisiteWebs.stream().filter(visite -> chemin.equals(visite.getChemin()))
                    .mapToInt(visiteWeb -> visiteWeb.getTempsExecution()).summaryStatistics().getMin());
            stat.setTempsExecutionMax(listeVisiteWebs.stream().filter(visite -> chemin.equals(visite.getChemin()))
                    .mapToInt(visiteWeb -> visiteWeb.getTempsExecution()).summaryStatistics().getMax());
            stat.setTempsExecutionMoyenne(
                    (int) listeVisiteWebs.stream().filter(visite -> chemin.equals(visite.getChemin()))
                            .mapToInt(visiteWeb -> visiteWeb.getTempsExecution()).summaryStatistics().getAverage());
            temp.add(stat);
        }

        listeStatistiques = temp;
    }

}
