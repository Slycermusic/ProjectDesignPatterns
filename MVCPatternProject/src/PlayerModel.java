import javax.swing.event.EventListenerList;

public class PlayerModel {
    private static int attaque;
    private static int defense;
    private static int pv;

    private EventListenerList listeners;



    public PlayerModel(int attaque, int defense, int pv){
        this.attaque = attaque;
        this.defense = defense;
        this.pv = pv;
 
        this.listeners = new EventListenerList();
    }

    public static int getAttaque() {
        return attaque;
    }
    public static int getDefense() {
        return defense;
    }
    public static int getPv() {
        return pv;
    }

 
    public void setPlayerStat(int attaque, int defense, int pv) {
        this.attaque = attaque;
        this.defense = defense;
        this.pv = pv;

        playerStatChanged();
    }
 
    public void addAttaqueListener(PlayerListener listener){
        listeners.add(PlayerListener.class, listener);
    }
    public void removeAttaqueListener(PlayerListener l){listeners.remove(PlayerListener.class, l);}

    public void addDefenseListener(PlayerListener listener){
        listeners.add(PlayerListener.class, listener);
    }
    public void removeDefenseListener(PlayerListener l){listeners.remove(PlayerListener.class, l);}

    public void addPvListener(PlayerListener listener){
        listeners.add(PlayerListener.class, listener);
    }
    public void removePvListener(PlayerListener l){listeners.remove(PlayerListener.class, l);}

    public void playerStatChanged(){
        PlayerListener[] listenerList = (PlayerListener[])listeners.getListeners(PlayerListener.class);

        for(PlayerListener listener : listenerList){
            listener.playerStatChanged(new PlayerStatChangedEvent(this, getAttaque(), getDefense(), getPv()));
        }
    }
    
    
}