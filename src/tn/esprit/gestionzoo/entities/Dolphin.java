package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        setSwimmingSpeed(swimmingSpeed);
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = Math.max(swimmingSpeed, 0f);
    }

    @Override
    public void swim() {
        System.out.println("Le dauphin " + getName() +
                " nage à " + swimmingSpeed + " km/h dans " + getHabitat() + ".");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + getName() + '\'' +
                ", speed=" + swimmingSpeed +
                ", habitat='" + getHabitat() + '\'' +
                '}';
    }
}
