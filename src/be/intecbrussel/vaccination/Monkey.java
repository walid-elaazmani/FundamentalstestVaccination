package be.intecbrussel.vaccination;

import be.intecbrussel.vaccination.Animal;
import be.intecbrussel.vaccination.Disease;

public class Monkey extends Animal {

    private boolean isHyperActive;

    public Monkey() {
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean, age, name, animalNumber);
        this.isHyperActive = isHyperActive;

    }

    @Override
    public void treatAnimal() {
        isHyperActive = false;
        super.setClean(true);
    }

    @Override
    public String toString() {
        return "Monkey |" + " Name: " + getName() + " | Age : " + getAge() + " | Animal Nr. : " + getAnimalNumber() + " | Clean : " + isClean() +
                " | is HyperActive: " + isHyperActive + " | vaccination card : " + getIsVaccinated();
    }
}
