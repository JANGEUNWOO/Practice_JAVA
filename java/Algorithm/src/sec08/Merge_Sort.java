package sec08;

public class Merge_Sort {

	int number = 8;
	int[] sorted = new int[8]; // 정렬 배열은 반드시 전역변수로 선언
	int size;
	int count = 0;

	void merge(int a[], int m, int middle, int n) {

		int i = m;
		int j = middle + 1;
		int k = m;

		// 작은 순서대로 배열에 삽입
		while (i <= middle && j <= n) {
			if (a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		// 남은 데이터도 삽입
		if (i > middle) {
			for (int t = j; t <= n; t++) {
				sorted[k] = a[t];
				k++;
			}
		} else {
			for (int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		// 정렬된 배열을 삽입
		for (int t = m; t <= n; t++) {
			a[t] = sorted[t];
		}
	}

	public void mergeSort(int a[], int m, int n) {

		// 크기가 1보다 큰 경우
		if (m < n) {
			int middle = (m + n) / 2;
			mergeSort(a, m, middle);
			mergeSort(a, middle + 1, n);
			merge(a, m, middle, n);
		}

	}

	public static void main(String[] args) {

		Merge_Sort ms = new Merge_Sort();

		int[] array = { 7, 6, 5, 8, 3, 5, 9, 1 };

		ms.mergeSort(array, 0, ms.number - 1);
		for (int i = 0; i < ms.number; i++) {
			System.out.printf("%d ", array[i]);

		}

	}
}