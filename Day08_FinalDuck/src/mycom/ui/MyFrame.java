package mycom.ui;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

import mycom.duck.Duck;
import mycom.duck.DuckManagement;

public class MyFrame extends JFrame{

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	DuckManagement dm = new DuckManagement();
	
	Duck darr[] = new Duck[20];

	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
			dm.displayAllDucks(g);
			dm.quackAllDucks(g);
			dm.flyAllDucks(g);
			dm.swimAllDucks(g);
	}
};

