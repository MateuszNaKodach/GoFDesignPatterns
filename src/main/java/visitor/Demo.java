package visitor;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.accept(new WarStarshipPartVisitor());
    }
}
