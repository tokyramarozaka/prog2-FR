package org.example;

import java.time.LocalDate;

public class Utilisateur {
    private String nomUtilisateur;
    private String mailUtilisateur;

    public Utilisateur(String nomUtilisateur, String mailUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
        this.mailUtilisateur = mailUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }
}
