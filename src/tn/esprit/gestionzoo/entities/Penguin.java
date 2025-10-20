package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        setSwimmingDepth(swimmingDepth);
    }

    public float getSwimmingDepth() { return swimmingDepth; }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = Math.max(swimmingDepth, 0f);
    }

    @Override
    public void swim() {
        System.out.println(" Le pingouin " + getName() +
                " nage à une profondeur de " + swimmingDepth + " m dans " + getHabitat() + ".");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + getName() + '\'' +
                ", depth=" + swimmingDepth +
                ", habitat='" + getHabitat() + '\'' +
                '}';
    }
}
