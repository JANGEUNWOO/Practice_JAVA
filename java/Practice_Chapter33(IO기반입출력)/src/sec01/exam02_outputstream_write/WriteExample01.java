package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {

	public static void main(String[] args) throws Exception {
		
		OutputStream os=new FileOutputStream("C:/test.txt"); //�Ϲݿ��� �߻�
		
		byte[] data="abc".getBytes(); //ABC��� ���ڿ����� ����Ʈ ������ ����(���ڵ�)
		
		System.out.println(Arrays.toString(data));
		
		//3�� ����
		for(int i=0;i<data.length;i++) {
			os.write(data[i]);
			
			os.flush();
			os.close();
		}
		
	}

}
