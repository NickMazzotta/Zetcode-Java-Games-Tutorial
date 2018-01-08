package movingSprite;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Craft extends Sprite {

	private int dx;
	private int dy;
	private ArrayList missiles;
	
	public Craft(int x, int y) {
		super(x, y);
		
		initCraft();
	}
	
	private void initCraft() {
		
		missiles = new ArrayList();
		loadImage("craft.png");
		getImageDimensions();
	}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
	public ArrayList getMissiles() {
		return missiles;
	}
	
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		switch(key) {
		case KeyEvent.VK_SPACE: fire();
		case KeyEvent.VK_UP: dy = -1;
		case KeyEvent.VK_DOWN: dy = 1;
		case KeyEvent.VK_LEFT: dx = -1;
		case KeyEvent.VK_RIGHT: dx = 1;
		default: break;
		}
	}
	
	public void fire() {
		missiles.add(new Missile(x + width, x + height / 2));
	}
	
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
			dy = 0;
		} else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
			
		}
	}
	
}
