package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable {
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("Fly", x - 5, y + Duck.SIZE + 2);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("Quack", x + Duck.SIZE + 2, y + Duck.SIZE + 2);
	}
	
	public void swim(Graphics g) {
		g.setColor(Color.black);
		g.drawString("swim", x, y);
	}

}
