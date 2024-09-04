package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carte {
    private List<Parc> parcs;

    public Carte(List<Parc> parcs) {
        this.parcs = parcs;
    }

    public List<Parc> getParcs() {
        return parcs;
    }

    public void setParcs(List<Parc> parcs) {
        this.parcs = parcs;
    }

    public List<Evaluation> recupererToutesLesEvaluations() {
        List<Evaluation> toutesLesEvaluations = new ArrayList<>();

        for (Parc parc : this.parcs) {
            toutesLesEvaluations.addAll(parc.getEvaluations());
            for (Hotel nearbyHotel : parc.getHotels()) {
                toutesLesEvaluations.addAll(nearbyHotel.getEvaluations());
                for (Chambre chambre : nearbyHotel.getChambres()) {
                    toutesLesEvaluations.addAll(chambre.getEvaluations());
                }
            }
        }

        return toutesLesEvaluations;
    }

    public Hotel trouverMeilleurHotel() { // pourrait être plus facile si on avait dit que hotel a des parcs proches
        Hotel meilleurHotel = null;
        int nombreDeParcsProchesMax = 0;

        for (Parc parc : this.parcs) {
            for (Hotel hotel : parc.getHotels()) {
                int nombreDeParcsProches = compterParcsProches(hotel);

                if (meilleurHotel == null || nombreDeParcsProches > nombreDeParcsProchesMax){
                    meilleurHotel = hotel;
                } else if (nombreDeParcsProches == nombreDeParcsProchesMax){
                    if (Math.random() > 0.5){ // pas vraiment nécessaire mais pour l'effet aléatoire
                        meilleurHotel = hotel;
                    }
                }
            }
        }

        return meilleurHotel;
    }

    public int compterParcsProches(Hotel hotel) {
        int nombreDeParcsProches = 0;

        for (Parc parc : this.parcs) {
            if(parc.getHotels().contains(hotel)){
                nombreDeParcsProches++;
            }
        }

        return nombreDeParcsProches;
    }

    public List<Endroit> recupererTousLesEndroitsCompris(double longitudeMin, double longitudeMax, double latitudeMin,
                                          double latitudeMax ) {
        List<Endroit> endroitCompris = new ArrayList<>();

        for (Parc parc : this.parcs) {
            if (estCompris(parc, longitudeMin, longitudeMax, latitudeMin, latitudeMax)){
                endroitCompris.add(parc);
            }

            for (Hotel hotel : parc.getHotels()) {
                if (estCompris(hotel, longitudeMin, longitudeMax, latitudeMin, latitudeMax)){
                    endroitCompris.add(parc);
                }
            }
        }
        return endroitCompris;
    }

    public boolean estCompris(Endroit place, double longitudeMin, double longitudeMax, double latitudeMin,
                              double latitudeMax) {
        return place.getLongitude() >= longitudeMin && place.getLongitude() <= longitudeMax
                && place.getLatitude() >= latitudeMin && place.getLatitude() <= latitudeMax;
    }

    public double trouverLeTotalMinimalPourLesHotels(List<Parc> ParcsToTravel){
        double totalMinimalPourLesHotels = 0.0;

        for (Parc parc : ParcsToTravel) {
            totalMinimalPourLesHotels += parc.recupererLePrixDeLaChambreLaMoinsChere();
        }

        return totalMinimalPourLesHotels;
    }

    public List<Evaluable> recupererLesEvaluablesAyantUneEvaluation(){
        List<Evaluable> evaluables = new ArrayList<>();

        for (Parc Parc : this.parcs) {
            if (!Parc.getEvaluations().isEmpty()) {
                evaluables.add(Parc);
            }

            for (Hotel hotel : Parc.getHotels()) {
                if (!hotel.getEvaluations().isEmpty()) {
                    evaluables.add(hotel);
                }

                for(Chambre Chambre : hotel.getChambres()){
                    if (!Chambre.getEvaluations().isEmpty()) {
                        evaluables.add(Chambre);
                    }
                }
            }
        }

        return evaluables;
    }
}
