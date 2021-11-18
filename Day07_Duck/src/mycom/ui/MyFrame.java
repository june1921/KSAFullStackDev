package mycom.ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import mycom.duck.*;

public class MyFrame extends JFrame {
	
	public final int FRAME_WIDTH = 800;
	public final int FRAME_HEIGHT = 600;
	Duck d = new Duck();

	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		
		if(d!=null) {
			Color c = new Color(255, 255, 255);
			g.setColor(c);
			g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
			
			d.display(g);
			d.swim(g);
			d.quack(g);
		}
	}
}
