package sec05.exam04_graphics_iamge02;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicExample extends Frame{

	
	Image img=null;
	int width=0;
	int height=0;
	//������
	public GraphicExample(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		   //�̹��� ��� ���� ������ (������)
		   img = toolkit.getImage("D:\\eclipse\\Practice_Chapter29(AWT-GUI����)\\src\\sec05\\exam05_graphics_iamges\\rin.jpg");
		   
		   this.setBounds(100,100,500,500);
		   this.setVisible(true);
		
		//Frame�� (100,100)�� ��ġ�� 
		this.setBounds(100,100,1000,1000);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		/* try{
		 * Thread.sleep(1000);
		 * }catch{InterruptedException e){}
		 */
		if(img==null) {
			System.out.println("image��ü�� �����ϴ�.!");
			return;
		}
		//���� �������� ����, ���θ� ���ϴ� ��
		width=this.getWidth();
		height=this.getHeight();
		System.out.println("������ ���� ����:"+width+"������ ���� ����:"+height);
		//�ε��� �̹����� width�� height�� ���Ѵ�. ���� ImageObsever�� this�� �����ϰ� �ִ�.
		int imgWidth=img.getWidth(this);
		int imgheight=img.getHeight(this);
		System.out.println(Thread.currentThread().getName());
		System.out.println("�̹��� ���� ����:"+imgWidth+"�̹��� ���� ����:"+imgheight);
		//�̹����� Frame�� �߾ӿ� ���
		 g.drawImage(img, (this.getWidth()-imgWidth)/2, (this.getHeight()-imgheight)/2, this);
	}
	
	
	
}
