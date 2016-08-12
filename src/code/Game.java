package code;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

public class Game implements Runnable{
	private int _count =0;

	public void run() {
		
		// TODO Auto-generated method stub
		javax.swing.JFrame window;
		window = new javax.swing.JFrame("My Game");
		window.setLayout(new GridLayout(0,1));
		
		// adding text to the frame
		
		javax.swing.JLabel l;
		l = new javax.swing.JLabel();
		
		l.setText("<HTML><body><H1>Instructions</H1><p>Click the start button to start the game"+"<br> Click as many as the 'BLUE' highlighted buttons as you can before time runs out!<p></body></HTML>");
		window.add(l);
		JButton b;
		//Font f = b.getFont();
		b = new JButton("START!");
		window.add(b);
		b.addActionListener(new StartEventHandler(window,this));
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void counter()
	{
		_count = _count+1;
	}
	public void finalcount()
	{
		System.out.println("Your score is "+_count);
	}
	


}
