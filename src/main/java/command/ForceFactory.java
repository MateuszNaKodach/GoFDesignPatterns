package command;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class ForceFactory {

    static Force getForce(ForceKind forceKind){
        switch (forceKind) {
            case GRIP: return new Grip();
            case PULL: return new Pull();
            case PUSH: return new Push();
            default: throw new IllegalArgumentException();
        }
    }
}
