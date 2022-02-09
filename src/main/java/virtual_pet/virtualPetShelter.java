package virtual_pet;
import java.util.ArrayList;

public class virtualPetShelter {
    ArrayList<virtualPet> petShelter;


    public virtualPetShelter() {
        petShelter = new ArrayList<virtualPet>();


    }

    public void addPets() {
        petShelter.add(new Dogs("Bubba", "real dog", true, false, 1, 15, 7,10));
        petShelter.add(new Cats("max", "real Cat", false, false, 1, 15, 7));
        petShelter.add(new roboticDogs("odin", " Robot Dog", true, false, 15, 15));
        petShelter.add(new Dogs("iroh", "realDog", true, false, 1, 15, 7,10));
        petShelter.add(new Dogs("millie", "realDog", false, false, 1, 15, 7,10));
    }

    public void listAllPets() {
        for (virtualPet currentPet : petShelter) {
            System.out.println("Hi, My name is " + currentPet.getName() + " I am a " + currentPet.RealOrRobot);

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
    public void tickAllPet(){
        for (virtualPet currentPet : petShelter){
            currentPet.tick();
        }
    }

    public void setDeadOrRampage() {
        for (virtualPet currentPet : petShelter) {
            currentPet.killPetOrRampage();
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
            if (currentPet.getName().equalsIgnoreCase(name)) {
                return currentPet;
            }
        }
        return null;
    }
    public void listPetsByName(){
        for( virtualPet currentPet: petShelter){
            System.out.println(currentPet.getName() + " is still in the shelter");
        }
    }
    public void addNewPet(virtualPet petToAdd){
        petShelter.add(petToAdd);
    }
}



