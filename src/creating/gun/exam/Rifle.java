package creating.gun.exam;

public class Rifle extends Gun {
    private final String handle;
    private final String muzzle;
    private final String corpus;

    public Rifle(CreateGun creatingGun, String handle, String muzzle, String corpus) {
        super(creatingGun);
        this.handle = handle;
        this.muzzle = muzzle;
        this.corpus = corpus;
    }

    public void createGun() {
        creatingGun.createGun(handle, muzzle, corpus);
    }
}
