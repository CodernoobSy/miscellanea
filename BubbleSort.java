package LinkedTable;
/**
 * 简单的实现冒泡排序的思想
 * @author huaoshi5
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {11,8,35,36,77,48,33};
		bubbleSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
	}
}


