package sec02_exam_DrawShape;


//������ ���� ������ �ִ� �ﰢ��(has a����)
public class Triangle extends Shape{
     
	
	
	
	//���� 3���� �־�� ��μ� �ﰢ���� �ϼ��ǹǷ�, Point�� �迭�� �����ߴ�.
	Point[] p=null;
	
	//������
	public Triangle(Point[] p) {
		super();
		this.p=p;
	}
	//�������̵�
	@Override
	public void draw() {
		System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s]%n",this.p[0].getxy()
				,this.p[1].getxy(),this.p[2].getxy(),this.color);
	}
	 
	
}
