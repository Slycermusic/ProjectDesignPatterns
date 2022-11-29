import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
 
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatter;
 
public class JFrameFieldVolume extends PlayerView implements ActionListener {
    private JFrame frame = null;
    private JPanel contentPanel = null;
    private JFormattedTextField field = null;
    private JFormattedTextField field1 = null;
    private JFormattedTextField field2 = null;
    private JButton button = null;
    private NumberFormat format = null;
 
    public JFrameFieldVolume(PlayerController controller, int attaque, int defense, int pv){
        super(controller);
        buildFrame(attaque, defense, pv);
    }
 
    private void buildFrame(int attaque, int defense, int pv) {
        frame = new JFrame();
 
        contentPanel = new JPanel();
 
        format = NumberFormat.getNumberInstance();
        format.setParseIntegerOnly(true);
        format.setGroupingUsed(false);        
        format.setMaximumFractionDigits(0);
        format.setMaximumIntegerDigits(3);

        field = new JFormattedTextField(format);
        field.setValue(attaque);

        ((DefaultFormatter)field.getFormatter()).setAllowsInvalid(false);
        contentPanel.add(field);

        field1 = new JFormattedTextField(format);
        field1.setValue(defense);

        ((DefaultFormatter)field1.getFormatter()).setAllowsInvalid(false);
        contentPanel.add(field1);

        field2 = new JFormattedTextField(format);
        field2.setValue(pv);

        ((DefaultFormatter)field2.getFormatter()).setAllowsInvalid(false);
        contentPanel.add(field2);
 
        button = new JButton("Mettre à jour");
        button.addActionListener(this);
        contentPanel.add(button);
 
        frame.setContentPane(contentPanel);
        frame.setTitle("JFrameFieldVolume");
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
        field.setValue(event.getNewAttaque());
        field1.setValue(event.getNewDefense());
        field2.setValue(event.getNewPv());
    }
 
    public void actionPerformed(ActionEvent arg0) {

//        if (test = true) {
//            int value = VolumeModel.getVolume();
//            value = value + 1;
//            System.out.println(value);
//        }
        getController().notifyPlayerStatChanged(Integer.parseInt(field.getValue().toString()), Integer.parseInt(field1.getValue().toString()), Integer.parseInt(field2.getValue().toString()));
    }
}