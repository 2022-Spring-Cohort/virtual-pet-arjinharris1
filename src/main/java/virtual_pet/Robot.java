package virtual_pet;

public class Robot extends virtualPet {
 protected int oilLevel;
 protected int batteryLevel;

    public Robot(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage, int oilLevel, int batteryLevel) {
        super(name, realOrRobot, isSpoiled, isDeadOrRampage);
        this.oilLevel = oilLevel;
        this.batteryLevel = batteryLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
    public String getName(){
        return name;
    }


    @Override
    public void tick() {
        oilLevel=oilLevel-2;
        batteryLevel= batteryLevel-2;
    }

    @Override
    public void play() {
    if(isSpoiled){
       batteryLevel= batteryLevel-3;
    }
        else {
            batteryLevel=batteryLevel-5;
    }
    }

    @Override
    public void getStatus() {
        System.out.println("My name is " + getName() + "\nMy Battery level is " + batteryLevel +
                "\nMy  Oil level is " + oilLevel + "\n\n");
    }

    @Override
    public void killPetOrRampage() {
        if(batteryLevel<1){
            isDeadOrRampage=true;
        }
        if(oilLevel<1){
            isDeadOrRampage=true;
        }
    }

    public void charge(){
        batteryLevel=batteryLevel+5;
    }
    public void oil(){
        oilLevel=oilLevel+5;
    }


    @Override
    public void freshStart() {
        batteryLevel=15;
        oilLevel=15;
    }

    @Override
    public void feed() {
        System.out.println("I am a robot you cannot feed me");
    }

    @Override
    public void snack() {
        System.out.println("I am a robot you cannot feed me");
    }
}
