package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        setNbrLegs(nbrLegs);
    }

    public int getNbrLegs() { return nbrLegs; }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = (nbrLegs >= 0 && nbrLegs <= 8) ? nbrLegs : 0;
    }

    public void walk() {
        System.out.println(" L’animal terrestre " + getName() +
                " marche sur " + nbrLegs + " pattes.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Terrestrial other)) return false;
        return getAge() == other.getAge() &&
                nbrLegs == other.nbrLegs &&
                Objects.equals(getName(), other.getName()) &&
                Objects.equals(getFamily(), other.getFamily());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFamily(), getAge(), nbrLegs);
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "name='" + getName() + '\'' +
                ", family='" + getFamily() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}
