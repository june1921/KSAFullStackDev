package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public abstract class Duck {
	//인스턴스 변수
	protected int x;
	protected int y;
	//클래스변수=static
	public static final int SIZE=30;

	//메소드의 오버로딩
	public Duck() {
		Random rnd = new Random();
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100)+50; //50~749
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140)+70;//70~549
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void display(Graphics g); //추상 메소드 -> 추상클래스 -> new 사용 못하고, 단일 상속
	public abstract void swim(Graphics g);
	
};
