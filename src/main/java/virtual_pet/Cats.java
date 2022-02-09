package virtual_pet;

public class Cats extends Real {


    public Cats(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage, int energyLevel, int hungerLevel, int thirst) {
        super(name, realOrRobot, isSpoiled, isDeadOrRampage, energyLevel, hungerLevel, thirst);
    }
    @Override
    public void killPetOrRampage() {
        if (hungerLevel < 1) {
            isDeadOrRampage = true;
        }
        if (energyLevel > 15) {
            isDeadOrRampage = true;
        }
    }
}