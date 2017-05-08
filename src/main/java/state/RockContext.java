package state;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class RockContext {

    private RockState rockState;

    public RockContext() {
    }

    public void setRockState(RockState rockState) {
        this.rockState = rockState;
    }

    public RockState getRockState() {
        return rockState;
    }
}
