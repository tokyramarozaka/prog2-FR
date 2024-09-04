package org.example;

import java.time.LocalDate;

public class Evaluation {
    private Utilisateur utilisateur;
    private int score;
    private String commentaire;
    private LocalDate dateDeCreation;

    public Evaluation(Utilisateur utilisateur, int score, String commentaire, LocalDate dateDeCreation) {
        this.utilisateur = utilisateur;
        this.score = score;
        this.commentaire = commentaire;
        this.dateDeCreation = dateDeCreation;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }
}
