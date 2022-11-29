public abstract class PlayerView implements PlayerListener{
    private MainController controller = null;

    public PlayerView(MainController controller){
        super();
 
        this.controller = controller;
    }
 
    public final MainController getController(){
        return controller;
    }
 
    public abstract void display();
    public abstract void close();
}