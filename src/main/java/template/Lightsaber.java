package template;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Lightsaber extends Weapon {

    @Override
    protected void construct() {
        System.out.println("The jedi construct his weapon by the force.");
    }

    @Override
    protected void reload() {
        System.out.println("The jedi put crystal to his lightsaber!");
    }

    @Override
    protected void turnOn() {
        System.out.println("Bzzzz...");
    }
}
