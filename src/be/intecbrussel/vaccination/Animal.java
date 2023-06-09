package be.intecbrussel.vaccination;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {

    private final Map<Disease, Boolean> isVaccinated = new HashMap<>();
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
        
        this.name = "Error404";
        
        for (Disease disease : Disease.values()) {
            getIsVaccinated().putIfAbsent(disease, false);
        }
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;

        for (Disease disease : Disease.values()) {
            getIsVaccinated().putIfAbsent(disease, false);
        }
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isClean() {
        return isClean;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    @Override
    public void vaccinateAnimal(Disease disease){
        isVaccinated.put(disease, true);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
