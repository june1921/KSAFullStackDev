package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {
	
	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.green);
		g.drawString("Beep", x + Duck.SIZE + 2, y + Duck.SIZE + 2);
	}
	
	public void swim(Graphics g) {
		g.setColor(Color.black);
		g.drawString("swim", x, y);
	}

}
