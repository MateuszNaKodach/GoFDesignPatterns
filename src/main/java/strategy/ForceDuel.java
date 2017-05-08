package strategy;

import abstractfactory.JediMaster;
import abstractfactory.SithMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class ForceDuel {

    private ForceJudgmentStrategy forceJudgmentStrategy;

    public ForceDuel(ForceJudgmentStrategy forceJudgmentStrategy) {
        this.forceJudgmentStrategy = forceJudgmentStrategy;
    }

    public void setForceJudgmentStrategy(ForceJudgmentStrategy forceJudgmentStrategy) {
        this.forceJudgmentStrategy = forceJudgmentStrategy;
    }

    void selectWinner() {
        forceJudgmentStrategy.selectWinner(new JediMaster("Yoda"), new SithMaster("Exar Kun"));
    }
}
