package com.polytech.Thes;

public class The {
    private String nom;
    private Categorie categorie;
    private String origine;
    private int tempInfusion;
    private Float note;
    private static final int TEMP_INFUSION_MIN = 15;

    public The(String nom, Categorie categorie, String origine, int tempInfusion, Float note) {
        setNom(nom);
        setCategorie(categorie);
        setOrigine(origine);
        setTempInfusion(tempInfusion);
        setNote(note);
    }

    public String toString() {
        return "Thé " + categorie + " " + nom + " d'origine " + origine + ". A infuser à " + tempInfusion + "°C. Noté : " + note + "/10";
    }

    public void setNom(String nom) {
        if (nom == null || nom == "") {
            throw new IllegalArgumentException("Nom invalide");
        } else {
            this.nom = nom;
        }
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public void setTempInfusion(int tempInfusion) {
        // Temperature ne peut pas etre inferieur à 15 et supérieur à temp ebulition eau
        if (tempInfusion < TEMP_INFUSION_MIN || tempInfusion > 100) {
            throw new IllegalArgumentException("Temperature d'infusion hors plage");
        } else {
            this.tempInfusion = tempInfusion;
        }
    }

    public void setNote(Float note) {
        if (note < 0F || note > 10F) {
            throw new IllegalArgumentException("Note hors plage. Comprise entre 0 et 10");
        } else {
            this.note = note;
        }
    }


    public String getNom() {
        return nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getOrigine() {
        return origine;
    }

    public int getTempInfusion() {
        return tempInfusion;
    }

    public Float getNote() {
        return note;
    }
}
