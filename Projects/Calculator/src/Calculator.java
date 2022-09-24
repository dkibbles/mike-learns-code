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
	JPanel container, calculator, buttoPanel;
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
		buttoPanel = new JPanel();
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
		calculator.setBackground(Color.decode("#b1bec5"));
		calculator.setLayout(null);
		calculator.add(displayWindow);
		calculator.add(buttoPanel);
		calculator.add(settingsPage);
	
		displayWindow.setBounds(10, 8, 241, 29);
		displayWindow.setVisible(true);
		displayWindow.setFont(new Font("Comic Sans MS",Font.BOLD, 15));

		buttoPanel.setBounds(10, 45, 275, 249);
		buttoPanel.setBackground(Color.decode("#343b4a"));
		buttoPanel.setVisible(true);
		buttoPanel.setLayout(null);

		settingsPage.setBounds(256, 8, 29, 29);
		settingsPage.setBackground(Color.decode("#eedeb5"));
		settingsPage.addActionListener(this);
		settingsPage.setFocusable(false);
		settingsPage.setFont(new Font("Comic Sans MS",Font.PLAIN,5));

		

		for(int i = 0; i < CALC_BUTTONS.length; i++) {
			inputs.put(CALC_BUTTONS[i], new JButton(CALC_BUTTONS[i]));
		}

		inputs.forEach((name, button) -> {
			buttoPanel.add(button);
			button.addActionListener(this);
			button.setBackground(Color.decode("#eedeb5"));
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


		});

		
		
	}
}
