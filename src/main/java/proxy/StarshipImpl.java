package proxy;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class StarshipImpl implements Starship {

    private String id;

    public StarshipImpl(String id) {
        this.id = id;
        prepareToStart();
    }

    @Override
    public void start() {
        System.out.println("StarshipImpl " + id + " is started!");
    }

    private void prepareToStart(){
        System.out.println("StarshipImpl " + id + " is preparing to start...");
    }
}
