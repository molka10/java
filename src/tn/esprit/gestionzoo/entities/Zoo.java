package tn.esprit.gestionzoo.entities;

public class Zoo {
    private String name;
    private String city;
    private final int nbrCages;
    private Animal[] animals;
    private int animalCount = 0;

    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    // --- Gestion animaux généraux ---
    public boolean isZooFull() { return animalCount >= nbrCages; }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() || animal == null) return false;
        animals[animalCount++] = animal;
        return true;
    }

    // --- Prosit 6 : section aquatique ---
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
            System.out.println(" " + aquatic.getName() + " ajouté à la section aquatique.");
        } else {
            System.out.println(" Section aquatique pleine !");
        }
    }

    /** Liaison dynamique : chaque Aquatic nage selon sa propre redéfinition. */
    public void makeAllAquaticsSwim() {
        System.out.println("\n Tous les animaux aquatiques nagent :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    /** Instr. 29 : profondeur max des pingouins. */
    public float maxPenguinSwimmingDepth() {
        float max = -1f;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin p) {
                if (p.getSwimmingDepth() > max) max = p.getSwimmingDepth();
            }
        }
        return max;
    }

    /** Instr. 30 : nombre d’aquatiques par type. */
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0, penguins = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++;
            else if (aquaticAnimals[i] instanceof Penguin) penguins++;
        }
        System.out.println(" Dauphins : " + dolphins + " |  Pingouins : " + penguins);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        if (z2.animalCount > z1.animalCount) return z2;
        System.out.println("⚖ Les deux zoos ont le même nombre d’animaux !");
        return z1;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animaux=" + animalCount +
                ", aquatiques=" + aquaticCount +
                '}';
    }
}
