package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class JediMaster implements ForceUser {
    String name = "Jedi Master";

    public String getName() {
        return name;
    }

    @Override
    public void useForces() {

    }
}
