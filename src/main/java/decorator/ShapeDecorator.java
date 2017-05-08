package decorator;

/**
 * Created by Mateusz on 08.05.2017.
 */
public abstract class ShapeDecorator implements Shape {

    protected final Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
