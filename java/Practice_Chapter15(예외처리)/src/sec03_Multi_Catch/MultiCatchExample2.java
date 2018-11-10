package sec03_Multi_Catch;

import sec01_exam_runtime_exception.NumberformatExceptionExample;

public class MultiCatchExample2 {

	public static void main(String[] args) {
		
		
		try {
			//�������ܰ� �߻��� ���� �ֳ�?
			String data1=args[0];
			String data2=args[1];
			//���� �������ܰ� �߻��� �� �ִ�?
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"+"+result);
		}
		
		/*
		    catch(Exception e) {
			System.out.println("�˼����� ���ܰ� �߻�����.");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		*/
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("����Ű����� �����ϰų� ���ڷ� ��ȭ�Ҽ� ����"+e.toString());
		    System.out.println("������ java CatchByExceptionkindExample num1 num2");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberformatException �߻�");
			System.out.println("���ڷ� ��ȯ�Ҽ� �����ϴ�. �Ű������� ���� Ȯ���ϼ���");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		
		catch(Exception e) {
			System.out.println("�˼����� ���ܰ� �߻�����.");
			System.out.println("���α׷��� ���������մϴ�.");
		}
		finally {
			System.out.println("�ٽ� ������!!");
		}

	}
}

	
