package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic() { super(); }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = (habitat == null || habitat.trim().isEmpty()) ? "Inconnu" : habitat.trim();
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) {
        this.habitat = (habitat == null || habitat.trim().isEmpty()) ? "Inconnu" : habitat.trim();
    }

    // 🔹 Instr. 28 : méthode abstraite
    public abstract void swim();

    // 🔹 Instr. 31 : equals() sur name, age, habitat
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic other)) return false;
        return getAge() == other.getAge()
                && Objects.equals(getName(), other.getName())
                && Objects.equals(habitat, other.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
