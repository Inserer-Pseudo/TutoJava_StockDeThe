package com.polytech;

import com.polytech.Thes.Categorie;
import com.polytech.Thes.StockDeThes;
import com.polytech.Thes.The;

public class Main {
    public static void main(String[] args) {
        try {
            StockDeThes placardCuisine = new StockDeThes();
            The the1 = new The("thé1", Categorie.VERT, "Chine", 80, 8F);
            The the2 = new The("thé2", Categorie.NOIR, "Inde", 95, 6.5F);
            placardCuisine.ajouter(the1, 50);
            placardCuisine.ajouter(the2, 60);
            placardCuisine.sortir(the1, 40);
            placardCuisine.sortir(the2, 60);
            System.out.println(placardCuisine.thes());
            placardCuisine.sortir(the1, 20);
            System.out.println(placardCuisine.thes());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}