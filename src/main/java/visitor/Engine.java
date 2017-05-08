package visitor;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Engine implements StarshipPart {

    @Override
    public void accept(StarshipPartVisitor starshipPartVisitor) {
        starshipPartVisitor.visit(this);
    }

}
