package protytpe;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        PlanetCache.loadCache();

        System.out.println(PlanetCache.getPlanet("Coruscant").getName());
        System.out.println(PlanetCache.getPlanet("Yavin IV").getName());
    }
}
