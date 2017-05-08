package template;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Weapon weapon = new Bowcaster();
        weapon.prepareToUse();
        weapon = new Lightsaber();
        weapon.prepareToUse();
    }
}
