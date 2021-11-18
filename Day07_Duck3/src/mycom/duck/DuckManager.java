package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	private Duck[] darr = new Duck[10];
	
	public DuckManager() {
		makeDucks();
	}
	
	private void makeDucks() {
		Random rnd = new Random();
		int type = 0;
		
		for(int i=0;i<darr.length;i++) {
			type = rnd.nextInt(2); //0,1
			
			switch(type) {
			case 0:
				//부모 = 자식; (자식 is a 부모)
				//형변환
				darr[i] = new MallardDuck();
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			default:
				darr[i] = new MallardDuck();
			}
		}//for

	}
	
	//업캐스팅 
	//암묵적 형변환
	//다운캐스팅은 지원안함
	//부모 = 자식
	//자식 = 부모(X)
	//하지만 메소드 오버라이딩이 일어난 경우 부모의 것이 not visible 상태가 된다.
	//자식 클래스에서 추가 확장된 기능은 접근 불가
	//업 캐스팅후 다시 다운 캐스팅은 가능 그러나 이때는 명시적 형변환이 필요하다.ㅌ
	
	public void displayAllDucks(Graphics g) {
		for(int i = 0; i< darr.length; i++) {
			darr[i].display(g);
		}
	}
	
	public void swimAllDucks(Graphics g) {
		for(int i = 0; i< darr.length; i++) {
			darr[i].swim(g);
		}
	}
	
	public void quackAllDucks(Graphics g) {
		for(int i = 0; i< darr.length; i++) {
			darr[i].quack(g);
		}
	}

}
