package sec03.exam05_file_writer;

import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		// FileReader�� ���ڴ����� �б� ������ �ؽ�Ʈ�� �ƴ�
		//�׸�, �����, ���� ���� ������ ���� �� ������ �˵��� ����
		
		FileReader fr=new FileReader("D:\\\\eclipse\\\\Practice_Chapter31(��Ƽ������)\\\\src\\\\sec_verify01\\\\MovieThread.java");
        int readCharNo;
        
        char[] cbuf=new char[100];
        int i=0;
        //���ڿ��� ������ ���ڹ迭�� �����ϰ� ���� ���ڹ���Ʈ���� �����Ѵ�.
        while((readCharNo=fr.read(cbuf))!=-1) {
        	String data=new String(cbuf,0,readCharNo);
        	System.out.print(data);
        	i++;
        }
        System.out.write(13);
        System.out.println("���μ�:"+i);
        fr.close();
	}

}
