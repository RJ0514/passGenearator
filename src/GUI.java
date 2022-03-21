import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JLabel passResult;
    private JCheckBox specialChar;
    private JCheckBox addNum;
    private JTextField numChar;
    JButton btnGenerate;

    public GUI() {
        super("BorderLayout");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setup();
        setResizable(false);
        setVisible(true);
    }
    public void setup(){
        JPanel titleLabel = new JPanel();
        titleLabel.setLayout(new FlowLayout());

        JLabel tempLabel = new JLabel("Password Generator");
        tempLabel.setFont(tempLabel.getFont().deriveFont(20.0F));
        titleLabel.add(tempLabel);
        add(titleLabel,BorderLayout.NORTH);

        //Center
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        specialChar = new JCheckBox("Special Characters");
        centerPanel.add(specialChar);
        addNum = new JCheckBox("Add Numbers");
        centerPanel.add(addNum);

        tempLabel = new JLabel("Number of Characters:");
        numChar = new JTextField(5);
        centerPanel.add(tempLabel);
        centerPanel.add(numChar);
        add(centerPanel,BorderLayout.CENTER);

        //South
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        btnGenerate = new JButton("Generate Password");

        southPanel.add(btnGenerate);

        passResult = new JLabel("Temp String");
        passResult.setVisible(false);
        southPanel.add(passResult);
        add(southPanel,BorderLayout.SOUTH);

    }

    /*Getter to display the password.*/
    public void displayPassword(String pw){
        passResult.setText(pw);
        passResult.setVisible(true);
    }

    public void ActionListener(){

    }

    /*Conditions to check if checkbox is selected.*/
    public boolean sChar(){  // Special Characters
        return specialChar.isSelected();
    }

    public boolean bNum(){  //Numbers
        return addNum.isSelected();
    }

    public int charNum(){ // Number of Characters
        return Integer.parseInt(numChar.getText());
    }

    public void setActionListener(ActionListener listener) {
        btnGenerate.addActionListener(listener);
    }
}
