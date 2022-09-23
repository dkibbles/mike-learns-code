import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SettingsPage implements ActionListener {

    String[] settingsButtons = {"C"};
    HashMap<String,JButton> buttonInputs;
    JPanel settings, settingsButtonsPanel;

    SettingsPage() {

        settings = new JPanel();
        settingsButtonsPanel = new JPanel();
        buttonInputs = new HashMap<>();

        settings.setBounds(0, 0, 295, 304);
		settings.setBackground(Color.decode("#b1bec5"));
		settings.setVisible(true);
		settings.setLayout(null);
		settings.add(settingsButtonsPanel);

		settingsButtonsPanel.setBounds(10, 10, 275, 284);
        settingsButtonsPanel.setBackground(Color.decode("#343b41"));
		settingsButtonsPanel.setVisible(true);
        settingsButtonsPanel.setLayout(null);

        for(int i = 0; i < settingsButtons.length; i++) {
			buttonInputs.put(settingsButtons[i], new JButton(settingsButtons[i]));
		}

        
        buttonInputs.forEach((name, button) -> {
			settingsButtonsPanel.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
			button.setFocusable(false);
			
		});

		buttonInputs.get("C").setBounds(245, 5, 25, 25);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
