package command;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Push implements Force {
    @Override
    public void use() {
        System.out.println("Push!");
    }
}
