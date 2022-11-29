import java.util.EventObject;

public class PlayerStatChangedEvent extends EventObject{
    private int newAttaque;
    private int newDefense;
    private int newPv;

    public PlayerStatChangedEvent(Object source, int newAttaque, int newDefense, int newPv){
        super(source);
 
        this.newAttaque = newAttaque;
        this.newDefense = newDefense;
        this.newPv = newPv;
    }
 
    public int getNewAttaque(){
        return newAttaque;
    }
    public int getNewDefense(){
        return newDefense;
    }

    public int getNewPv(){
        return newPv;
    }
}