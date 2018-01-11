package breakout;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Breakout extends JFrame {

	public Breakout() {
		
		initUI();
	}
	
	private void initUI() {
		
		add(new Board());
		setTitle("Breakout");
		
		setResizable(true);
		setSize(Commons.WIDTH, Commons.HEIGHT);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Breakout game = new Breakout();
				game.setVisible(true);
			}
		});
	}
}
