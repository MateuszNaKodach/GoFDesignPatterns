package state;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class ForceImpactState implements RockState {

    @Override
    public void doAction(RockContext context) {
        System.out.println("Jedi is using the force on the rock...");
        context.setRockState(this);
    }
}
