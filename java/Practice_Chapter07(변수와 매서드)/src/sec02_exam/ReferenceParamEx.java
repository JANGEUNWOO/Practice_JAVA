package sec02_exam;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		
		
		
		int[] arr =new int[] {1,2};
		System.out.println(arr[1]);
		arr_change(arr);
		System.out.println(arr[1]);
		
		
		Data d= new Data();
		d.x=10;
		System.out.println("main():x="+d.x);
		
		//주소를 넘겨줌. 예)시계가 어딨니 라는 형태
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main():x="+d.x);
	}
		//참조형 매개변수
		
		static void change(Data d) {
			d.x=1000;
			System.out.println("change():x="+d.x);
			
		}
		
		static void arr_change(int[] arr) {
			arr[1]=10;
			System.out.println(arr[1]);
		}
	

}
