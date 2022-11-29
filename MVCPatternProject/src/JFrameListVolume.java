import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
public class JFrameListVolume extends PlayerView {
    private JFrame frame = null;
    private JPanel contentPanel = null;
    private JList listVolume = null;


    private JScrollPane scrollVolume = null;

    private DefaultListModel jListModel = null;
 
    public JFrameListVolume(PlayerController controller, int attaque, int defense, int pv){
        super(controller); 
 
        buildFrame(attaque, defense, pv);
    }
 
    private void buildFrame(int attaque, int defense, int pv) {
        frame = new JFrame();
 
        contentPanel = new JPanel();

        jListModel = new DefaultListModel();
        jListModel.addElement(attaque);
        jListModel.addElement(defense);
        jListModel.addElement(pv);

        listVolume = new JList(jListModel);
 
        scrollVolume = new JScrollPane(listVolume);
        contentPanel.add(scrollVolume);
 
        frame.setContentPane(contentPanel);
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
        jListModel.addElement(event.getNewAttaque());
        jListModel.addElement(event.getNewDefense());
        jListModel.addElement(event.getNewPv());

    }
}