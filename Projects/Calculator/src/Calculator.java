import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends SettingsPage  {

	JFrame frame;
	JTextField displayWindow; 
	JPanel container, calculator, buttonPanel;
	JButton settingsPage;
	HashMap<String,JButton> inputs;

	static final String[] CALC_BUTTONS = {"0","1","2","3","4","5","6","7","8","9","=","AC","+","-","*","/",".","sqrt","x^2","x^3","%"};

	double varable1 = 0;
	double varable2 = 0; 
	double result = 0;
	char operator;

	CardLayout layout;

	public Calculator() {

		frame = new JFrame("Calculator");
		container = new JPanel(new CardLayout());
		layout = new CardLayout();
		calculator = new JPanel();
		buttonPanel = new JPanel();
		displayWindow = new JTextField();
		settingsPage = new JButton("S");

		inputs = new HashMap<>();

		frame.getContentPane().setPreferredSize(new Dimension(295,304));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(container);

		container.setBounds(0,0, 295, 304);
        container.setLayout(layout);
        container.add(calculator, "1");
		container.add(settings, "2");

		layout.show(container, "1");

		calculator.setBounds(0, 0, 295, 304);
		calculator.setBackground(Color.decode("#86b9b0"));
		calculator.setLayout(null);
		calculator.add(displayWindow);
		calculator.add(buttonPanel);
		calculator.add(settingsPage);
	
		displayWindow.setBounds(10, 8, 241, 29);
		displayWindow.setVisible(true);
		displayWindow.setFont(new Font("Comic Sans MS",Font.BOLD, 16));

		buttonPanel.setBounds(10, 45, 275, 249);
		buttonPanel.setBackground(Color.decode("#042630"));
		buttonPanel.setVisible(true);
		buttonPanel.setLayout(null);

		settingsPage.setBounds(256, 8, 29, 29);
		settingsPage.setBackground(Color.decode("#d0d6d6"));
		settingsPage.addActionListener(this);
		settingsPage.setFocusable(false);
		settingsPage.setFont(new Font("Comic Sans MS",Font.PLAIN,5));

		

		for(int i = 0; i < CALC_BUTTONS.length; i++) {
			inputs.put(CALC_BUTTONS[i], new JButton(CALC_BUTTONS[i]));
		}

		inputs.forEach((name, button) -> {
			buttonPanel.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#d0d6d6"));
			button.setFocusable(false);
		});

		
		inputs.get("1").setBounds(10, 127, 60, 34);
		inputs.get("2").setBounds(75, 127, 60, 34);
		inputs.get("3").setBounds(140, 127, 60, 34);
		inputs.get("4").setBounds(10, 88, 60, 34);
		inputs.get("5").setBounds(75, 88, 60, 34);
		inputs.get("6").setBounds(140, 88, 60, 34);
		inputs.get("7").setBounds(10, 49, 60, 34);
		inputs.get("8").setBounds(75, 49, 60, 34);
		inputs.get("9").setBounds(140, 49, 60, 34);
		inputs.get("0").setBounds(10, 166, 60, 34);
		inputs.get("=").setBounds(10, 205, 255, 34);
		inputs.get("AC").setBounds(140, 166, 60, 34);
		inputs.get("+").setBounds(205, 166, 60, 34);
		inputs.get("-").setBounds(205, 127, 60, 34);
		inputs.get("*").setBounds(205, 88, 60, 34);
		inputs.get("/").setBounds(205, 49, 60, 34);
		inputs.get(".").setBounds(75, 166, 60, 34);
		inputs.get("sqrt").setBounds(10, 10, 60, 34);
		inputs.get("x^2").setBounds(75, 10, 60, 34);
		inputs.get("x^3").setBounds(140, 10, 60, 34);
		inputs.get("%").setBounds(205, 10, 60, 34);

	}

	public static void main(String[] args) {
		
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		inputs.forEach((name, button) -> {

			if(e.getSource() == button) {
				switch(name) {
					case "/":
						varable1 = Double.parseDouble(displayWindow.getText());
						operator = '/';
						displayWindow.setText(String.valueOf(""));
					break;
					case "*":
						varable1 = Double.parseDouble(displayWindow.getText());
						operator = '*';
						displayWindow.setText(String.valueOf(""));
					break;
					case "-":
						varable1 = Double.parseDouble(displayWindow.getText());
						operator = '-';
						displayWindow.setText(String.valueOf(""));
					break;
					case "+":
						varable1 = Double.parseDouble(displayWindow.getText());
						operator = '+';
						displayWindow.setText(String.valueOf(""));
					break;
					case "=":
						varable2 = Double.parseDouble(displayWindow.getText());

						switch(operator) {
							case '/':
								result = varable1/varable2;
							break;
							case '*':
								result = varable1*varable2;
							break;
							case '-':
								result = varable1-varable2;
							break;
							case '+':
								result = varable1+varable2;
							break;
						}

						displayWindow.setText(String.valueOf(result));
					break;
					case "x^2":
						varable1 = Double.parseDouble(displayWindow.getText());
						result = varable1*varable1;
						displayWindow.setText(String.valueOf(result));
					break;
					case "x^3":
						varable1 = Double.parseDouble(displayWindow.getText());
						result = varable1*varable1*varable1;
						displayWindow.setText(String.valueOf(result));
					break;
					case "sqrt":
						varable1 = Double.parseDouble(displayWindow.getText());
						result = Math.sqrt(varable1);
						displayWindow.setText(String.valueOf(result));
					break;
					case "%":
						varable1 = Double.parseDouble(displayWindow.getText());
						result = varable1/100;
						displayWindow.setText(String.valueOf(result));
					break;
					case "AC":
						displayWindow.setText("");
					break;
					default: displayWindow.setText(displayWindow.getText().concat(String.valueOf(name)));
				}
			}

			if(e.getSource() == settingsPage) {
				layout.show(container, "2");
			}

			if(e.getSource() == buttonInputs.get("C")) {
				layout.show(container, "1"); 
			}

			if(e.getSource() == colorSettings) {
				
				String color = (String)colorSettings.getSelectedItem();
				switch (color) {
					case "Red":
						calculator.setBackground(Color.decode("#FA8072"));
						buttonPanel.setBackground(Color.decode("#7E191B"));
						settingsPage.setBackground(Color.decode("#CD5C5C"));
						settings.setBackground(Color.decode("#FA8072"));
						settingsButtonsPanel.setBackground(Color.decode("#420D09"));
						button.setBackground(Color.decode("#CD5C5C"));
						buttonInputs.get("C").setBackground(Color.decode("#CD5C5C"));
					break;
					case "Blue":
						calculator.setBackground(Color.decode("#86b9b0"));
						buttonPanel.setBackground(Color.decode("#042630"));
						settingsPage.setBackground(Color.decode("#d0d6d6"));
						settings.setBackground(Color.decode("#86b9b0"));
						settingsButtonsPanel.setBackground(Color.decode("#042630"));
						button.setBackground(Color.decode("#d0d6d6"));
						buttonInputs.get("C").setBackground(Color.decode("#d0d6d6"));
					break;
					case "Green":
						calculator.setBackground(Color.decode("#014a39"));
						buttonPanel.setBackground(Color.decode("#0d2901"));
						settingsPage.setBackground(Color.decode("#b4d351"));
						settings.setBackground(Color.decode("#014a39"));
						settingsButtonsPanel.setBackground(Color.decode("#0d2901"));
						button.setBackground(Color.decode("#b4d351"));
						buttonInputs.get("C").setBackground(Color.decode("#b4d351"));
					break;
				}
			}


			if(e.getSource() == fontSize) {

				Integer fontS = (Integer)fontSize.getSelectedItem();
				switch (fontS) {
					case 12:
						displayWindow.setFont(new Font("Comic Sans MS",Font.BOLD, 12));
					break;
					case 16:
						displayWindow.setFont(new Font("Comic Sans MS",Font.BOLD, 16));
					break;
					case 20:
						displayWindow.setFont(new Font("Comic Sans MS",Font.BOLD, 20));
					break;
				}
			}

			if(e.getSource() == fontColor) {

				String fontC = (String)fontColor.getSelectedItem();
				switch (fontC) {
					case "Red":
						displayWindow.setForeground(new Color(255,0,0));
					break;
					case "Blue":
						displayWindow.setForeground(new Color(0,0,255));
					break;
					case "Green":
						displayWindow.setForeground(new Color(0,255,0));
					break;
				}
			}


		});

		
		
	}
}
