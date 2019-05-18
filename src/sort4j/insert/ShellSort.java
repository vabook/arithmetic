package sort4j.insert;

import java.util.Arrays;

/**
* @author vabook@163.com
* @date 2019��5��18�� ����10:26:05
*	������������зָ������������,�ֱ�������в�������
*	���ղ���gap�����з���,�ٽ�gap�۰�,��gap=1ʱ,���ò�������,���
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
