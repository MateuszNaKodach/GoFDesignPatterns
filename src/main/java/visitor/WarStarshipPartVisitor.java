package visitor;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class WarStarshipPartVisitor implements StarshipPartVisitor {

    @Override
    public void visit(Cannon cannon) {
        System.out.println("The cannon power is loading...");
    }

    @Override
    public void visit(Hangar hangar) {
        System.out.println("Fighters has left the hangar!");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Engines are turining on!");
    }

    @Override
    public void visit(Starship starship) {
        System.out.println("Starship is preparing to start!");
    }
}
