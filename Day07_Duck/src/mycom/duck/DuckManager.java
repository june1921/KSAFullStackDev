package mycom.duck;

import java.awt.Graphics;
import java.awt.Paint;
import java.util.Random;

public class DuckManager {
	
	int n;
	Duck darr[];
	
	public DuckManager () {
	}
	
	public DuckManager(int n) {
		this.n = n;
		darr = new Duck[n];
		makeDucks(n);
	}
	
	private void makeDucks(int n) {
		Random rnd = new Random();
		int rndDuck = 0;
		for(int i = 0; i< n; i++) {
			rndDuck = rnd.nextInt(2);
			switch(rndDuck) {
			case 0:
				//�θ� = �ڽ�; (�ڽ� is a �θ�)
				//�ڽ� = �θ�; (�θ� is a �ڽ�) NO Ʋ�� ����
				//����ȯ�� case
				darr[i] = new MallardDuck();
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			default:
				darr[i] = new MallardDuck();
			}
		}
	}
	
	public void displayAllDucks(Graphics g) {
		for(int i = 0; i< n; i++) {
			darr[i].display(g);
		}
	}
	
	public void swimAllDucks(Graphics g) {
		for(int i = 0; i< n; i++) {
			darr[i].swim(g);
		}
	}
	
	public void quackAllDucks(Graphics g) {
		for(int i = 0; i< n; i++) {
			darr[i].quack(g);
		}
	}

}
