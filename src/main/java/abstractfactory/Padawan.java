package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Padawan implements ForceUser {
    private String name = "Padawan";

    public String getName() {
        return name;
    }

    @Override
    public void useForces() {

    }
}
