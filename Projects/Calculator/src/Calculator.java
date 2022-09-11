import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField displayWindow;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton equals, clear, add, sub, mul, div, dec;
	JButton settings;
	JPanel buttonPanel, displayWindowPanel;

	public Calculator() {

		frame = new JFrame("Calculator");
		buttonPanel = new JPanel();
		displayWindow = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		equals = new JButton("=");
		clear = new JButton("clr");
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		dec = new JButton(".");
		settings = new JButton("S");
		
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

		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(b9);
		buttonPanel.add(div);

		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(b6);
		buttonPanel.add(mul);

		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(sub);

		buttonPanel.add(b0);
		buttonPanel.add(dec);
		buttonPanel.add(add);

		buttonPanel.add(equals);
		buttonPanel.add(clear);
		
		frame.add(settings);


		settings.setBounds(270, 5, 20, 20);
		settings.setBackground(Color.decode("#eedeb5"));
		
		displayWindow.setBounds(40, 25, 215, 34);

		b1.setBounds(10, 88, 60, 34);
		b1.setBackground(Color.decode("#eedeb5"));

		b2.setBounds(75, 88, 60, 34);
		b2.setBackground(Color.decode("#eedeb5"));

		b3.setBounds(140, 88, 60, 34);
		b3.setBackground(Color.decode("#eedeb5"));

		b4.setBounds(10, 49, 60, 34);
		b4.setBackground(Color.decode("#eedeb5"));

		b5.setBounds(75, 49, 60, 34);
		b5.setBackground(Color.decode("#eedeb5"));

		b6.setBounds(140, 49, 60, 34);
		b6.setBackground(Color.decode("#eedeb5"));

		b7.setBounds(10, 10, 60, 34);
		b7.setBackground(Color.decode("#eedeb5"));

		b8.setBounds(75, 10, 60, 34);
		b8.setBackground(Color.decode("#eedeb5"));

		b9.setBounds(140, 10, 60, 34);
		b9.setBackground(Color.decode("#eedeb5"));

		b0.setBounds(10, 127, 60, 34);
		b0.setBackground(Color.decode("#eedeb5"));

		equals.setBounds(10, 166, 255, 34);
		equals.setBackground(Color.decode("#eedeb5"));

		clear.setBounds(140, 127, 60, 34);
		clear.setBackground(Color.decode("#eedeb5"));

		add.setBounds(205, 127, 60, 34);
		add.setBackground(Color.decode("#eedeb5"));

		sub.setBounds(205, 88, 60, 34);
		sub.setBackground(Color.decode("#eedeb5"));

		mul.setBounds(205, 49, 60, 34);
		mul.setBackground(Color.decode("#eedeb5"));

		div.setBounds(205, 10, 60, 34);
		div.setBackground(Color.decode("#eedeb5"));

		dec.setBounds(75, 127, 60, 34);
		dec.setBackground(Color.decode("#eedeb5"));


	}

	public static void main(String[] args) {
		
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
