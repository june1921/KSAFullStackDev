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
		
		//�׷���~ -> ���콺�� Ŭ�� �Ǿ��� �� paint�� �ҷ���!
		super.paint(g);	
		
		// ����Ŭ����(�̺�Ʈ ó����)
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
