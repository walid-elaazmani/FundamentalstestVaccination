package be.intecbrussel.vaccination;

public class Cat extends Animal {
    private boolean hasLongNails;

    public Cat(){
    }

    public Cat(boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean, age, name, animalNumber);
        this.hasLongNails = hasLongNails;
    }

    @Override
    public void treatAnimal() {
        hasLongNails = false;
        super.setClean(true);
    }

    @Override
    public String toString() {
        return "Cat |" + " Name: " + getName() + " | Age : " + getAge() + " | Animal Nr. : " + getAnimalNumber() + " | Clean : " + isClean() +
                 " | has Long Nails: " + hasLongNails + " | vaccination card : " + getIsVaccinated();
    }
}
