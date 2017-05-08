package state;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        RockContext rockContext = new RockContext();
        ForceImpactState forceImpactState = new ForceImpactState();
        CrashedState crashedState = new CrashedState();

        forceImpactState.doAction(rockContext);
        crashedState.doAction(rockContext);

    }

}
