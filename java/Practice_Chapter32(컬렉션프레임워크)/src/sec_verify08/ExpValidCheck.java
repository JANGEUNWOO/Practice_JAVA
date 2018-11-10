package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {

	public static Stack<String> st = new Stack<String>();
	public static String expression1 = "( (2*7) + 3 - 1)";
	public static String expression2 = "( (2*7) + 3 - 1";

	public static void ExpressionCheck(String expression) {

		st.push(expression2);
		st.push(expression1);

		if (st.pop().equals(expression)) {
			System.out.println("expression1:" + expression);
			System.out.println("��ȣ�� ��ġ�մϴ�.");
		} else {
			System.out.println("expression2:" + expression);
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
		}

	}

	public static void main(String[] args) {
		ExpValidCheck.ExpressionCheck(expression1);
		ExpValidCheck.ExpressionCheck(expression2);

	}

}
