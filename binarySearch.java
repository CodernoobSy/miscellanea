package leetcode;

import java.util.Arrays;

/**
 * 实现一个int型升序数组的二分查找
 * @author huaoshi5
 *
 */
public class binarySearch {
	public static void main(String[] args) {
		int[] arr = {1,3,77,4,33,22};
		Arrays.sort(arr); //{1,3,4,22,33,77}
		System.out.println("要查找的元素在数组排序后的下标为:" + binarySearch(arr, 22));
	}
	
	public static int binarySearch(int[] arr,int goal) {
		int max = arr.length - 1;
		int min = 0;
		int mid = (max + min) / 2;
		
		while(arr[mid] != goal) {
			if (arr[mid] > goal) {
				max = mid - 1;
			} else if (arr[mid] < goal) {
				min = mid + 1;
			}
			mid = (max + min) / 2;
		}
		return mid;
	}
}
