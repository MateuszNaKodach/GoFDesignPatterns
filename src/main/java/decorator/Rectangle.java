package decorator;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
