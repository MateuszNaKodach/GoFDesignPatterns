package visitor;

/**
 * Created by Mateusz on 08.05.2017.
 */
public interface StarshipPart {
   void accept(StarshipPartVisitor starshipPartVisitor);
}
