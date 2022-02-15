package virtual_pet;

public abstract class virtualPet {

    protected String name;
    protected String RealOrRobot;
    protected boolean isSpoiled;
    protected boolean isDeadOrRampage;

    public virtualPet(String name, String realOrRobot, boolean isSpoiled, boolean isDeadOrRampage) {

        this.name = name;
        RealOrRobot = realOrRobot;
        this.isSpoiled = isSpoiled;
        this.isDeadOrRampage = isDeadOrRampage;
    }

    public String getName() {
        return name;
    }

    public String getRealOrRobot() {
        return RealOrRobot;
    }

    public boolean isSpoiled() {
        return isSpoiled;
    }

    public boolean isDeadOrRampage() {
        return isDeadOrRampage;
    }


    public abstract void tick();
    public abstract void play();
    public abstract void getStatus();
    public abstract void killPetOrRampage();
    public abstract void freshStart();
    public abstract void feed();
    public abstract void snack();

}