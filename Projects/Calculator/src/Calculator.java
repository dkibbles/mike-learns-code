import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener  {

	JFrame FRAME;
	JTextField DISPLAY_WINDOW; 
	JPanel CALCULATOR, BUTTON_PANEL, SETTINGS, SETTINGS_BUTTON_PANEL;
	JPanel CONTAINER;
	JButton SETTINGS_PAGE;
	HashMap<String,JButton> INPUTS;
	HashMap<String,JButton> BUTTON_INPUTS;

	String[] CALC_BUTTONS = {"0","1","2","3","4","5","6","7","8","9","=","clr","+","-","*","/","."};
	String[] SETTINGS_BUTTONS = {"C"};

	double VARABLE1 = 0;
	double VARABLE2 = 0; 
	double RESULT = 0;
	char OPERATOR;

	CardLayout LAYOUT = new CardLayout();

	public Calculator() {

		FRAME = new JFrame("Calculator");
		CONTAINER = new JPanel();
		CALCULATOR = new JPanel();
		BUTTON_PANEL = new JPanel();
		SETTINGS = new JPanel();
		SETTINGS_BUTTON_PANEL = new JPanel();
		DISPLAY_WINDOW = new JTextField();
		SETTINGS_PAGE = new JButton("S");

		INPUTS = new HashMap<>();
		BUTTON_INPUTS = new HashMap<>();

		FRAME.getContentPane().setPreferredSize(new Dimension(295,304));
		FRAME.pack();
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setVisible(true);
		FRAME.setResizable(false);
		FRAME.add(CONTAINER);

		CONTAINER.setBounds(0,0, 295, 304);
        CONTAINER.setLayout(LAYOUT);
        CONTAINER.add(CALCULATOR, "1");
		CONTAINER.add(SETTINGS, "2");
		LAYOUT.show(CONTAINER, "1");

		CALCULATOR.setBounds(0, 0, 295, 304);
		CALCULATOR.setBackground(Color.decode("#b1bec5"));
		CALCULATOR.setVisible(true);
		CALCULATOR.setLayout(null);
		CALCULATOR.add(DISPLAY_WINDOW);
		CALCULATOR.add(BUTTON_PANEL);
		CALCULATOR.add(SETTINGS_PAGE);
	
		DISPLAY_WINDOW.setBounds(35, 25, 225, 34);
		DISPLAY_WINDOW.setVisible(true);
		DISPLAY_WINDOW.setFont(new Font("Serif",Font.BOLD, 18));

		BUTTON_PANEL.setBounds(10, 84, 275, 210);
		BUTTON_PANEL.setBackground(Color.decode("#343b4a"));
		BUTTON_PANEL.setVisible(true);
		BUTTON_PANEL.setLayout(null);

		SETTINGS_PAGE.setBounds(265, 5, 25, 25);
		SETTINGS_PAGE.setBackground(Color.decode("#eedeb5"));
		SETTINGS_PAGE.addActionListener(this);
		SETTINGS_PAGE.setFocusable(false);

		SETTINGS.setBounds(0, 0, 295, 304);
		SETTINGS.setBackground(Color.decode("#b1bec5"));
		SETTINGS.setVisible(true);
		SETTINGS.add(SETTINGS_BUTTON_PANEL);

		SETTINGS_BUTTON_PANEL.setBounds(10, 10, 275, 284);
        SETTINGS_BUTTON_PANEL.setBackground(Color.decode("#343b41"));
		SETTINGS_BUTTON_PANEL.setVisible(true);
        SETTINGS_BUTTON_PANEL.setLayout(null);

        BUTTON_INPUTS.get("C").setBounds(245, 5, 25, 25);
	

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

		for(int i = 0; i < CALC_BUTTONS.length; i++) {
			INPUTS.put(CALC_BUTTONS[i], new JButton(CALC_BUTTONS[i]));
		}

		INPUTS.forEach((name, button) -> {
			BUTTON_PANEL.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
			button.setFocusable(false);
		});

		for(int i = 0; i < SETTINGS_BUTTONS.length; i++) {
			BUTTON_INPUTS.put(SETTINGS_BUTTONS[i], new JButton(SETTINGS_BUTTONS[i]));
		}

        
        BUTTON_INPUTS.forEach((name, button) -> {
			SETTINGS_BUTTON_PANEL.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
			button.setFocusable(false);
		});
	}

	public static void main(String[] args) {
		
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		INPUTS.forEach((name, button) -> {

			if(e.getSource() == button) {
				switch(name) {
					case "/":
						VARABLE1 = Double.parseDouble(DISPLAY_WINDOW.getText());
						OPERATOR = '/';
						DISPLAY_WINDOW.setText(String.valueOf(""));
					break;
					case "*":
						VARABLE1 = Double.parseDouble(DISPLAY_WINDOW.getText());
						OPERATOR = '*';
						DISPLAY_WINDOW.setText(String.valueOf(""));
					break;
					case "-":
						VARABLE1 = Double.parseDouble(DISPLAY_WINDOW.getText());
						OPERATOR = '-';
						DISPLAY_WINDOW.setText(String.valueOf(""));
					break;
					case "+":
						VARABLE1 = Double.parseDouble(DISPLAY_WINDOW.getText());
						OPERATOR = '+';
						DISPLAY_WINDOW.setText(String.valueOf(""));
					break;
					case "=":
						VARABLE2 = Double.parseDouble(DISPLAY_WINDOW.getText());

						switch(OPERATOR) {
							case '/':
								RESULT = VARABLE1/VARABLE2;
							break;
							case '*':
								RESULT = VARABLE1*VARABLE2;
							break;
							case '-':
								RESULT = VARABLE1-VARABLE2;
							break;
							case '+':
								RESULT = VARABLE1+VARABLE2;
							break;
						}

						DISPLAY_WINDOW.setText(String.valueOf(RESULT));
					break;
					case "clr":
						DISPLAY_WINDOW.setText("");
					break;
					default: DISPLAY_WINDOW.setText(DISPLAY_WINDOW.getText().concat(String.valueOf(name)));
				}
			}

			if(e.getSource() == SETTINGS_PAGE) {
				LAYOUT.show(CONTAINER, "2");
			}


		});

		
		
	}
}
