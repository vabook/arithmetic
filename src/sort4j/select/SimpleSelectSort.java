package sort4j.select;

import java.util.Arrays;

/**
 * @author vabook@163.com
 * @date 2019年5月18日 上午10:27:14
 *  时间
 *
 */
public class SimpleSelectSort {
	public static void simplSelectSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				arr[min] = arr[i] + arr[min];
				arr[i] = arr[min] - arr[i];
				arr[min] = arr[min] - arr[i];
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 5, 10, 9, 1, 6, 8, 2 };
		simplSelectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
