package template;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Bowcaster extends Weapon {

    @Override
    protected void construct() {
        System.out.println("The wookie made his bowcaster.");
    }

    @Override
    protected void reload() {
        System.out.println("The wookie put an aroow to the bowcaster.");
    }

    @Override
    protected void turnOn() {
        System.out.println("Puuuf...");
    }
}
