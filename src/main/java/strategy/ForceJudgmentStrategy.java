package strategy;

import abstractfactory.JediMaster;
import abstractfactory.SithMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public interface ForceJudgmentStrategy {

    void selectWinner(JediMaster jediMaster, SithMaster sithMaster);

}
