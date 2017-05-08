package memento;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class DeathStarPlan {

    private String state = "The Death Star";


    public DeathStarPlan() {
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento saveStateToMemento() {
        return new Memento(state);
    }

    void loadStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
