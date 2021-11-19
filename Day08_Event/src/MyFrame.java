import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import org.w3c.dom.events.MouseEvent;


public class MyFrame extends JFrame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	public MyFrame() {
		super();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		
		//그려라~ -> 마우스가 클릭 되었을 때 paint가 불러야!
		super.paint(g);	
		
		// 내부클래스(이벤트 처리기)
		class MyListener implements MouseListener {

			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}
	}
	
	
}
