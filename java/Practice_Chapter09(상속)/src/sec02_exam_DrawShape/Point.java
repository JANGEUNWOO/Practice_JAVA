package sec02_exam_DrawShape;

//�������� Ŭ���� ������� : 3��(�����ڴ� ����� �ƴϵȴ�. �ƿ﷯ �ʱ�ȭ���� ����� �ȵ�)
public class Point {
       
	
	  
	        int x;
	        int y;
	        
	        //�⺻������
	        public Point() {
	        	this(0,0);  //this():�Ǵٸ� �����ڸ� ȣ��, this(�ڱ��ڽ��� �ν��Ͻ��� �ǹ�)
	        }
	        
	        //�Ű����� ������(�Ű������� �ִ� �����ڰ� Ŭ�������� �����ϸ� �⺻�����ڸ� �����Ϸ��� ���� �߰�
	        public Point(int x, int y) {
	        	this.x=x;
	        	this.y=y;
	        }
           
	        //��ǥ��  ��ȯ
	        public String getxy() {
	        	return "("+this.x+","+this.y+")"; //x�� y�� ���� ���ڿ��� ��ȯ
	        }

}
