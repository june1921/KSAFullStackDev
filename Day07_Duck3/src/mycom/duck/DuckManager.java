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
				//�θ� = �ڽ�; (�ڽ� is a �θ�)
				//����ȯ
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
	
	//��ĳ���� 
	//�Ϲ��� ����ȯ
	//�ٿ�ĳ������ ��������
	//�θ� = �ڽ�
	//�ڽ� = �θ�(X)
	//������ �޼ҵ� �������̵��� �Ͼ ��� �θ��� ���� not visible ���°� �ȴ�.
	//�ڽ� Ŭ�������� �߰� Ȯ��� ����� ���� �Ұ�
	//�� ĳ������ �ٽ� �ٿ� ĳ������ ���� �׷��� �̶��� ����� ����ȯ�� �ʿ��ϴ�.��
	
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
