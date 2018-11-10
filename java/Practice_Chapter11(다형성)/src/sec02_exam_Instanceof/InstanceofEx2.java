package sec02_exam_Instanceof;

class Parent{}

class Child extends Parent{}

public class InstanceofEx2 {
//�ָ� �� ���� �Ű������� ����Ÿ���̶�� ��.
   public static void method1(Parent parent) {
      //�ſ� �߿��� �ڵ�
      if(parent instanceof Child) {
         //���� ��� ���迡 �־ intanceof�������� ����� true�̹Ƿ� ����ĳ������ ����.
         Child child = (Child)parent;
         System.out.println("method1 - Child�� ��ȯ ����");
      }
      else {
         System.out.println("method1 - Child�� ��ȯ ����");
      }
   }
   
   public static void method2(Parent parent) {
      if(parent instanceof Child) {
         parent = new Child();
         //Child child = (Child)parent;
         System.out.println("method2 - Child�� ��ȯ ����");
      }
      else {
         System.out.println("method2  - Child�� ��ȯ ����");
      }
   }
   
   public static void main(String[] args) {
      //parentA�� ���� �������� ������ �� �ڵ��̰�, parentB�� �������� �������� �� �ڵ�.
      Parent parentA = new Child();
      InstanceofEx2.method1(new Child());
      InstanceofEx2.method2(parentA);
      
      Parent parentB = new Parent();
      //�������� ����Ǹ鼭 �޼��� ȣ���� �Ǿ� ��ȯ�� �����ϴ�.
      InstanceofEx2.method1(new Child());
      InstanceofEx2.method2(parentB);
      

   }

}
