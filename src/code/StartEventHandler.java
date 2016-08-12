package code;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.Timer;

import java.util.*;


public class StartEventHandler implements ActionListener {
		private javax.swing.JFrame _win;
		private javax.swing.JPanel _jp = new javax.swing.JPanel();
		private JButton b1;
		private JButton b2;
		private JButton b3;
		private Game _g;
	
		
		public StartEventHandler(javax.swing.JFrame w, Game g)
		{
			_win = w;
			_g = g;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//adding panel to the frame
		_win.getContentPane().removeAll();
		_win.add(_jp);
		
		//first button
		
		b1 = new JButton("A");
		//b1.setBackground(Color.BLUE);
		_jp.add(b1);
	
		
		//second button
		//JButton b2;
		b2 = new JButton("B");
		//b2.setBackground(Color.BLUE);
		_jp.add(b2);
		
		
		//third button
		//JButton b3;
		b3 = new JButton("C");
		//b3.setBackground(Color.BLUE);
		_jp.add(b3);
		
		_win.pack();
		
		
		b1.addActionListener(new ButtonAEventHandler(b1,b2,b3,_g));
		
		b2.addActionListener(new ButtonAEventHandler(b1,b2,b3,_g));
		b3.addActionListener(new ButtonAEventHandler(b1,b2,b3,_g));
		
		Random r = new Random();
		int x = r.nextInt(3);
		
		 if (x==0)
		 {
			 b1.setEnabled(true);
			 b2.setEnabled(false);
			 b3.setEnabled(false);
			 b1.setBackground(Color.BLUE);
			 b2.setBackground(Color.GRAY);
			 b3.setBackground(Color.GRAY);
		 }
		 if (x==1)
		 {
			 b1.setEnabled(false);
			 b2.setEnabled(true);
			 b3.setEnabled(false);
			 b2.setBackground(Color.BLUE);
			 b1.setBackground(Color.GRAY);
			 b3.setBackground(Color.GRAY);
		 }
		 if (x==2)
		 {
			 b1.setEnabled(false);
			 b2.setEnabled(false);
			 b3.setEnabled(true);
			 b3.setBackground(Color.BLUE);
			 b1.setBackground(Color.GRAY);
			 b2.setBackground(Color.GRAY);
		 }
		
		}

		
		//enabling the button
		
		
		
	
}
