import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener  {

	JFrame FRAME;
	JTextField DISPLAY_WINDOW;
	JPanel BUTTON_PANEL;
	JButton SETTINGS_PAGE;
	HashMap<String,JButton> INPUTS = new HashMap<String, JButton>();
	String[] CALC_BUTTONS = {"0","1","2","3","4","5","6","7","8","9","=","clr","+","-","*","/","."};
	double var1 = 0;
	double var2 = 0; 
	double result = 0;
	char operator;

	public Calculator() {

		FRAME = new JFrame("Calculator");
		DISPLAY_WINDOW = new JTextField();
		BUTTON_PANEL = new JPanel();
		SETTINGS_PAGE = new JButton("S");

		for(int i = 0; i < CALC_BUTTONS.length; i++) {
			INPUTS.put(CALC_BUTTONS[i], new JButton(CALC_BUTTONS[i]));
		}
		
		FRAME.getContentPane().setPreferredSize(new Dimension(295,304));
		FRAME.pack();
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setVisible(true);
		FRAME.setResizable(false);
		FRAME.setLayout(null);
		FRAME.add(BUTTON_PANEL);
		FRAME.add(DISPLAY_WINDOW);
		FRAME.add(SETTINGS_PAGE);
		FRAME.getContentPane().setBackground(Color.decode("#b1bec5"));
	
		DISPLAY_WINDOW.setBounds(35, 25, 225, 34);
		DISPLAY_WINDOW.setVisible(true);
		DISPLAY_WINDOW.setFont(new Font("Serif",Font.PLAIN, 16));

		BUTTON_PANEL.setBounds(10, 84, 275, 210);
		BUTTON_PANEL.setBackground(Color.decode("#343b4a"));
		BUTTON_PANEL.setLayout(null);

		SETTINGS_PAGE.setBounds(265, 5, 25, 25);
		SETTINGS_PAGE.setBackground(Color.decode("#eedeb5"));
		SETTINGS_PAGE.addActionListener(this);
		SETTINGS_PAGE.setFocusable(false);

		INPUTS.get("1").setBounds(10, 88, 60, 34);
		INPUTS.get("2").setBounds(75, 88, 60, 34);
		INPUTS.get("3").setBounds(140, 88, 60, 34);
		INPUTS.get("4").setBounds(10, 49, 60, 34);
		INPUTS.get("5").setBounds(75, 49, 60, 34);
		INPUTS.get("6").setBounds(140, 49, 60, 34);
		INPUTS.get("7").setBounds(10, 10, 60, 34);
		INPUTS.get("8").setBounds(75, 10, 60, 34);
		INPUTS.get("9").setBounds(140, 10, 60, 34);
		INPUTS.get("0").setBounds(10, 127, 60, 34);
		INPUTS.get("=").setBounds(10, 166, 255, 34);
		INPUTS.get("clr").setBounds(140, 127, 60, 34);
		INPUTS.get("+").setBounds(205, 127, 60, 34);
		INPUTS.get("-").setBounds(205, 88, 60, 34);
		INPUTS.get("*").setBounds(205, 49, 60, 34);
		INPUTS.get("/").setBounds(205, 10, 60, 34);
		INPUTS.get(".").setBounds(75, 127, 60, 34);
		INPUTS.forEach((name, button) -> {
			BUTTON_PANEL.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
			button.setFocusable(false);
		});
	}

	public void clear() {
		DISPLAY_WINDOW.setText("");
	}

	public static void main(String[] args) {
		
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		INPUTS.forEach((name, button) -> {

			if(e.getSource() == button) {

				switch(name) {
					case "+":
						var1 = Double.parseDouble(DISPLAY_WINDOW.getText());
						operator = '+';
					break;
					case "=":	
						var2 = Double.parseDouble(DISPLAY_WINDOW.getText());
						DISPLAY_WINDOW.setText(DISPLAY_WINDOW.getText().concat(String.valueOf(result)));
						switch(operator) {
							case '+':
								DISPLAY_WINDOW.setText(DISPLAY_WINDOW.getText().concat(String.valueOf(name)));
								result = var1+var2;
							break;

							
						}
					break;
					case "clr":
						clear();
					break;
					default:
						DISPLAY_WINDOW.setText(DISPLAY_WINDOW.getText().concat(String.valueOf(name)));
					
				}
				
			}

			if(e.getSource() == SETTINGS_PAGE) {

				FRAME.dispose();
				new SettingsPage();

			}


		});

		
		
	}
}
