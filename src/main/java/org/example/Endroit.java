package org.example;

public abstract class Endroit {
    private double longitude;
    private double latitude;
    private String nom;
    private String description;

    public Endroit(double longitude, double latitude, String nom, String description) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.nom = nom;
        this.description = description;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Endroit{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}