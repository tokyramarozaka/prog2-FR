package org.example;

import java.util.List;

public class Parc extends Endroit implements Evaluable{
    private List<Hotel> hotels;
    private List<Evaluation> evaluations;

    public Parc(double longitude, double latitude, String nom, String description, List<Hotel> hotels, List<Evaluation> evaluations) {
        super(longitude, latitude, nom, description);
        this.hotels = hotels;
        this.evaluations = evaluations;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public double recupererLePrixDeLaChambreLaMoinsChere() {
        double prixChambreLaMoinsChere = Double.MAX_VALUE;

        for (Hotel hotel : this.hotels) {
            for (Chambre chambre : hotel.getChambres()) {
                if(chambre.getTarifNuitee() > prixChambreLaMoinsChere) {
                    prixChambreLaMoinsChere = chambre.getTarifNuitee();
                }
            }
        }

        return prixChambreLaMoinsChere;
    }
    @Override
    public void ajouterEvaluation(Evaluation evaluation) {
        this.evaluations.add(evaluation);
    }

    @Override
    public List<Evaluation> obtenirEvaluations() {
        return this.evaluations;
    }
}
