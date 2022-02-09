package virtual_pet;

public class Real extends virtualPet {

    protected int energyLevel;
    protected int hungerLevel;
    protected int thirst;
    protected boolean isOverWeight;




    public Real(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage, int energyLevel, int hungerLevel, int thirst) {
        super(name, realOrRobot, isSpoiled, isDeadOrRampage);
        this.energyLevel = energyLevel;
        this.hungerLevel = hungerLevel;
        this.thirst = thirst;
        this.isOverWeight = false;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirst() {
        return thirst;
    }

    public String getPetName() {
        return name;
    }

    public void tick() {

        energyLevel = energyLevel + 2;
        hungerLevel = hungerLevel - 2;
    }

    public void feed() {
        hungerLevel = hungerLevel + 5;

    }

    public void snack() {
        hungerLevel = hungerLevel + 2;
    }

    public void walk() {
        if (isOverWeight) {
            energyLevel = energyLevel - 3;
            hungerLevel = hungerLevel - 3;
        } else {
            energyLevel = energyLevel - 4;
            hungerLevel = hungerLevel - 4;
        }
    }

    public void play() {
        if (isSpoiled) {
            energyLevel = energyLevel - 2;
        } else {
            energyLevel = energyLevel - 5;
        }
        hungerLevel = hungerLevel - 1;

    }

    public void getStatus() {
        System.out.println("My name is " + getPetName() + "\nMy energy level is " + energyLevel +
                "\nMy Hungry level is " + hungerLevel + "\n\n");

    }

    @Override
    public void killPetOrRampage() {
        if(hungerLevel<1){
            isDeadOrRampage=true;
        }
        if(energyLevel>15){
            isDeadOrRampage=true;
        }
    }

    public void freshStart() {
        energyLevel = 0;
        hungerLevel = 10;

    }
}

