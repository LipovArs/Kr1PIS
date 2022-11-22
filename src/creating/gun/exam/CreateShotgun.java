package creating.gun.exam;

public class CreateShotgun implements CreateGun {
    @Override
    public void createGun(String handle, String muzzle, String corpus) {
        System.out.println("The shotgun was created with materials: "
                + handle + " " + muzzle + " " + corpus);
    }
}
