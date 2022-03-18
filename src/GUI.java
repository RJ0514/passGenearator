import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() {
        super("BorderLayout");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setup();
        setVisible(true);
    }
    public void setup(){
        JPanel titleLabel = new JPanel();
        titleLabel.setLayout(new FlowLayout());

        JLabel tempLabel = new JLabel("TITLE HERE");
        tempLabel.setFont(tempLabel.getFont().deriveFont(20.0F));
        titleLabel.add(tempLabel);
        add(titleLabel,BorderLayout.NORTH);

        //Center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        JCheckBox specialChar = new JCheckBox("Special Characters");
        centerPanel.add(specialChar);
        JCheckBox addNum = new JCheckBox("Add Numbers");
        centerPanel.add(addNum);

        tempLabel = new JLabel("Number of Characters:");
        JTextField numChar = new JTextField(5);
        centerPanel.add(tempLabel);
        centerPanel.add(numChar);
        add(centerPanel,BorderLayout.CENTER);

        //South
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        JButton btnGenerate = new JButton("Generate Password");
        southPanel.add(btnGenerate);

        tempLabel = new JLabel("Temp String");
        tempLabel.setVisible(false);
        southPanel.add(tempLabel);
        add(southPanel,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        GUI testGUI = new GUI();


    }
}
