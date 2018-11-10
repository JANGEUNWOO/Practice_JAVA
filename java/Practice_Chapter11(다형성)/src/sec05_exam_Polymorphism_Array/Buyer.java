package sec05_exam_Polymorphism_Array;

public class Buyer {
	int money=1000;   //�����ݾ�
	int bonusPoint=0; //���ʽ� ����
	
	Product[] item=new Product[10];//������ ��ǰ�� �����ϱ� ���� �迭
	int i=0; //Product�迭�� ���� ī����.
	
	
	public void buy(Product p) {
		
		if(this.money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			this.money=0;
			return;
		}
	
	this.money-=p.price;  //���������� ������ ��ǰ�� ������ ����.
	this.bonusPoint+=p.bonusPoint; //
	this.item[i++]=p; //��ǰ�� Product[] item�� �����Ѵ�.
	System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}	
	//������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
	public void summary() {
		int sum=0; //������ ��ǰ�� �����հ�
		String itemList="";//������ ��ǰ���
		
	//�ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
	for(int i=0;i<item.length;i++) {
		if(item[i]==null)
			break;
		sum+=this.item[i].price;
		
		if(i==9)
			itemList +=this.item[i];
		else
			itemList +=this.item[i]+",";
	}
	
	
	System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
	System.out.println("�����Ͻ� ��ǰ�� ����Ʈ��"+itemList+"�Դϴ�.");
    }
	
}