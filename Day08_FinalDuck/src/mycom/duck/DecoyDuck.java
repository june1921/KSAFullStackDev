package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x, y);
	}

	public void swim(Graphics g) {
		g.setColor(Color.black);
		g.drawString("swim", x, y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		
	}
}
