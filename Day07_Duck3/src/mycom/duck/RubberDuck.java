package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public class RubberDuck {
	//�ν��Ͻ� ����
	protected int x;
	protected int y;
	//Ŭ��������=static
	public static final int SIZE=30;

	//�޼ҵ��� �����ε�
	public RubberDuck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //50~749
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;//70~549
	}
	
	public RubberDuck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x, y, RubberDuck.SIZE, RubberDuck.SIZE);
	}
	
	public final void swim(Graphics g) {
		g.drawString("����", x-5, y-2);
	}
	
	public void quack(Graphics g) {
		g.setColor(Color.yellow);
		g.drawString("���", x+RubberDuck.SIZE, y-2);
	}
	
};