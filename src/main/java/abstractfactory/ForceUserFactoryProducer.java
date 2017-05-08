package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class ForceUserFactoryProducer {

    ForceUserAbstractFactory getFactory(Fraction fraction){
        switch (fraction){
            case JEDI: return new JediFactory();
            case SITH: return new SithFactory();
            default: throw new IllegalArgumentException();
        }
    }
}
