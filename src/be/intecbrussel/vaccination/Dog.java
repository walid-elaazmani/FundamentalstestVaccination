package be.intecbrussel.vaccination;

import be.intecbrussel.vaccination.Animal;
import be.intecbrussel.vaccination.Disease;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog() {
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        hasFoulBreath = false;
        super.setClean(true);
    }

    @Override
    public String toString() {
        return "Dog |" + " Name: " + getName() + " | Age : " + getAge() + " | Animal Nr. : " + getAnimalNumber() + " | Clean : " + isClean() +
                " | Has Foul Breath : " + hasFoulBreath + " | vaccination card : " + getIsVaccinated();
    }
}
