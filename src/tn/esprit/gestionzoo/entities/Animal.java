package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {}

    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getFamily() { return family; }
    public void setFamily(String family) {
        this.family = (family == null || family.trim().isEmpty()) ? "Inconnue" : family.trim();
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name == null || name.trim().isEmpty()) ? "Inconnu" : name.trim();
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = Math.max(age, 0); }

    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean mammal) { isMammal = mammal; }

    public void display() { System.out.println(this); }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal other)) return false;
        return age == other.age &&
                isMammal == other.isMammal &&
                Objects.equals(family, other.family) &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name, age, isMammal);
    }
}
