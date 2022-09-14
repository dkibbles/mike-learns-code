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

	//Yo so I noticed a lot code that could be simplified with the help of a nice model. This illustrates the difference between code that
	// gets the job done, and code that works with data models to improve the design of the application and write more efficiently.
	// Some code has been marked OBSOLETE and the rest has some explanations, check it out...you can delete the comments when you're done, I should've written them in git anyway...

	//OBSOLETE
	// JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	// JButton equals, clear, add, sub, mul, div, dec;
	// JButton settings;

	JFrame frame;
	JTextField displayWindow;
	JPanel buttonPanel, displayWindowPanel;


	//New model to store every button we might need on the calc with a string to address them.
	HashMap<String,JButton> inputs = new HashMap<String, JButton>();

	//This should be a global constant that lives anywhere. Typically we'd put this in the .env file on whatever machine is running our code. For now it doesn't matter.
	// And thanks to our new efficient code, if we ever need a new button, we can just come back and add it here. 
	String[] CALC_BUTTONS = {"0","1","2","3","4","5","6","7","8","9","=","clr","+","-","*","/",".","S"};

	public Calculator() {

		frame = new JFrame("Calculator");
		buttonPanel = new JPanel();
		displayWindow = new JTextField();

		//OBSOLETE - This is the first thing I noticed. No offense to you, but the code just looks funny. Whenever you see really repetative code, it can always be improved.
		// and in this case, I came up with a model that can simplify not only this blocky code, but more down below as well.
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

		
		//Iterate thru our array of buttons, make them, and add them to the hashmap.
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

		//OBSOLETE
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
		
		//Iterate thru the inputs map and add each button to the buttonPanel, also set the bg color
		inputs.forEach((name, button) -> {
			buttonPanel.add(button);
			button.setBackground(Color.decode("#eedeb5"));
		});

		frame.add(inputs.get("S"));

		inputs.get("S").setBounds(270, 5, 20, 20);

		displayWindow.setBounds(40, 25, 215, 34);

		//Notice here we can access directly from the hashmap with the display name of the button. This is nice because we don't need to remember "ah shit, did I name '1' button1, b1, or button_1"
		//Unfortunately the only way to improve this blocky code would be to have a nice algorithm to set all the coordinates...not important right now.
		inputs.get("1").setBounds(10, 88, 60, 34);
		inputs.get("2").setBounds(75, 88, 60, 34);
		inputs.get("3").setBounds(140, 88, 60, 34);
		inputs.get("4").setBounds(10, 49, 60, 34);
		inputs.get("5").setBounds(75, 49, 60, 34);
		inputs.get("6").setBounds(140, 49, 60, 34);
		inputs.get("7").setBounds(10, 10, 60, 34);
		inputs.get("8").setBounds(75, 10, 60, 34);
		inputs.get("9").setBounds(140, 10, 60, 34);
		inputs.get("0").setBounds(10, 127, 60, 34);
		inputs.get("=").setBounds(10, 166, 255, 34);
		inputs.get("clr").setBounds(140, 127, 60, 34);
		inputs.get("+").setBounds(205, 127, 60, 34);
		inputs.get("-").setBounds(205, 88, 60, 34);
		inputs.get("*").setBounds(205, 49, 60, 34);
		inputs.get("/").setBounds(205, 10, 60, 34);
		inputs.get(".").setBounds(75, 127, 60, 34);

		//OBSOLETE
		//frame.add(settings);
		//inputs.get("S").setBackground(Color.decode("#eedeb5"));
		//inputs.get("1").setBackground(Color.decode("#eedeb5"));
		//inputs.get("2").setBackground(Color.decode("#eedeb5"));
		//inputs.get("3").setBackground(Color.decode("#eedeb5"));
		//inputs.get("4").setBackground(Color.decode("#eedeb5"));
		//inputs.get("5").setBackground(Color.decode("#eedeb5"));
		//inputs.get("6").setBackground(Color.decode("#eedeb5"));
		//inputs.get("7").setBackground(Color.decode("#eedeb5"));
		//inputs.get("8").setBackground(Color.decode("#eedeb5"));
		//inputs.get("9").setBackground(Color.decode("#eedeb5"));
		//inputs.get("0").setBackground(Color.decode("#eedeb5"));
		//inputs.get("=").setBackground(Color.decode("#eedeb5"));
		//inputs.get("clr").setBackground(Color.decode("#eedeb5"));
		//inputs.get("+").setBackground(Color.decode("#eedeb5"));
		//inputs.get("-").setBackground(Color.decode("#eedeb5"));
		//inputs.get("*").setBackground(Color.decode("#eedeb5"));
		//inputs.get("/").setBackground(Color.decode("#eedeb5"));
		//inputs.get(".").setBackground(Color.decode("#eedeb5"));

	}

	public static void main(String[] args) {
		
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
