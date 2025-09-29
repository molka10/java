public class Animal {
    String family;
    String name;
    int age;
    Boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, Boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void display() {
        System.out.println("Animal: " + name + " (" + family + "), âge: " + age + ", Mammifère: " + isMammal);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
