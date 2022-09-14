import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField displayWindow;
	JPanel buttonPanel, displayWindowPanel;


	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton equals, clear, add, sub, mul, div, dec;
	JButton settings;
	

	HashMap<String,JButton> inputs = new HashMap<String, JButton>();

	String[] CALC_BUTTONS = {"0","1","2","3","4","5","6","7","8","9","=","clr","+","-","*","/",".","S"};

	public Calculator() {

		frame = new JFrame("Calculator");
		buttonPanel = new JPanel();
		displayWindow = new JTextField();

		//So you can declare a 
		// b1 = new JButton("1");
		// b2 = new JButton("2");
		// b3 = new JButton("3");
		// b4 = new JButton("4");
		// b5 = new JButton("5");
		// b6 = new JButton("6");
		// b7 = new JButton("7");
		// b8 = new JButton("8");
		// b9 = new JButton("9");
		// b0 = new JButton("0");
		// equals = new JButton("=");
		// clear = new JButton("clr");
		// add = new JButton("+");
		// sub = new JButton("-");
		// mul = new JButton("*");
		// div = new JButton("/");
		// dec = new JButton(".");
		// settings = new JButton("S");

		for(int i = 0; i < CALC_BUTTONS.length; i++) {
			inputs.put(CALC_BUTTONS[i], new JButton(CALC_BUTTONS[i]));
		}
		
		frame.getContentPane().setPreferredSize(new Dimension(295,304));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.add(buttonPanel);
		frame.add(displayWindow);
		frame.getContentPane().setBackground(Color.decode("#b1bec5"));

		buttonPanel.setBounds(10, 84, 275, 210);
		buttonPanel.setBackground(Color.decode("#343b4a"));
		buttonPanel.setLayout(null);

		// buttonPanel.add(b7);
		// buttonPanel.add(b8);
		// buttonPanel.add(b9);
		// buttonPanel.add(div);

		// buttonPanel.add(b4);
		// buttonPanel.add(b5);
		// buttonPanel.add(b6);
		// buttonPanel.add(mul);

		// buttonPanel.add(b1);
		// buttonPanel.add(b2);
		// buttonPanel.add(b3);
		// buttonPanel.add(sub);

		// buttonPanel.add(b0);
		// buttonPanel.add(dec);
		// buttonPanel.add(add);

		// buttonPanel.add(equals);
		// buttonPanel.add(clear);
		
		inputs.forEach((name, button) -> buttonPanel.add(button));



		frame.add(inputs.get("S"));


		inputs.get("S").setBounds(270, 5, 20, 20);
		inputs.get("S").setBackground(Color.decode("#eedeb5"));
		
		displayWindow.setBounds(40, 25, 215, 34);

		inputs.get("1").setBounds(10, 88, 60, 34);
		inputs.get("1").setBackground(Color.decode("#eedeb5"));

		inputs.get("2").setBounds(75, 88, 60, 34);
		inputs.get("2").setBackground(Color.decode("#eedeb5"));

		inputs.get("3").setBounds(140, 88, 60, 34);
		inputs.get("3").setBackground(Color.decode("#eedeb5"));

		inputs.get("4").setBounds(10, 49, 60, 34);
		inputs.get("4").setBackground(Color.decode("#eedeb5"));

		inputs.get("5").setBounds(75, 49, 60, 34);
		inputs.get("5").setBackground(Color.decode("#eedeb5"));

		inputs.get("6").setBounds(140, 49, 60, 34);
		inputs.get("6").setBackground(Color.decode("#eedeb5"));

		inputs.get("7").setBounds(10, 10, 60, 34);
		inputs.get("7").setBackground(Color.decode("#eedeb5"));

		inputs.get("8").setBounds(75, 10, 60, 34);
		inputs.get("8").setBackground(Color.decode("#eedeb5"));

		inputs.get("9").setBounds(140, 10, 60, 34);
		inputs.get("9").setBackground(Color.decode("#eedeb5"));

		inputs.get("0").setBounds(10, 127, 60, 34);
		inputs.get("0").setBackground(Color.decode("#eedeb5"));

		inputs.get("=").setBounds(10, 166, 255, 34);
		inputs.get("=").setBackground(Color.decode("#eedeb5"));

		inputs.get("clr").setBounds(140, 127, 60, 34);
		inputs.get("clr").setBackground(Color.decode("#eedeb5"));

		inputs.get("+").setBounds(205, 127, 60, 34);
		inputs.get("+").setBackground(Color.decode("#eedeb5"));

		inputs.get("-").setBounds(205, 88, 60, 34);
		inputs.get("-").setBackground(Color.decode("#eedeb5"));

		inputs.get("*").setBounds(205, 49, 60, 34);
		inputs.get("*").setBackground(Color.decode("#eedeb5"));

		inputs.get("/").setBounds(205, 10, 60, 34);
		inputs.get("/").setBackground(Color.decode("#eedeb5"));

		inputs.get(".").setBounds(75, 127, 60, 34);
		inputs.get(".").setBackground(Color.decode("#eedeb5"));


	}

	public static void main(String[] args) {
		
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
