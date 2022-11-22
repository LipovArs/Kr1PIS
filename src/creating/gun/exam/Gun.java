package creating.gun.exam;

public abstract class Gun {
    protected CreateGun creatingGun;

    protected Gun(CreateGun creatingGun) {
        this.creatingGun = creatingGun;
    }

    public abstract void createGun();
}
