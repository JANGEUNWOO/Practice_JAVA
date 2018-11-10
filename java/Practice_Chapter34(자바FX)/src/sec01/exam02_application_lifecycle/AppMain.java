package sec01.exam02_application_lifecycle;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() {
		System.out.println("������ ȣ��");
		System.out.println("���ེ����:" + Thread.currentThread().getName());
	}
	// JAvaFX launcher �����尡 ������

	@Override
	public void init() throws Exception {
		// init()�޼��� UI ���� �� �����ϴ� �ڵ尡 ����� ���� �ȵ� ���� �߻��Ѵ�.
		// init()�� �ַ� ����Ű����� JavaFX application�����忡 ������ �������� ���ǰ� �Ѵ�.
		System.out.println("init()_����");
		System.out.println("���ེ����:" + Thread.currentThread().getName());
	}
	// ���ེ����� javaFx Application

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("start()_����");
		String threadName = Thread.currentThread().getName();
		System.out.println("���ེ����:" + threadName);
		primaryStage.show(); //������ â ����
	}
	
	
	@Override
	public void stop() throws Exception{
		//������ ���� xǥ�ø� Ŭ���� �ڵ� ����
		//application�� ����� �����ؾ��� �ڵ���� �ַ� �ۼ��Ѵ�
		System.out.println("stop()_����");
	System.out.println("���ེ����:"+Thread.currentThread().getName());
	}
	
	//���ེ����� ���ν�����
	public static void main(String[] args) {
		System.out.println("main()_����");
		System.out.println("���ེ����:" + Thread.currentThread().getName());
		// �ڹ�FX���ø����̼� �����带 �����Ͽ� start()�� ȣ���Ͽ� �ش�.
		Application.launch(args);
	}

}
