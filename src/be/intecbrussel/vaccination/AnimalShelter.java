package be.intecbrussel.vaccination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AnimalShelter {

    private List<Animal> animals = new ArrayList<>();
    private int animalId;

    public AnimalShelter() {
    }

    public AnimalShelter(int animalId) {
        this.animalId = animalId;
    }

    public void printAnimals(){
        animals.forEach(System.out::println);
    }

    public void sortAnimals(){
        animals.sort(Comparator.comparing(Animal::getAnimalNumber));
    }
    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }
    public void sortAnimalsByAge(){
        animals.sort(Comparator.comparing(Animal::getAge));
    }


    public void printaAnimalIsNotVaccinated(Disease disease){
        animals.stream()
                .filter(animal -> !animal.getIsVaccinated().get(disease))
                .forEach(System.out::println);
    }


    public Optional<Animal> findAnimal(int animalNumber){
        return animals.stream()
                .filter(animal -> animal.getAnimalNumber() == animalNumber).findFirst();

    }

    public List<Animal> findAnimal(String name){
        // Optional
//        return animals.stream()
//                .filter(animal -> animal.getName().equals(name)).findFirst();

        // LIST (if 2 of more animals with same name)
        List<Animal> animalsFound = animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .toList();

        System.out.println("Matches found with name '" + name + "': " + animalsFound.size());

        return animalsFound;
    }

    public void treatAnimal(int animalNumber){
        animals.stream()
                .filter(animal -> animal.getAnimalNumber() == animalNumber)
                .forEach(Treatable::treatAnimal);
    }

    public void treatAnimal(String name){
        animals.stream()
                .filter(animal -> animal.getName().equals(name))
                .forEach(Treatable::treatAnimal);
    }

    public void treatAllAnimals(){
        animals.forEach(Treatable::treatAnimal);
    }

    public Animal findOldestAnimal(){

        List<Animal> oldestAnimal = new ArrayList<>(animals);

        oldestAnimal.sort(Comparator.comparing(Animal::getAge).reversed());

        return oldestAnimal.get(0);
    }

    public int countAnimals(){
        return animals.size();
    }

    public void addAnimal(Animal animal){

        animals.add(animal);
        animal.setAnimalNumber(animalId);
        animalId += 1;

    }

    @Override
    public String toString() {

        String a = "";

        for (Animal animal : animals) {
            a += (animal.toString() + "\n");
        }


        return a;
    }
}
