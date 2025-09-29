public class Zoo {
    String name;
    String city;
    final int nbrCages;
    Animal[] animals = new Animal[25];
    int animalCount = 0;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public void displayZoo() {
        System.out.println("Zoo: " + name + " situé à " + city + " avec " + nbrCages + " cages.");
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean addAnimal(Animal animal) {
        // Vérifier si le zoo est plein
        if (animalCount >= nbrCages) {
            System.out.println("❌ Impossible : le zoo est plein !");
            return false;
        }

        // Vérifier si l’animal existe déjà (même nom)
        if (searchAnimal(animal.name) != -1) {
            System.out.println("❌ Impossible : " + animal.name + " existe déjà dans le zoo !");
            return false;
        }

        // Ajouter l’animal
        animals[animalCount] = animal;
        animalCount++;
        System.out.println("✅ " + animal.name + " ajouté avec succès !");
        return true;
    }



    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]); // utilise toString() de Animal
        }
    }
    public int searchAnimal(String animalName) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animalName)) {
                return i; // trouvé, retourne la position
            }
        }
        return -1; // pas trouvé
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);

        if (index == -1) {
            System.out.println("❌ L’animal " + animal.name + " n’existe pas dans le zoo.");
            return false;
        }

        // Décaler les animaux après l’index trouvé
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        // Supprimer la dernière case (désormais vide)
        animals[animalCount - 1] = null;
        animalCount--;

        System.out.println("✅ L’animal " + animal.name + " a été supprimé du zoo.");
        return true;
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("⚖️ Les deux zoos ont le même nombre d’animaux !");
            return z1; // ou z2, peu importe
        }
    }



}

