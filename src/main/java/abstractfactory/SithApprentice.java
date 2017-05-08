package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class SithApprentice implements ForceUser {
    String name = "Sith Apprentice";

    public String getName() {
        return name;
    }

    @Override
    public void useForces() {

    }
}
