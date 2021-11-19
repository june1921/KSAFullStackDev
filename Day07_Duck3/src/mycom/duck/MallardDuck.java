package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}
	
	public void fly(Graphics g) {
		g.drawString("Fly", x, y);
	}
	
};
