package memento;

/**
 * Created by Mateusz on 08.05.2017.
 */
public class Demo {

    public static void main(String[] args) {
        DeathStarPlan deathStarPlan = new DeathStarPlan();
        EmpireArchives empireArchives = new EmpireArchives();

        deathStarPlan.setState("The Death Star, known officially as the DS-1 Orbital Battle Station, also known as the" +
                " Death Star I, the First Death Star, Project Stardust internally");

        empireArchives.save(deathStarPlan.saveStateToMemento());

        deathStarPlan.setState("The Death Star, known officially as the DS-1 Orbital Battle Station, also known");

        empireArchives.save(deathStarPlan.saveStateToMemento());

        System.out.println(empireArchives.load(0).getState());
        System.out.println(empireArchives.load(1).getState());
    }

}
