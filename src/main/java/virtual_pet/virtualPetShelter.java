package virtual_pet;
import java.util.ArrayList;

public class virtualPetShelter {
    ArrayList<virtualPet> petShelter;


    public virtualPetShelter() {
        petShelter = new ArrayList<virtualPet>();


    }

    public void addPets() {
        petShelter.add(new virtualPet("Bubba", 3, "beagle", false, false, 10, 7, false));
        petShelter.add(new virtualPet("max", 4, "husky", true, true, 10, 7, false));
        petShelter.add(new virtualPet("odin", 5, "pug", false, false, 10, 7, false));
        petShelter.add(new virtualPet("iroh", 6, "corgie", true, true, 10, 7, false));
        petShelter.add(new virtualPet("millie", 7, "lab", false, false, 10, 7, false));
    }

    public void listAllPets() {
        for (virtualPet currentPet : petShelter) {
            System.out.println("Hi, My name is " + currentPet.getPetName() + " I am a " + currentPet.getBreed() +
                    " I am " + currentPet.getAge() + " years old\n" +
                    "I have an energy level of " + currentPet.getEnergyLevel() +
                    "\nI have a hunger level of" + currentPet.getHungerLevel() + "\n" + "\n");

        }

    }

    public void CareAllPets() {
        for (virtualPet currentPet : petShelter) {
            currentPet.freshStart();
        }
    }

    public void getStatusAll() {
        for (virtualPet currentPet : petShelter) {
            currentPet.getStatus();
        }

    }

    public void setDeadOrRampage() {
        for (virtualPet currentPet : petShelter) {
            currentPet.KillPetOrRampage();
        }

    }

    public boolean checkIsDead() {
        for (virtualPet currentPet : petShelter) {
            if (currentPet.isDeadOrRampage()) {
                return true;
            }


        }
        return false;
    }

    public void adoptPet(String petName) {
        virtualPet petToAdopt = getPetByName(petName);
            petShelter.remove(petToAdopt);



    }



    public virtualPet getPetByName(String name) {
        for (virtualPet currentPet : petShelter) {
            if (currentPet.getPetName().equalsIgnoreCase(name)) {
                return currentPet;
            }
        }
        return null;
    }
    public void listPetsByName(){
        for( virtualPet currentPet: petShelter){
            System.out.println(currentPet.getPetName() + " is still in the shelter");
        }
    }
    public void addNewPet(virtualPet petToAdd){
        petShelter.add(petToAdd);
    }
}



