import javax.swing.event.EventListenerList;

public class PlayerModel {
    private static int attaque;
    private static int defense;
    private static int pv;

    private int x, y, width, height, velocity = 2;

    private EventListenerList listeners;

    public PlayerModel(int attaque, int defense, int pv){
        this.attaque = attaque;
        this.defense = defense;
        this.pv = pv;

        this.x = 25;
        this.y = 25;
        this.width = 50;
        this.height = 50;

        this.listeners = new EventListenerList();
    }

    public int getX() {return x;}
    public int getY() {return y;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}

    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public void setWidth(int width) {this.width = width;}
    public void setHeight(int height) {this.height = height;}

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
 
    public void addPlayerStatListener(PlayerListener listener){
        listeners.add(PlayerListener.class, listener);
    }
    public void removePlayerStatListener(PlayerListener l){listeners.remove(PlayerListener.class, l);}

    public void playerStatChanged(){
        PlayerListener[] listenerList = (PlayerListener[])listeners.getListeners(PlayerListener.class);

        for(PlayerListener listener : listenerList){
            listener.playerStatChanged(new PlayerStatChangedEvent(this, getAttaque(), getDefense(), getPv()));
        }
    }
    
    
}