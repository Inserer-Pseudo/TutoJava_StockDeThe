package com.polytech.Thes;

public enum Categorie {
    BLANC, NOIR, VERT, OOLONG, AROMATISE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
