import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField displayWindow;
	JButton[] numbers;
	JButton[] functions;
	JButton equals ;
	JButton clear;

	public Calculator() {

		numbers = new JButton[10];

		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = new JButton(String.valueOf(i));
			numbers[i].addActionListener(this);
			
		}

		functions = new JButton[5];

		
		

		frame = new JFrame("Calculator");
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(displayWindow);
		frame.add(equals);
		frame.add(clear);

		displayWindow = new JTextField();
		displayWindow.setBounds(0,75, 300, 50);

		equals = new JButton("=");
		equals.setBounds(300, 550, 50, 25);

		clear = new JButton("clr");
		clear.setBounds(100, 550, 50, 25);


	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
