package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class SithFactory extends ForceUserAbstractFactory{

    @Override
    ForceUser getApprentice() {
        return new SithApprentice();
    }

    @Override
    ForceUser getMaster() {
        return new SithMaster();
    }
}
