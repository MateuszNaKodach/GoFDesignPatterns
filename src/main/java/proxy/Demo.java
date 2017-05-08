package proxy;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Starship starship = new StarshipImpl("001");
        Starship starshipProxy = new StarshipProxy("001");

        System.out.println("\n Simple starship start:");
        starship.start();

        System.out.println("\n Proxy starship start:");
        starshipProxy.start();
    }
}
