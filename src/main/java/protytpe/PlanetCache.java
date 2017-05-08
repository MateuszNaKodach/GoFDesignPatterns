package protytpe;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class PlanetCache {
    private static Map<String, Planet> planetMap = new HashMap<>();

    public static Planet getPlanet(String name){
        Planet cachedPlanet = planetMap.get(name);
        return (BasePlanet) cachedPlanet.clone();
    }

    public static void loadCache(){
        Planet planet = new Coruscant();
        planetMap.put(planet.getName(),planet);
        planet = new YavinIV();
        planetMap.put(planet.getName(),planet);
    }

}
