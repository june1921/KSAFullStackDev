package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import mycom.ui.MyFrame;

public class Duck {
	
	//이하는 인스턴스 변수
	protected int x;
	protected int y;
	
	//이하는 클래스 변수 == static
	public static final int SIZE = 30; 
	
	//(클래스)클래스변수, static을 붙여 생성>(오브젝트)오브젝트변수(=인스턴스), 클래스 내부에 생성>(함수)지역변수, 함수(메소드)안에 생성
	
	//메소드의 오버로딩, 다형성, 같은 이름의 메소드가 존재할수 있는 이유
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
		g.fillOval(x, y, Duck.SIZE, SIZE); //변수의 소속을 명확히 밝혀서 가져온다.
	}
	
	public final void swim(Graphics g) { //메소드 오버라이딩을 방지하려면 final을 붙인다.
		g.drawString("swim", x-20, y-2);
	}

	public void quack(Graphics g) {
		g.drawString("quack", x+20, y-2);
	}
}
