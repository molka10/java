public class Main {
    public static void main(String[] args) {

        // 🔹 Création des animaux
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal tiger = new Animal("Feline", "Tiger", 3, true);
        Animal elephant = new Animal("Mammal", "Elephant", 10, true);

        // 🔹 Création du zoo
        Zoo myZoo = new Zoo("Zoo", "Tunis", 20);

        // 🔹 Affichage simple (Prosit 2)
        lion.display();
        myZoo.displayZoo();
        System.out.println(lion);
        System.out.println(myZoo);

        // ================================
        // 🔹 Prosit 3 - Instruction 10 : ajouter des animaux
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);

        // 🔹 Prosit 3 - Instruction 11 : afficher les animaux du zoo
        myZoo.displayAnimals();

        // 🔹 Prosit 3 - Instruction 11 : chercher un animal
        int indexLion = myZoo.searchAnimal("Lion");
        System.out.println("Index du Lion : " + indexLion);

        int indexMonkey = myZoo.searchAnimal("Monkey");
        System.out.println("Index du Monkey : " + indexMonkey); // devrait donner -1public class Main {
        public static void main(String[] args) {

            // 🔹 Création des animaux
            Animal lion = new Animal("Feline", "Lion", 5, true);
            Animal tiger = new Animal("Feline", "Tiger", 3, true);
            Animal elephant = new Animal("Mammal", "Elephant", 10, true);
            Animal monkey = new Animal("Primate", "Monkey", 2, true);

            // 🔹 Création de deux zoos
            Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis", 25);
            Zoo zoo2 = new Zoo("Zoo de Sousse", "Sousse", 25);

            // 🔹 Prosit 2 : affichage simple
            lion.display();
            zoo1.displayZoo();
            System.out.println(lion);
            System.out.println(zoo1);

            // ================================
            // 🔹 Prosit 3 - Instruction 10 : ajouter des animaux
            zoo1.addAnimal(lion);
            zoo1.addAnimal(tiger);
            zoo1.addAnimal(elephant);

            // 🔹 Prosit 3 - Instruction 11 : afficher les animaux
            zoo1.displayAnimals();

            // 🔹 Prosit 3 - Instruction 11 : chercher un animal
            int indexLion = zoo1.searchAnimal("Lion");
            System.out.println("Index du Lion : " + indexLion);

            int indexGiraffe = zoo1.searchAnimal("Giraffe");
            System.out.println("Index de la Giraffe : " + indexGiraffe); // -1

            // ================================
            // 🔹 Prosit 3 - Instruction 12 : tester doublons + limite
            zoo1.addAnimal(lion); // ❌ doublon
            for (int i = 0; i < 30; i++) { // ajouter plein d’animaux
                zoo1.addAnimal(new Animal("Test", "Animal" + i, 1, true));
            }

            // ================================
            // 🔹 Prosit 3 - Instruction 13 : supprimer un animal
            zoo1.removeAnimal(tiger);   // ✅ supprime Tiger
            zoo1.removeAnimal(monkey);  // ❌ Monkey n’existe pas

            zoo1.displayAnimals();

            // ================================
            // 🔹 Prosit 3 - Instruction 15 : vérifier si le zoo est plein
            System.out.println("Zoo1 est plein ? " + zoo1.isZooFull());

            // ================================
            // 🔹 Prosit 3 - Instruction 16 : comparer deux zoos
            zoo2.addAnimal(monkey); // zoo2 a 1 animal

            Zoo plusGrand = zoo1.comparerZoo(zoo1, zoo2);
            System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name);
        }
    }

}
}
