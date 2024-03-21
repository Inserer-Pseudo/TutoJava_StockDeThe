package com.polytech;

import com.polytech.Thes.Categorie;
import com.polytech.Thes.StockDeThes;
import com.polytech.Thes.The;

public class Main {
    public static void main(String[] args) {
        try {
            The the = new The("test", Categorie.AROMATISE, "test", 75, 9.6F);
            The the2 = new The("test", Categorie.AROMATISE, "test", 75, 9.2F);
            System.out.println(the);
            StockDeThes stock = new StockDeThes();
            stock.ajouter(the, 20);
            stock.ajouter(the2, 20);
            System.out.println(stock.quantiteDesThesDontLaNoteEstSupOuEgaleA(9.5));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}