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
		
		frame.getContentPane().setPreferredSize(new Dimension(300,400));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setLayout(null);
		frame.add(buttonPanel);
		frame.add(displayWindow);

		buttonPanel.setBounds(10, 110, 280, 280);
		buttonPanel.setBackground(Color.LIGHT_GRAY);
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


		settings.setBounds(275, 5, 20, 20);
		
		displayWindow.setBounds(40, 40, 220, 40);

		b1.setBounds(10, 100, 60, 40);

		b2.setBounds(75, 100, 60, 40);

		b3.setBounds(140, 100, 60, 40);

		b4.setBounds(10, 55, 60, 40);

		b5.setBounds(75, 55, 60, 40);

		b6.setBounds(140, 55, 60, 40);

		b7.setBounds(10, 10, 60, 40);

		b8.setBounds(75, 10, 60, 40);

		b9.setBounds(140, 10, 60, 40);

		b0.setBounds(10, 145, 125, 40);

		equals.setBounds(10, 235, 255, 40);

		clear.setBounds(10, 190, 255, 40);

		add.setBounds(205, 145, 60, 40);

		sub.setBounds(205, 100, 60, 40);

		mul.setBounds(205, 55, 60, 40);

		div.setBounds(205, 10, 60, 40);

		dec.setBounds(140, 145, 60, 40);


	}

	public static void main(String[] args) {
		
		new Calculator();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
