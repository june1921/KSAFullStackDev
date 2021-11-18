package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public class Duck {
	
	//���ϴ� �ν��Ͻ� ����
	protected int x;
	protected int y;
	
	//���ϴ� Ŭ���� ���� == static
	public static final int SIZE = 30; 
	
	//(Ŭ����)Ŭ��������, static�� �ٿ� ����>(������Ʈ)������Ʈ����(=�ν��Ͻ�), Ŭ���� ���ο� ����>(�Լ�)��������, �Լ�(�޼ҵ�)�ȿ� ����
	
	//�޼ҵ��� �����ε�, ������, ���� �̸��� �޼ҵ尡 �����Ҽ� �ִ� ����
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //50~749
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-100)+70; //70~569
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public void display(Graphics g) {
		//Color c = new Color(0, 0, 0);
		//g.setColor(c);
		g.fillOval(x, y, Duck.SIZE, SIZE); //������ �Ҽ��� ��Ȯ�� ������ �����´�.
	}
	
	public final void swim(Graphics g) { //�޼ҵ� �������̵��� �����Ϸ��� final�� ���δ�.
		g.drawString("swim", x-20, y-2);
	}

	public void quack(Graphics g) {
		g.drawString("quack", x+20, y-2);
	}
}
