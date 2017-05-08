package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class SithMaster implements ForceUser {
    private String name = "Sith Master";

    public String getName() {
        return name;
    }

    @Override
    public void useForces() {

    }
}
