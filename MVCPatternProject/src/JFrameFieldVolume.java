import main.factory.AbstractFactory;
import main.factory.FactoryProducer;
import main.factory.Shape;
import main.factory.map.Grass;
import main.factory.map.MapFactory;
import main.tileMap.TileMapModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
 
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatter;
 
public class JFrameFieldVolume extends PlayerView implements ActionListener {
    private static JFrame frame = null;
    private static JPanel contentPanel = null;
    private static JFormattedTextField field = null;
    private static JFormattedTextField field1 = null;
    private static JFormattedTextField field2 = null;
    private static JButton button = null;
    private static NumberFormat format = null;
 
    public JFrameFieldVolume(MainController controller, int attaque, int defense, int pv){
        super(controller);
        buildFrame(attaque, defense, pv);
    }
 
    private void buildFrame(int attaque, int defense, int pv) {
        frame = new JFrame();
        frame.pack();
        frame.setSize(480,480);
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
        frame.setVisible(true);
        frame.setTitle("JFrameFieldVolume");

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

        AbstractFactory shapeFactory = FactoryProducer.getFactory(1);
        Shape shape1 = shapeFactory.getShape("GRASS");
        shape1.draw();

        getController().notifyPlayerStatChanged(Integer.parseInt(field.getValue().toString()), Integer.parseInt(field1.getValue().toString()), Integer.parseInt(field2.getValue().toString()));
    }
}