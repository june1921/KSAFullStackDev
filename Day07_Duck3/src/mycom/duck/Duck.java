package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public class Duck {
	//�ν��Ͻ� ����
	protected int x;
	protected int y;
	//Ŭ��������=static
	public static final int SIZE=30;

	//�޼ҵ��� �����ε�
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //50~749
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;//70~549
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void display(Graphics g) {
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
	}
	
	public final void swim(Graphics g) {
		g.drawString("����", x-5, y-2);
	}
	
	public void quack(Graphics g) {
		g.drawString("�в�", x+Duck.SIZE, y-2);
	}
	
};
