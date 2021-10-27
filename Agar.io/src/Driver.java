import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener, MouseMotionListener{
	//frame dimensions used in Constructor of Driver
	private int frameWidth = 800, frameHeight = 600; 
	
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0,0,800,600);
		System.out.println("If you see this, the animation timer is working");
	}
	
	//1) add a Driver constructor
	public Driver() {
		JFrame frame = new JFrame("ArrayList stuff");
		frame.setSize(frameWidth,frameHeight);
		frame.add(this);
		frame.setResizable(false);
		
		//this part makes sure the x button closes the program
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Animation Timer
		Timer t = new Timer(16,this);
		t.start();
		
		//make the frame show up
		frame.setVisible(true);
				
	}

	//Starting point of the program
	public static void main(String[] arg) {
		//find a way to run the constructor of the Driver class
		Driver d  = new Driver(); //will this invoke a constructor?
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}	
	
}



