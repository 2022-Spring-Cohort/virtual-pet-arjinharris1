package virtual_pet;

public class virtualPet {
    private String petName;
    private int age;
    private String breed;
    private boolean isOverWeight;
    private boolean isSpoiled;
    private int hungerLevel;
    private int energyLevel;
    private  boolean isDeadOrRampage;

    public virtualPet(String petName, int age, String breed, boolean isOverWeight, boolean isSpoiled, int hungerLevel, int energyLevel, boolean isDeadOrRampage) {
        this.petName = petName;
        this.age = age;
        this.breed = breed;
        this.isOverWeight = isOverWeight;
        this.isSpoiled = isSpoiled;
        this.hungerLevel = hungerLevel;
        this.energyLevel = energyLevel;
        this.isDeadOrRampage = isDeadOrRampage;
    }
    virtualPetShelter petShelter = new virtualPetShelter();


    public String getPetName() {
        return petName;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isOverWeight() {
        return isOverWeight;
    }

    public boolean isSpoiled() {
        return isSpoiled;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public boolean isDeadOrRampage(){return  isDeadOrRampage;}

    public void tick(){

        energyLevel= energyLevel+2;
        hungerLevel= hungerLevel-2;
    }
    public void feed(){
        hungerLevel= hungerLevel+5;

    }
    public void snack(){
        hungerLevel=hungerLevel+2;
    }
    public void walk(){
        if(isOverWeight){
        energyLevel=energyLevel-3;
        hungerLevel= hungerLevel -3;
        }
        else{
            energyLevel=energyLevel-4;
            hungerLevel= hungerLevel -4;
        }
    }

    public void play(){
        if(isSpoiled ){
          energyLevel=energyLevel-2;
        }
        else {
            energyLevel = energyLevel - 5;
        }
        hungerLevel= hungerLevel- 1;

    }
    public void getStatus(){
        System.out.println( "My name is " + getPetName()+"\nMy energy level is "+ energyLevel+
                "\nMy Hungry level is " + hungerLevel+ "\n\n");
    }
    public void KillPetOrRampage(){
        if(hungerLevel<1){
            isDeadOrRampage=true;
        }
        if(energyLevel>15){
            isDeadOrRampage=true;
        }
    }
    public void freshStart(){
        energyLevel=0;
        hungerLevel=10;

    }

}
