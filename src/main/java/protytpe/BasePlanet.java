package protytpe;

/**
 * Created by Mateusz on 08.05.2017.
 */
public abstract class BasePlanet implements Planet, Cloneable {

    protected String name;

    @Override
    public String getName() {
        return name;
    }

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return object;
    }
}
