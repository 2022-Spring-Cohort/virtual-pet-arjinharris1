package virtual_pet;

public class Dogs extends Real implements walkable{

    int cageCleanLevel;

    public Dogs(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage, int energyLevel, int hungerLevel, int thirst, int cageCleanLevel) {
        super(name, realOrRobot, isSpoiled, isDeadOrRampage, energyLevel, hungerLevel, thirst);
        this.cageCleanLevel = cageCleanLevel;
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
    @Override
    public void walk() {
        cageCleanLevel=10;
    }
}
