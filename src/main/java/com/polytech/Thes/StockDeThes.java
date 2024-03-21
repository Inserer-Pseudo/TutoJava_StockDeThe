package com.polytech.Thes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StockDeThes extends HashMap<The, Integer> {
    public StockDeThes() {
    }

    public boolean contientThe(The the) {
        return !this.containsKey(the);
    }

    public void ajouter(The the, int nbGrammes) {
        if (!this.containsKey(the)) {
            this.put(the, nbGrammes);
        } else {
            int stockPresent = this.get(the);
            this.put(the, stockPresent + nbGrammes);
        }
    }

    public void sortir(The the, int nbGrammes) throws Exception {
        if (!this.containsKey(the)) {
            throw new Exception("Pas de the en stock");
        } else {
            int stockPresent = this.get(the);
            if (stockPresent - nbGrammes < 0) {
                throw new Exception("Quantite en stock inferieur a la demande");
            } else if (stockPresent - nbGrammes == 0) {
                // PLus de the alors je l'enleve de la hashmap
                this.remove(the);
            } else {
                this.put(the, stockPresent - nbGrammes);
            }
        }
    }

    public int getQuantite(The the) {
        if (!this.containsKey(the)) {
            throw new IllegalArgumentException("Pas de ce the en stock");
        } else {
            return this.get(the);
        }
    }

    public Set<The> thesDeCategorie(Categorie categorie) {
        Set<The> set = new HashSet<>();
        for (The the : this.keySet()) {
            if (the.getCategorie() == categorie) {
                set.add(the);
            }
        }
        return set;
    }

    public int quantiteDesThesDontLaNoteEstSupOuEgaleA(double seuilNote) { // Un super choix de nom de la methode
        int quantite = 0;
        for (The the : this.keySet()) {
            if (the.getNote() >= seuilNote) {
                quantite++;
            }
        }
        return quantite;
    }
}
