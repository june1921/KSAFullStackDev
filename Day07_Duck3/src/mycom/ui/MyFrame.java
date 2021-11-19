package mycom.ui;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

import mycom.duck.Duck;
import mycom.duck.DuckManager;
import mycom.duck.MallardDuck;
import mycom.duck.RedDuck;

public class MyFrame extends JFrame{

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManager mgr = new DuckManager();
	
	Duck[] darr = new Duck[10];
	
	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(mgr!=null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackAllDucks(g);		
		}
	}
	
};

