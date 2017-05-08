package abstractfactory;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ForceUserFactoryProducer forceUserFactoryProducer = new ForceUserFactoryProducer();
        ForceUserAbstractFactory forceUserAbstractFactory = null;
        forceUserAbstractFactory = forceUserFactoryProducer.getFactory(Fraction.JEDI);

        System.out.println(forceUserAbstractFactory.getMaster().getName());
        System.out.println(forceUserAbstractFactory.getApprentice().getName());

        forceUserAbstractFactory = forceUserFactoryProducer.getFactory(Fraction.SITH);

        System.out.println(forceUserAbstractFactory.getMaster().getName());
        System.out.println(forceUserAbstractFactory.getApprentice().getName());
    }
}
