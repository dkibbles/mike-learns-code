import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class SettingsPage implements ActionListener {

    String[] settingsButtons = {"C","Save & Change"};
    String[] colorSettingsBox = {"Blue","Green","Red"};
    String[] fontSizeBox = {"12","16","20"};
    String[] fontColorBox = {"Blue","Green","Red"};
    JLabel colorSetting, fontSizeSetting, fontColorSetting;
    JComboBox colorSettings, fontSize, fontColor;
    HashMap<String,JButton> buttonInputs;
    JPanel settings, settingsButtonsPanel;


    SettingsPage() {

        settings = new JPanel();
        settingsButtonsPanel = new JPanel();
        colorSettings = new JComboBox<>(colorSettingsBox);
        fontSize = new JComboBox<>(fontSizeBox);
        fontColor = new JComboBox<>(fontColorBox);
        colorSetting = new JLabel("Color Scheme:");
        fontSizeSetting = new JLabel("Font Size:");
        fontColorSetting = new JLabel("Font Color:");
        buttonInputs = new HashMap<>();

        colorSettings.setBounds(20, 60, 65, 20);
        fontSize.setBounds(105, 60, 65, 20);
        fontColor.setBounds(190, 60, 65, 20);

        colorSettings.addActionListener(this);
        fontSize.addActionListener(this);
        fontColor.addActionListener(this);

        colorSetting.setFont(new Font("Comic Sans MS",Font.PLAIN,11));
        colorSetting.setForeground(new Color(255,255,255));
        colorSetting.setBounds(20, 40, 65, 20);

        fontSizeSetting.setFont(new Font("Comic Sans MS",Font.PLAIN,11));
        fontSizeSetting.setForeground(new Color(255,255,255));
        fontSizeSetting.setBounds(105, 40, 65, 20);

        fontColorSetting.setFont(new Font("Comic Sans MS",Font.PLAIN,11));
        fontColorSetting.setForeground(new Color(255,255,255));
        fontColorSetting.setBounds(190, 40, 65, 20);

        settings.setBounds(0, 0, 295, 304);
		settings.setBackground(Color.decode("#86b9b0"));
		settings.setVisible(true);
		settings.setLayout(null);
		settings.add(settingsButtonsPanel);

		settingsButtonsPanel.setBounds(10, 10, 275, 284);
        settingsButtonsPanel.setBackground(Color.decode("#042630"));
		settingsButtonsPanel.setVisible(true);
        settingsButtonsPanel.setLayout(null);
        settingsButtonsPanel.add(colorSettings);
        settingsButtonsPanel.add(fontSize);
        settingsButtonsPanel.add(fontColor);
        settingsButtonsPanel.add(colorSetting);
        settingsButtonsPanel.add(fontSizeSetting);
        settingsButtonsPanel.add(fontColorSetting);

        for(int i = 0; i < settingsButtons.length; i++) {
			buttonInputs.put(settingsButtons[i], new JButton(settingsButtons[i]));
		}

        
        buttonInputs.forEach((name, button) -> {
			settingsButtonsPanel.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#d0d6d6"));
			button.setFocusable(false);
			
		});

		buttonInputs.get("C").setBounds(245, 5, 25, 25);
        buttonInputs.get("Save & Change").setBounds(200, 300, 70, 25);

    }

    public void redColorScheme() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
    
}
