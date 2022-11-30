import java.awt.Frame;
import java.awt.List;
 
public class FrameListVolume extends PlayerView {
    private Frame frame = null;
    private List listPlayer = null;
 
    public FrameListVolume(MainController controller, int attaque, int defense, int pv){
        super(controller); 
 
        buildFrame(attaque, defense, pv);
    }
 
    private void buildFrame(int attaque, int defense, int pv) {
        frame = new Frame();
        frame.setTitle("JFrameListVolume");
        frame.pack();
        frame.setSize(480,480);
        listPlayer = new List();
        listPlayer.add(Integer.toString(attaque));
        listPlayer.add(Integer.toString(defense));
        listPlayer.add(Integer.toString(pv));
        frame.add(listPlayer);



    }
 
    @Override
    public void close() {
        frame.dispose();
    }
 
    @Override
    public void display() {
        frame.setVisible(true);
    }
 
    public void playerStatChanged(PlayerStatChangedEvent event) {
        listPlayer.add(Integer.toString(event.getNewAttaque()));
        listPlayer.add(Integer.toString(event.getNewDefense()));
        listPlayer.add(Integer.toString(event.getNewPv()));
    }
}