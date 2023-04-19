import be.intecbrussel.robot.CrazyRobot;
import be.intecbrussel.vaccination.*;

public class Main {
    public static void main(String[] args) {

        Monkey aap = new Monkey(false, 3, "koko", 569874, true);
        Cat categorique = new Cat(false, 1, "kra", 4658, true);
        Dog dodgy = new Dog(false, 9, "dodgy", 45656, true);
        Cat catapulte = new Cat(); catapulte.setName("zylo");

        aap.vaccinateAnimal(Disease.CHICKENPOCKS);
        aap.vaccinateAnimal(Disease.POLIO);
        categorique.vaccinateAnimal(Disease.POLIO);


        AnimalShelter shelterino = new AnimalShelter(0);

        shelterino.addAnimal(aap);
        shelterino.addAnimal(categorique);
        shelterino.addAnimal(dodgy);
        shelterino.addAnimal(catapulte);

        System.out.println("\nANIMAL COUNT");
        System.out.println(shelterino.countAnimals());

        System.out.println("\nFIND OLDEST ANIMAL");
        System.out.println(shelterino.findOldestAnimal());
        shelterino.printAnimals();

        System.out.println("\nCLEAN ALL ANIMALS");
        shelterino.treatAnimal("koko");
        shelterino.treatAnimal(1);
        shelterino.printAnimals();

        System.out.println("\nNOT VACCINATED FOR A CERTAIN DISEASE");
        shelterino.printaAnimalIsNotVaccinated(Disease.POLIO);

        System.out.println("\nFIND BY NAME");
        System.out.println(shelterino.findAnimal("koko"));
        shelterino.findAnimal(2).ifPresent(System.out::println);

        System.out.println("\nSORT BY NAME");
        shelterino.sortAnimalsByName();
        shelterino.printAnimals();

        System.out.println("\nSORT BY AGE");
        shelterino.sortAnimalsByAge();
        shelterino.printAnimals();

        System.out.println("\nSORT BY NATURAL ORDER (ID)");
        shelterino.sortAnimals();
        shelterino.printAnimals();













    }
}