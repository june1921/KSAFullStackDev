package mycom.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
	
	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x,y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED); //color 클래스는 이미 메모리에 올려놨기 때문에 static 변수로 불러오기 가능
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE); //반드시 소속을 알려줘야 한다. 만약 여기에 SIZE 변수가 있으면 그쪽으로 접근한다.
	}

}
