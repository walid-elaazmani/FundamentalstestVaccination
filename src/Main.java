import be.intecbrussel.robot.CrazyRobot;
import be.intecbrussel.vaccination.*;

public class Main {
    public static void main(String[] args) {

        Monkey aap = new Monkey(false, 3, "koko", 569874, true);
        Cat categorique = new Cat(false, 1, "kra", 4658, true);
        Dog dodgy = new Dog(false, 9, "drogo", 45656, true);

        aap.vaccinateAnimal(Disease.CHICKENPOCKS);
        aap.vaccinateAnimal(Disease.POLIO);
        categorique.vaccinateAnimal(Disease.POLIO);

        System.out.println(aap);
        System.out.println(categorique);


        AnimalShelter shelterino = new AnimalShelter(0);

        shelterino.addAnimal(aap);
        shelterino.addAnimal(categorique);
        shelterino.addAnimal(dodgy);

        System.out.println(shelterino.countAnimals());
        System.out.println(aap);
        System.out.println(categorique);

        shelterino.findOldestAnimal();
        shelterino.printAnimals();

        System.out.println("CLEAN ALL");
        shelterino.treatAnimal("koko");
        shelterino.treatAnimal(1);
        shelterino.printAnimals();

        System.out.println("VACCINATED FOR POLIO");
        shelterino.printaAnimalIsNotVaccinated(Disease.POLIO);

        System.out.println("FIND 1");
        System.out.println(shelterino.findAnimal(1));

        System.out.println("FIND BY NAME");
        shelterino.findAnimal("koko").ifPresent(System.out::println);


        CrazyRobot jbabo = new CrazyRobot("jbabo");

        System.out.println(jbabo.getUnitName());







    }
}