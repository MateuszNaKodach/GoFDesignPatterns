package decorator;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
