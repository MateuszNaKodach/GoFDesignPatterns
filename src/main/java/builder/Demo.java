package builder;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiiPizzaBuilder = new HawaiiPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiiPizzaBuilder);
        waiter.constructPizza();

        System.out.println(waiter.getPizza());

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        System.out.println(waiter.getPizza());

    }
}
