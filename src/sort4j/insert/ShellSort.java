package sort4j.insert;

import java.util.Arrays;

/**
* @author vabook@163.com
* @date 2019年5月18日 上午10:26:05
*	将待排序的序列分割成若干子序列,分别对子序列插入排序
*	按照步长gap对序列分组,再讲gap折半,当gap=1时,再用插入排序,完成
*/
public class ShellSort {
	public static void shellSort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		int gap = arr.length / 2;
		for(;gap >= 1;gap = gap/2) {
			for(int i = 0; i + gap < arr.length;i++) {
				for(int j = 0; j+gap <arr.length; j += gap) {
					if (arr[j] > arr[j+gap]) {
						arr[j] = arr[j] + arr[j + gap];
						arr[j + gap] = arr[j] - arr[j + gap];
						arr[j] = arr[j] - arr[j + gap];
					}
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 5, 10, 9, 1, 6, 8, 2 };
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
