package visitor;

import java.util.Arrays;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Starship implements StarshipPart {

    private StarshipPart[] parts = new StarshipPart[]{new Engine(), new Cannon(), new Hangar()};

    @Override
    public void accept(StarshipPartVisitor starshipPartVisitor) {
        starshipPartVisitor.visit(this);
        Arrays.stream(parts).forEach(part -> part.accept(starshipPartVisitor));
    }
}
