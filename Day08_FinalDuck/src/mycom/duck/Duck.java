package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public abstract class Duck {
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
	
	public abstract void display(Graphics g); //�߻� �޼ҵ� -> �߻�Ŭ���� -> new ��� ���ϰ�, ���� ���
	public abstract void swim(Graphics g);
	
};
