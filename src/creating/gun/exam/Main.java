package creating.gun.exam;

public class Main {
    public static void main(String[] args) {
        Gun shotgun = new Rifle(new CreateShotgun(),
                "wooden handle", "iron muzzle", "metallic corpus");
        Gun winchester = new Rifle(new CreateWinchester(),
                "iron handle", "wooden muzzle", "plastic corpus");

        shotgun.createGun();
        winchester.createGun();

    }
}
