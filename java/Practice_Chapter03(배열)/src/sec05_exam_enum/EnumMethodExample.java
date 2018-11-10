package sec05_exam_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		
		//name() �޼ҵ�
		Week today=Week.SUNDAY;
		String name=today.name();//������ �̸��� String���� ��ȯ
		System.out.println(name);
		
		//ordinal() �޼ҵ�
		int ordinal=today.ordinal(); //���Ű�ü �������(0������ ����)
		System.out.println(ordinal);
		
		//compareTo() �żҵ�(���Ű�ü ���� ��)
		Week day1=Week.MONDAY; //day1=0
		Week day2=Week.WEDNESDAY;//day2=2
		int result1=day1.compareTo(day2);//0-2=-2
		int result2=day2.compareTo(day1);//2-0=2
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()�ż���
		Week weekDay=Week.valueOf("SUNDAY");
		
		if(weekDay==Week.SATURDAY||weekDay==Week.SUNDAY) {
			System.out.println("�ָ�, �ָ��̱���");
			
		}
		else {
			System.out.println("���� �̱���");
			
		}
		//value() �޼ҵ�
		Week[] days=Week.values();
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
			
		}
		//���� for��
		for(Week day:days) {
			System.out.println(day.hashCode()); //�޸� �ּ� 16������ 10������ ��ȯ(����ũ�� ������ ����ũ�� ������ ��ȯ)
		}
		
		

	}

}
