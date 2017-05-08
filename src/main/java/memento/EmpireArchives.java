package memento;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class EmpireArchives {
    private List<Memento> savedDeathStarPlans = new LinkedList<>();

    public void save(Memento memento) {
        savedDeathStarPlans.add(memento);
    }

    public Memento load(int index) {
        return savedDeathStarPlans.get(index);
    }
}
