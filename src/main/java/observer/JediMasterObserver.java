package observer;

import abstractfactory.JediMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class JediMasterObserver {

    private JediMaster jediMaster;

    public JediMasterObserver(JediMaster jediMaster) {
        this.jediMaster = jediMaster;
        jediMaster.attach(this);
    }

    public void update(){
        System.out.println(jediMaster.getName() + " is my master now!");
    }

}
