package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck{
	
	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}
	
	public void fly(Graphics g) {
		g.drawString("Fly", x, y);
	}
	

	
};
