public class MainController {

    public PlayerView fieldView = null;
    public PlayerView listView = null;

    private PlayerModel model = null;

    public MainController(PlayerModel model){
        this.model = model;
 
        fieldView = new JFrameFieldVolume(this, model.getAttaque(), model.getDefense(), model.getPv());
        listView = new FrameListVolume(this, model.getAttaque(), model.getDefense(), model.getPv());
 
        addListenersToModel();
    }

    private void addListenersToModel() {
        model.addPlayerStatListener(listView);
    }
 
    public void displayViews(){
        fieldView.display();
        listView.display();

    }

    public void closeViews(){
        fieldView.close();
        listView.close();
    }
 
    public void notifyPlayerStatChanged(int attaque, int defense, int pv){
        model.setPlayerStat(attaque, defense, pv);
    }

}