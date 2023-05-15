package pets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetsGotName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("How many pets do you have?");
        int numPets = input.nextInt();


        List<Pet> petList = new ArrayList<Pet>();    // This is a CONTAINER CONTAINER

        for (int pets = 1; pets <= numPets; pets++) {

            System.out.println("What is the type of pet " + pets );
            String petType = input.next();

            System.out.println("What is the name of pet " + pets );
            String petName = input.next();

            Pet pet;

            if (petType.equalsIgnoreCase("dog")) {
                pet = new Dog(petName);


            } else if (petType.equalsIgnoreCase("pirate")){
                pet = new Pirate(petName);


            } else if (petType.equalsIgnoreCase("cat")) {
                pet = new Cat(petName);

            } else {
                System.out.println("Sorry, we don't support " + petType + " as a pet :(");
                continue;
            }
            
           petList.add(pet);

        }

        //System.out.println("Your pets are: "  );

        for (Pet pet : petList) {
            System.out.println(pet.getName() + " Pet says : " + pet.speak() );

        }
    }
}
