package proxy;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class StarshipProxy implements Starship {

    private String starshipId;
    private Starship realStarship;

    public StarshipProxy(String starshipId) {
        this.starshipId = starshipId;
    }


    //Starship is not preparing to start if it's not needed
    @Override
    public void start() {
        if(realStarship == null)
            realStarship = new StarshipImpl(starshipId); //only for proxy pattern

        realStarship.start();
    }
}
