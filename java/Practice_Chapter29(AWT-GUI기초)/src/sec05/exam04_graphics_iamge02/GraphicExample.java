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
	//생성자
	public GraphicExample(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		   //이미지 경로 직접 설정함 (절대경로)
		   img = toolkit.getImage("D:\\eclipse\\Practice_Chapter29(AWT-GUI기초)\\src\\sec05\\exam05_graphics_iamges\\rin.jpg");
		   
		   this.setBounds(100,100,500,500);
		   this.setVisible(true);
		
		//Frame을 (100,100)의 위치에 
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
			System.out.println("image객체가 없습니다.!");
			return;
		}
		//현재 프레임의 가로, 세로를 구하는 것
		width=this.getWidth();
		height=this.getHeight();
		System.out.println("프레임 가로 길이:"+width+"프레임 세로 길이:"+height);
		//로딩된 이미지의 width와 height를 구한다. 역시 ImageObsever를 this로 설정하고 있다.
		int imgWidth=img.getWidth(this);
		int imgheight=img.getHeight(this);
		System.out.println(Thread.currentThread().getName());
		System.out.println("이미지 가로 길이:"+imgWidth+"이미지 세로 길이:"+imgheight);
		//이미지를 Frame의 중앙에 출력
		 g.drawImage(img, (this.getWidth()-imgWidth)/2, (this.getHeight()-imgheight)/2, this);
	}
	
	
	
}
