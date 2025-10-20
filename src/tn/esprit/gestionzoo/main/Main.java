package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo de Tunis", "Tunis", 25);

        // --- Prosit 6 : tests ---
        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Mer Rouge", 25.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Nemo", 3, true, "Mer Rouge", 30f);
        Penguin p1 = new Penguin("Spheniscidae", "Skipper", 3, false, "Antarctique", 80f);
        Penguin p2 = new Penguin("Spheniscidae", "Kowalski", 4, false, "Antarctique", 120f);

        zoo.addAquaticAnimal(d1);
        zoo.addAquaticAnimal(d2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);

        zoo.makeAllAquaticsSwim();
        zoo.displayNumberOfAquaticsByType();
        System.out.println(" Profondeur max des pingouins : " + zoo.maxPenguinSwimmingDepth() + " m");

        // Test equals()
        Penguin p3 = new Penguin("Spheniscidae", "Skipper", 3, false, "Antarctique", 60f);
        System.out.println("p1.equals(p3) ? " + p1.equals(p3));
    }
}
