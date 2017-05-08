package strategy;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        ForceDuel forceDuel = new ForceDuel(new JediAllyForceStrategy());
        forceDuel.selectWinner();

        forceDuel.setForceJudgmentStrategy(new SithAllyForceStrategy());
        forceDuel.selectWinner();
    }
}
