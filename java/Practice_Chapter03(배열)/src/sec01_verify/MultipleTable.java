package sec01_verify;

public class MultipleTable {

	public static void main(String[] args) {
		
		

		 int[][] table = new int[9][9]; // ������ǥ�� ������ 2���� �迭 ����
	        int row, column, product;
	        for (row = 0; row < 9; row++)
	            for (column = 0; column < 9; column++)
	                table[row][column] = (row + 1) * (column + 1); // ������ ���

	        System.out.println("X  1  2  3  4  5  6  7  8  9");
	        
	        //��� 
	        for (row = 0; row < 9; row++) {
	            System.out.print((row + 1));
	            for (column = 0; column < 9; column++) {
	                product = table[row][column];
	                if (product < 10)
	                    System.out.print("  " + product);
	                else
	                    System.out.print(" " + product);
	            }
	            System.out.println();
	        }
	





	}

}
