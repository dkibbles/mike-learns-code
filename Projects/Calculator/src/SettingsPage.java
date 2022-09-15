import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Dimension;

public class SettingsPage {

    JFrame FRAME;
    JPanel MAIN;

    String[] SETTINGS_BUTTONS;
    String[] LABLES;
    String[] COMBOBOXS;
    
    HashMap<String,JButton> BUTTON_INPUTS;
    HashMap<String, JLabel> LABEL_INPUTS;
    HashMap<String, JComboBox> COMBOBOX_INPUTS;


    SettingsPage() {

         FRAME = new JFrame("Settings");
         MAIN = new JPanel();

         FRAME.getContentPane().setPreferredSize(new Dimension(295, 304));
         FRAME.add(MAIN);

         MAIN.setBounds(10,10, 285, 294);
         MAIN.setBackground(Color.LIGHT_GRAY);

    }

}
