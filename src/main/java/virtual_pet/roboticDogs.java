package virtual_pet;

public class roboticDogs extends Robot implements walkable {
    public roboticDogs(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage, int oilLevel, int batteryLevel) {
        super(name, realOrRobot, isSpoiled, isDeadOrRampage, oilLevel, batteryLevel);
    }

    @Override
    public void walk() {
        oilLevel=oilLevel-2;
    }
}
