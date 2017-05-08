package state;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class CrashedState implements RockState {

    @Override
    public void doAction(RockContext context) {
        System.out.println("The rock is crashed by force!");
        context.setRockState(this);
    }
}
