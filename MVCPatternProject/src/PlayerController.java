import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class PlayerController implements ActionListener {
    public PlayerView fieldView = null;
    public PlayerView listView = null;

    private PlayerModel model = null;

    public PlayerController(PlayerModel model){
        this.model = model;
 
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_Z) {

        }   else if (key == KeyEvent.VK_Q) {

        }   else if (key == KeyEvent.VK_S) {

        }   else if (key == KeyEvent.VK_D) {

        }
    }

    public void KeyReleased(KeyEvent e) {

    }

}