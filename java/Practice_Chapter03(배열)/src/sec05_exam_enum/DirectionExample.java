package sec05_exam_enum;

public class DirectionExample {

	public static void main(String[] args) {
		
		
		Direction d1=Direction.EAST;
		Direction d2=Direction.valueOf("WEST");
		//Enum클래스의 정적매서드만 valueof를 호출함. 그 인자값은 Enum명.class, "열거형상수"임
		Direction d3=Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d2="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ?"+(d1==d2));
		System.out.println("d1==d3 ?"+(d1==d3));
		System.out.println("d1.equals(d3) ?"+d1.equals(d3));
		//System.out.println("d2>d3?"+(d1>d3));//에러   주소값인데 비교, 산술계산 한다는게 에러사항이다!!
		System.out.println("d1.compareTo(d3) ?"+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ?"+(d1.compareTo(d2)));
		
		switch(d1) {
		case EAST:
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH.");
			break;
		case WEST:
			System.out.println("The direction is WEST.");
			break;
		case NORTH:
			System.out.println("The direction is NORTH.");
			break;
		default:
			System.out.println("Invaild direction.");
			break;
		}
		//열거형타입.value() 리턴값이 열거형 객체 배열이다.
		Direction[] dArr=Direction.values();
		//향상된 for문
		for(Direction d:dArr)//for(Direction d :Direction.value();
			System.out.printf("%s=%d%n",d.name(),d.ordinal());
		

	}

}
