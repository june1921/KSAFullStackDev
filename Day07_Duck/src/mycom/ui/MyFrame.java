package mycom.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import mycom.duck.*;

public class MyFrame extends JFrame {
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	DuckManager dm = new DuckManager(10);

	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	/*
	public void makeDucks() {
		Random rnd = new Random();
		int rndDuck;
		for(int i=0; i<d.length; i++) {
			rndDuck = rnd.nextInt(2);
			
			switch(rndDuck) {
			case 0:
				//부모 = 자식; (자식 is a 부모)
				//자식 = 부모; (부모 is a 자식) NO 틀린 명제
				//형변환의 case
				d[i] = new MallardDuck();
				break;
			case 1:
				d[i] = new RedDuck();
				break;
			default:
				d[i] = new MallardDuck();
			}
			/*
			if(rndDuck == 0) {
				d[i] = new MallardDuck();
			}
			else
				d[i] = new RedDuck();
			*/
	//	}
	//}
	//*/
	
	
	public void paint(Graphics g) {
		super.paint(g);
		if(dm!=null) {
			dm.displayAllDucks(g);
			dm.swimAllDucks(g);
			dm.quackAllDucks(g);		
		}
	}
	
}
