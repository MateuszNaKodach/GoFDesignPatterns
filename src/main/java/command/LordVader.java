package command;

import abstractfactory.ForceUser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class LordVader implements ForceUser {

    private List<Force> forcesAbilities = Arrays.asList(ForceFactory.getForce(ForceKind.GRIP), ForceFactory.getForce(ForceKind.PULL), ForceFactory.getForce(ForceKind.PUSH));

    @Override
    public String getName() {
        return "Lord Vader";
    }

    @Override
    public void useForces() {
        forcesAbilities.forEach(Force::use);
    }

}
