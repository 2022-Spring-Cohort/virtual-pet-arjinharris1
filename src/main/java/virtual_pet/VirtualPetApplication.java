package virtual_pet;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    private static virtualPet dog= new virtualPet("Bubba", 3,"beagle",false, true,100, 75 );
    private static virtualPet secondDog = new virtualPet("max",12,"jack russell",true,true,100,50);
    private static virtualPet thirdDog = new virtualPet("millie", 4, "corgie",true,false,75,70);

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        ArrayList<virtualPet> petArrayList = new ArrayList<virtualPet>();
        petArrayList.add(dog);
        petArrayList.add(secondDog);
        petArrayList.add(thirdDog);
        Scanner inputScanner = new Scanner(System.in);
        virtualPet myDog = dog;

        for(virtualPet chosenOne: petArrayList){
            System.out.println("Hi, My name is "+chosenOne.getPetName()+" I am a "+ chosenOne.getBreed()+
                    " I am " +chosenOne.getAge()+ " years old\nPlease pick me!");
        }
        System.out.println("press 1 for Bubba, 2 for Max, or 3 for Millie");
        int choice = inputScanner.nextInt();
        if(choice==1){
             myDog = dog;
            System.out.println("Bubba, good choice!");

        }
        else if(choice==2){
            myDog = secondDog;
            System.out.println("Max, Good choice!");
        }
        else if(choice==3){
            myDog = thirdDog;
            System.out.println("Millie, Good choice");
        }
        else{
            System.out.println("why are you being a dick\n No dog for you!");

        }

        System.out.println("if your dog's energy level reached 150 they will destroy your mom's house"+
                "\nIf your dog's hunger level falls bellow 10 they will eat your little sister"
                +"\nEither way your gonna have a bad time");
        System.out.println("commands: 1:quit  2: go for a walk 3: feed 4:give snack 5: play");
                int counter=0;
        for(int i = inputScanner.nextInt(); i !=1;counter++){


                if (i == 2) {
                    myDog.walk();
                    System.out.println(myDog.getStatus(myDog));
                    System.out.println("commands: 1:quit  2: go for a walk 3: feed 4:give snack 5: play");
                }
                else if (i == 3) {
                    myDog.feed();
                    System.out.println(myDog.getStatus(myDog));
                    System.out.println("commands: 1:quit  2: go for a walk 3: feed 4:give snack 5: play");

                }
                else if (i == 4) {
                    myDog.snack();
                    System.out.println(myDog.getStatus(myDog));
                    System.out.println("commands: 1:quit  2: go for a walk 3: feed 4:give snack 5: play");

                }
                else if (i == 5) {
                    myDog.play();
                    System.out.println(myDog.getStatus(myDog));
                    System.out.println("commands: 1:quit  2: go for a walk 3: feed 4:give snack 5: play");

                }
                 if(myDog.getEnergyLevel()>=150){
                System.out.println("dude!! a tired dog is a happy dog, Now your having a bad time");
                break;
                }
                if(myDog.getHungerLevel()<=10) {
                    System.out.println("I warned you! now your having a bad time");
                    break;
                }




            myDog.tick();



            i = inputScanner.nextInt();
        }


    }

}
