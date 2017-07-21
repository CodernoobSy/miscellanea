package LinkedTable;

/**
 * 简单的选择排序思想
 * 
 * @author huaoshi5
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = { 11, 8, 35, 36, 77, 48, 33 ,22,15};
		selectSort(arr);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void selectSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			int min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
}
