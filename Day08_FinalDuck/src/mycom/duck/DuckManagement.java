package mycom.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManagement {
	private Duck[] darr = new Duck[20];

	public DuckManagement() {
		makeDucks();
	}
	
	public void makeDucks() {
		Random rnd = new Random();
		
		
		for(int i=0; i<darr.length; i++) {
			int rndDucks = rnd.nextInt(4); //0, 1, 2, 3
			switch(rndDucks) {
			case 0:
				darr[i] = new MallardDuck();
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			case 2:
				darr[i] = new RubberDuck();
				break;
			case 3:
				darr[i] = new DecoyDuck();
				break;
			default:
				darr[i] = new MallardDuck();
				break;
			}
		}	
	}
	
	public void displayAllDucks (Graphics g) {
		for(Duck d:darr) {
			d.display(g);
		}
	}
	
	public void quackAllDucks (Graphics g) {
		for(Duck d:darr) {
			if(d instanceof Quackable) {
				((Quackable)d).quack(g);
			}
		}
	}
	
	public void swimAllDucks (Graphics g) {
		for(Duck d:darr) {
			d.swim(g);
		}
	}
	
	public void flyAllDucks (Graphics g) {
		for(int i = 0; i < darr.length; i++) {
			if(darr[i] instanceof Flyable) {
				((Flyable)darr[i]).fly(g);
			}
		}
	}
}
