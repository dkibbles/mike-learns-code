import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Dimension;

public class SettingsPage {

    JFrame SFRAME;
    JPanel MAIN;

    String[] SETTINGS_BUTTONS;
    String[] LABLES;
    String[] COMBOBOXS;
    
    HashMap<String,JButton> BUTTON_INPUTS;
    HashMap<String, JLabel> LABEL_INPUTS;
    HashMap<String, JComboBox> COMBOBOX_INPUTS;


    SettingsPage() {

         SFRAME = new JFrame("Settings");
         MAIN = new JPanel();

         SFRAME.getContentPane().setPreferredSize(new Dimension(295, 304));
         SFRAME.pack();
         SFRAME.setResizable(false);
         SFRAME.setLayout(null);
         SFRAME.add(MAIN);
         SFRAME.setVisible(true);
         SFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         SFRAME.getContentPane().setBackground(Color.decode("#b1bec5"));

         MAIN.setBounds(10,10, 275, 284);
         MAIN.setBackground(Color.decode("#343b4a"));

    }

}
