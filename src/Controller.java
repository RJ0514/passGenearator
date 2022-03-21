import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener
{
    private final GUI view;
    private final model source;

    public Controller(){
        view = new GUI();
        source = new model();
        view.setActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Generate Password")) {
            source.setbInt(view.bNum());
            source.setStrSpecialChar(view.sChar());
            source.setPassLength(view.charNum());
            source.generatePassword();

            view.displayPassword(source.getPassword());
        }
    }

    public static void main(String[] args) {
        new Controller();
    }
}
