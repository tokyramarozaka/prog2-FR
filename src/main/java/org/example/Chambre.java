package org.example;

import java.util.List;

public class Chambre implements Evaluable {
    private String numero;
    private double tarifNuitee;
    private List<Evaluation> evaluations;

    public Chambre(String numero, double tarifNuitee, List<Evaluation> evaluations) {
        this.numero = numero;
        this.tarifNuitee = tarifNuitee;
        this.evaluations = evaluations;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTarifNuitee() {
        return tarifNuitee;
    }

    public void setTarifNuitee(double tarifNuitee) {
        this.tarifNuitee = tarifNuitee;
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
}
