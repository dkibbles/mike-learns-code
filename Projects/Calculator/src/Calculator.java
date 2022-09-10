import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField displayWindow;
	JButton[] numbers;
	JButton equals ;
	JButton clear;
	JButton add;
	JButton sub;
	JButton mul;
	JButton div;
	JButton dec;

	public Calculator() {

		
		frame = new JFrame("Calculator");
		displayWindow = new JTextField();
		numbers = new JButton[10];

		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton(String.valueOf(i));
			numbers[i].addActionListener(this);

		}
		equals = new JButton("=");
		clear = new JButton("clr");
		add = new JButton();
		sub = new JButton();
		mul = new JButton();
		div = new JButton();
		dec = new JButton();
		
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(displayWindow);
		frame.add(equals);
		frame.add(clear);
		frame.add(add);
		frame.add(sub);
		frame.add(mul);
		frame.add(div);
		frame.add(dec);

		displayWindow.setBounds(0,75, 300, 50);
		equals.setBounds(300, 550, 50, 25);
		clear.setBounds(100, 550, 50, 25);


	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
