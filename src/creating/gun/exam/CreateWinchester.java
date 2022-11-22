package creating.gun.exam;

public class CreateWinchester implements CreateGun {
    @Override
    public void createGun(String handle, String muzzle, String corpus) {
        System.out.println("The winchester was created with materials: "
                + handle + " " + muzzle + " " + corpus);
    }
}
