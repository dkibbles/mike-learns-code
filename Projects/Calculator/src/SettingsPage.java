import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsPage implements ActionListener {

    JFrame SFRAME;
    JPanel MAIN;

    String[] SETTINGS_BUTTONS = {"C"};
    String[] LABLES;
    String[] COMBOBOXS;
    
    HashMap<String,JButton> BUTTON_INPUTS;
    HashMap<String, JLabel> LABEL_INPUTS;

    SettingsPage() {

         SFRAME = new JFrame("Settings");
         MAIN = new JPanel();
         BUTTON_INPUTS = new HashMap<>();

         SFRAME.getContentPane().setPreferredSize(new Dimension(295, 304));
         SFRAME.pack();
         SFRAME.setResizable(false);
         SFRAME.setLayout(null);
         SFRAME.add(MAIN);
         SFRAME.setVisible(true);
         SFRAME.getContentPane().setBackground(Color.decode("#b1bec5"));

         MAIN.setBounds(10,10, 275, 284);
         MAIN.setBackground(Color.decode("#343b4a"));
         MAIN.setLayout(null);

         for(int i = 0; i < SETTINGS_BUTTONS.length; i++) {
			BUTTON_INPUTS.put(SETTINGS_BUTTONS[i], new JButton(SETTINGS_BUTTONS[i]));
		}

        
        BUTTON_INPUTS.forEach((name, button) -> {
			MAIN.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
			button.setFocusable(false);
		});

        BUTTON_INPUTS.get("C").setBounds(245, 5, 25, 25);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    
        BUTTON_INPUTS.forEach((name, button) -> {
            if(e.getSource() == button) {
                switch(name) {
                    case "C":
                        SFRAME.dispose();
                        new Calculator();
        
                }
            }
        });
    }

}
