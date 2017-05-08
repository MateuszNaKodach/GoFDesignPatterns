package strategy;

import abstractfactory.JediMaster;
import abstractfactory.SithMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class SithAllyForceStrategy implements ForceJudgmentStrategy {

    @Override
    public void selectWinner(JediMaster jediMaster, SithMaster sithMaster) {
        System.out.println(sithMaster.getName() + " is the winner! ");
    }
}
