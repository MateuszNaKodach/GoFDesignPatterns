package abstractfactory;

import observer.JediMasterObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class JediMaster implements ForceUser{

    private String name = "Jedi Master";
    private List<JediMasterObserver> observers = new ArrayList<>();


    public JediMaster() {
    }

    public JediMaster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyAllObservers();
    }

    public void attach(JediMasterObserver jediMasterObserver){
        observers.add(jediMasterObserver);
    }

    public void notifyAllObservers(){
        for(JediMasterObserver observer: observers){
            observer.update();
        }
    }

    @Override
    public void useForces() {

    }
}
