package observer;

import abstractfactory.JediMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        JediAcademy jediAcademy = new JediAcademy(new JediMaster());
        jediAcademy.changeMaster("Luke Skywalker");

        new JediMasterObserver(jediAcademy.getJediMaster());
        new JediMasterObserver(jediAcademy.getJediMaster());

        jediAcademy.getJediMaster().notifyAllObservers();

        new JediMasterObserver(jediAcademy.getJediMaster());
        new JediMasterObserver(jediAcademy.getJediMaster());
        new JediMasterObserver(jediAcademy.getJediMaster());

        jediAcademy.changeMaster("Darth Sidious");
    }
}
