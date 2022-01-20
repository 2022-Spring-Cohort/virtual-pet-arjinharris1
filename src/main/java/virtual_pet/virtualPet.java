package virtual_pet;

public class virtualPet {
    private String petName;
    private int age;
    private String breed;
    private boolean isOverWeight;
    private boolean isSpoiled;
    private int hungerLevel;
    private int energyLevel;

    public virtualPet(String petName, int age, String breed, boolean isOverWeight, boolean isSpoiled, int hungerLevel, int energyLevel) {
        this.petName = petName;
        this.age = age;
        this.breed = breed;
        this.isOverWeight = isOverWeight;
        this.isSpoiled = isSpoiled;
        this.hungerLevel = hungerLevel;
        this.energyLevel = energyLevel;
    }

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

    public void tick(){
        energyLevel= energyLevel+20;
        hungerLevel= hungerLevel-20;
    }
    public void feed(){
        hungerLevel= hungerLevel+25;

    }
    public void snack(){
        hungerLevel=hungerLevel+5;
    }
    public void walk(){
        if(isOverWeight){
        energyLevel=energyLevel-30;
        hungerLevel= hungerLevel -30;
        }
        else{
            energyLevel=energyLevel-40;
            hungerLevel= hungerLevel -40;
        }
    }

    public void play(){
        if(isSpoiled ){
          energyLevel=energyLevel-20;
        }
        else {
            energyLevel = energyLevel - 50;
        }
        hungerLevel= hungerLevel- 10;

    }
    public String getStatus(virtualPet g){
        return "my energy level is "+ g.getEnergyLevel()+
                "\nMy Hungry level is " +g.getHungerLevel();
    }
}
