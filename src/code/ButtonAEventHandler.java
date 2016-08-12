package code;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class ButtonAEventHandler implements ActionListener {
	private JButton _b1;
	private JButton _b2;
	private JButton _b3;
	private Game _game;
	
	int count = 0;
	
		public ButtonAEventHandler ( JButton b1, JButton b2, JButton b3, Game g){
			_b1 = b1;
			_b2 = b2;
		    _b3 = b3;
		    _game = g;
		}// end constructor
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		randomizeButtons();
		_game.counter();
		javax.swing.Timer t;
		t = new javax.swing.Timer(10*1000,null);
		t.addActionListener(new TimerEventHandler(t,_game));
		t.start();
	}
		public void randomizeButtons()
		{
			// generating a random number
			Random r = new Random();
			int x = r.nextInt(3);
			
			 if (x==0)
			 {
				 _b1.setEnabled(true);
				 _b2.setEnabled(false);
				 _b3.setEnabled(false);
				 _b1.setBackground(Color.BLUE);
				 _b2.setBackground(Color.GRAY);
				 _b3.setBackground(Color.GRAY);
			 }
			 if (x==1)
			 {
				 _b1.setEnabled(false);
				 _b2.setEnabled(true);
				 _b3.setEnabled(false);
				 _b2.setBackground(Color.BLUE);
				 _b1.setBackground(Color.GRAY);
				 _b3.setBackground(Color.GRAY);
			 }
			 if (x==2)
			 {
				 _b1.setEnabled(false);
				 _b2.setEnabled(false);
				 _b3.setEnabled(true);
				 _b3.setBackground(Color.BLUE);
				 _b1.setBackground(Color.GRAY);
				 _b2.setBackground(Color.GRAY);
			 }
			 
			
		}
		

}
