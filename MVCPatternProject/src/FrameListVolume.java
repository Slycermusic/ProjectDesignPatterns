import java.awt.Frame;
import java.awt.List;
 
public class FrameListVolume extends PlayerView {
    private Frame frame = null;
    private List listPlayer = null;
 
    public FrameListVolume(PlayerController controller, int attaque, int defense, int pv){
        super(controller); 
 
        buildFrame(attaque, defense, pv);
    }
 
    private void buildFrame(int attaque, int defense, int pv) {
        frame = new Frame();

        listPlayer = new List();
        listPlayer.add(Integer.toString(attaque));
        listPlayer.add(Integer.toString(defense));
        listPlayer.add(Integer.toString(pv));
        frame.add(listPlayer);

        frame.setTitle("JFrameListVolume");
        frame.pack();
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