package sec04_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {

	
	//�⺻��Ÿ���� ���� ������ �ص� �ƹ��� ����� ���� ������ �ȴ�.
	//������, ������ Ÿ���� ������ �����ϱ� ������ ������ �߻��� �ȴ�.
	String name;
	int age;
    int[] scores=null;  //����Ÿ��
    Car car=null;
	
    //������
    public Member(String name,int age,int[] scores,Car car) {
     
      this.name=name;
      this.age=age;
      this.scores=scores;
      this.car=car;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
    	//���� ���� ����(Object�� clone()�޼��带 ����ȣ��)
    	Member cloned=(Member)super.clone();
    	//Arrays.copyof�� �����迭 ���̸�ŭ ������
    	//����Ÿ���� ���� �ݵ�� ���Ϸ��Ӱ� �����Ǵ� �ڵ带 ������ ����� �Ѵ�.
    	cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
    	cloned.car=new Car(this.car.model);
    	return cloned; //���� ������ �� cloned�� ������.
    }
    
    //���� ������ �ν��Ͻ��� ����
    public Member getMember() {
    	Member cloned=null;
    	try {
    	cloned=(Member)this.clone();
    	}catch(CloneNotSupportedException e){}
    	
    	return cloned;   //���� ����(thin cloned)�� Member�ν��Ͻ� ������.
    }
}

