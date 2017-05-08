package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class JediFactory extends ForceUserAbstractFactory{

    @Override
    ForceUser getApprentice() {
        return new Padawan();
    }

    @Override
    ForceUser getMaster() {
        return new JediMaster();
    }
}
