package movingSprite.simpleCraft;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Craft {

	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image image;
	
	public Craft() {
		initCraft();
	}
	
	private void initCraft() {
		
		ImageIcon ii = new ImageIcon("craft.png");
		image = ii.getImage().getScaledInstance(40, 20, Image.SCALE_DEFAULT);
		x = 40;
		y = 60;
	}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Image getImage() {
		return image;
	}
	
	public void keyPressed(KeyEvent e) {
		
		int  key = e.getKeyCode();
		
		switch (key) {
			case KeyEvent.VK_LEFT: dx = -1; break;
			case KeyEvent.VK_RIGHT: dx = 1; break;
			case KeyEvent.VK_UP: dy = -1; break;
			case KeyEvent.VK_DOWN: dy = 1; break;
			default: break;
		} 
	}
	
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
			dx = 0;
		} else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}
	
}
