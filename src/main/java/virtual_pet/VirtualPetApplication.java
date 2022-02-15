package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {
    virtualPetShelter petShelter;


    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        VirtualPetApplication Main = new VirtualPetApplication();
        Main.playGame();
    }

    public void playGame() {
        petShelter = new virtualPetShelter();
        petShelter.addPets();
        petShelter.listAllPets();
        Scanner inputScanner = new Scanner(System.in);
        boolean exit = true;
        System.out.println("Welcome to Dog-o-rama!");
        System.out.println("if a dogs' energy level hits 15 You are going to have a bad time" +
                "\nIf a dogs' hunger level falls bellow 1 you are gonna have a bad time"
                + "\nMoral of the story take care of the dogs or your gonna have a bad time");
        do {
            System.out.println("commands:\n"
                    + "press 1: Adopt a pet\n"
                    + "press 2: admit a pet into shelter \n"
                    + "press 3: feed a single dog\n"
                    + "press 4: play with a  dog\n"
                    + "press 5: give a dog a snack\n"
                    + "press 6: status of single  dog\n"
                    + "press 7: Get status of all shelter pets \n"
                    + "press 8: care for all pets in the shelter (shelter Reset)  \n"
                    + "press 9: to walk a pet \n"
                    + "press 10: to quit\n");
            int choice;

            choice = inputScanner.nextInt();
            petShelter.tickAllPet();
            petShelter.setDeadOrRampage();
            if (petShelter.checkIsDead()) {
                System.out.println("see now you have dead or rampaging pets");
                break;
            }

            // need to do status checks on shelter here
            switch (choice) {
                case 1:
                    //something
                    System.out.println("which dog do you want adopt");
                    String petChoice;
                    String enter = inputScanner.nextLine();
                    petChoice = inputScanner.nextLine();
                    petShelter.adoptPet(petChoice);
                    System.out.println("pet has been adopted");
                    petShelter.listPetsByName();



                    break;
                case 2:
                    //something
                    System.out.println("lets add a pet!");
                    petShelter.addNewPet(createPet());
                    break;
                case 3:
                    //something
                    String enter3 = inputScanner.nextLine();
                    System.out.println("Which pet do you want to feed");
                    petChoice = inputScanner.nextLine();
                    petShelter.getPetByName(petChoice).feed();
                    System.out.println("you feed " + petShelter.getPetByName(petChoice).getName());

                    break;
                case 4:
                    //something
                    String enter4 = inputScanner.nextLine();
                    System.out.println("Which pet do you want to play with");
                    petChoice = inputScanner.nextLine();
                    petShelter.getPetByName(petChoice).play();
                    System.out.println("you played with " + petShelter.getPetByName(petChoice).getName());
                    break;
                case 5:
                    //something
                    String enter5 = inputScanner.nextLine();
                    System.out.println("Which pet do you want to give a snack");
                    petChoice = inputScanner.nextLine();
                    petShelter.getPetByName(petChoice).snack();
                    System.out.println("you gave " + petShelter.getPetByName(petChoice).getName() + " a snack");
                    break;
                case 6:
                    String enter6 = inputScanner.nextLine();
                    System.out.println("Which pet do you want the status of");
                    petChoice = inputScanner.nextLine();
                    petShelter.getPetByName(petChoice).getStatus();
                    break;
                case 7:
                    //something
                    petShelter.getStatusAll();

                    break;
                case 8:
                    //something
                    petShelter.CareAllPets();
                    System.out.println("all pets are feed and happy");
                    break;

                case 9:
                    String enter7 = inputScanner.nextLine();
                    System.out.println("which dog do you want to walk");
                    petChoice = inputScanner.nextLine();
                     if(petShelter.getPetByName(petChoice) instanceof Dogs){
                         ((Dogs) petShelter.getPetByName(petChoice)).walk();
                         System.out.println("dog was walked");
                     }
                     else {
                         System.out.println("not a walkable pet");
                     }

                    break;
                case 10:
                    exit = false;
                    break;
                default:
                    System.out.println("Not a valid choice\n and ya pets suffer");
                    break;
            }
        } while (exit);
        System.out.println("Game Over");


    }

    public virtualPet createPet() {
        Scanner newPetInfo = new Scanner(System.in);
        String newPetName;
        int newPetAge;
        String newBreed;
        boolean newIsoverwieght;
        boolean newIsspoiled;
        String catOrDog= "";
        System.out.println("what is the name of your new pet");

        newPetName = newPetInfo.nextLine();
        System.out.println("Real or Robot?");
        newBreed = newPetInfo.nextLine();
        System.out.println("cat or dog");
        catOrDog = newPetInfo.nextLine();
        System.out.println("how old is the pet");
        newPetAge = newPetInfo.nextInt();
        String enter0 = newPetInfo.nextLine();
        System.out.println("is the pet over weight: true or false");
        newIsoverwieght = newPetInfo.nextBoolean();
        System.out.println("is the pet spoiled: true or false");
        newIsspoiled = newPetInfo.nextBoolean();
        System.out.println("your new pet has been created");
        virtualPet newPet = null;
        if (newBreed.equalsIgnoreCase("real")) {

            if (catOrDog.equalsIgnoreCase("dog")) {
                // block of code to be executed if the condition is true
                newPet = new Dogs(newPetName, newBreed, newIsspoiled, false, 5, 5, 5,10);
            }

            else{
                newPet = new Cats(newPetName, newBreed, newIsspoiled, false, 5, 5, 5);
            }

        }
        else{

            if (catOrDog.equalsIgnoreCase("dog")) {
                // block of code to be executed if the condition is true
                newPet = new roboticDogs(newPetName, newBreed, newIsspoiled, false, 10, 10);
            }

            else{
                newPet = new roboticCats(newPetName, newBreed, newIsspoiled, false, 10, 10);
            }

        }
        return newPet;

    }
}