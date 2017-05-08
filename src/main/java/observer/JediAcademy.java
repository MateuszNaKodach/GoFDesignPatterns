package observer;

import abstractfactory.ForceUser;
import abstractfactory.JediMaster;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class JediAcademy {

    private JediMaster jediMaster = new JediMaster();

    public JediAcademy(JediMaster jediMaster) {
        this.jediMaster = jediMaster;
    }

    public JediMaster getJediMaster() {
        return jediMaster;
    }

    void changeMaster(String masterName){
        jediMaster.setName(masterName);
    }


}
