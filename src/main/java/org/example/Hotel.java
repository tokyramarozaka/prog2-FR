package org.example;

import java.util.List;
import java.util.Objects;

public class Hotel extends Endroit implements Evaluable{
    private String telephone;
    private String mail;
    private List<Chambre> chambres;
    private List<Evaluation> evaluations;

    public Hotel(double longitude, double latitude, String nom, String description, String telephone, String mail, List<Chambre> chambres, List<Evaluation> evaluations) {
        super(longitude, latitude, nom, description);
        this.telephone = telephone;
        this.mail = mail;
        this.chambres = chambres;
        this.evaluations = evaluations;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    @Override
    public void ajouterEvaluation(Evaluation evaluation) {
        this.evaluations.add(evaluation);
    }

    @Override
    public List<Evaluation> obtenirEvaluations() {
        return this.evaluations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(telephone, hotel.telephone) && Objects.equals(mail, hotel.mail) && Objects.equals(chambres, hotel.chambres) && Objects.equals(evaluations, hotel.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephone, mail, chambres, evaluations);
    }
}
