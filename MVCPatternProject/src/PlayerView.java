public abstract class PlayerView implements PlayerListener{
    private PlayerController controller = null;

    public PlayerView(PlayerController controller){
        super();
 
        this.controller = controller;
    }
 
    public final PlayerController getController(){
        return controller;
    }
 
    public abstract void display();
    public abstract void close();
}