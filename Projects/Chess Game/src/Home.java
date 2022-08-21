import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//create a main.java and move the main function into it, import other classes into that
//
public class Home implements ActionListener{
	JFrame frame;
	JButton button1;
	JButton button2;
	JButton button3;
	JLabel label;
	
	Home(){ 
		
		frame = new JFrame("Home");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(770,820);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(0xe6f6fe));
		
		button1 = new JButton("Play Chess!");
    	button2 = new JButton("Analyze Game");
    	button3 = new JButton("Saved Games");
    	
    	button1.setBounds(80,575,150,50);
    	button2.setBounds(310,575,150,50);
    	button3.setBounds(540,575,150,50);
    	
    	frame.add(button1);
    	frame.add(button2);
    	frame.add(button3);
    	
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
