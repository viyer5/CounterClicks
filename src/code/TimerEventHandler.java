package code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerEventHandler implements ActionListener {
	private javax.swing.Timer _t;
	private Game _game;
	
	public TimerEventHandler(javax.swing.Timer t, Game g)
	{
		_t = t;
		_game = g;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Game Over!");
		_game.finalcount();
		_t.stop();
		System.exit(0);
	}

}
