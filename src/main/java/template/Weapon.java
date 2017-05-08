package template;

/**
 * Created by Mateusz on 08.05.2017.
 */
public abstract class Weapon {

    public final void prepareToUse() {
        construct();
        reload();
        turnOn();
    }

    abstract protected void construct();

    abstract protected void reload();

    abstract protected void turnOn();
}
