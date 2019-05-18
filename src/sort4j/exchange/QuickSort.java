package sort4j.exchange;


import sort4j.util.ForeachPrint;

/**
 * @author vabook@163.com
 * @date 2019��5��18�� ����10:23:36 
 * �������� ���ȶ�,��Ϊÿ�ν���λ�õ�Ԫ�ض��п����ǲ����ڵ�.
 * ƽ��ʱ�临�Ӷ� nlogn 
 *
 */
public class QuickSort {
	public static void sort(int[] arr, int left, int right) {

		if (arr == null || arr.length == 0) {
			return;
		}
		if (left > right) {
			return;
		}
		int low = left;
		int high = right;
		int key = arr[left];
		while (left < right) {

			// �Ӻ���ǰ�Ƚ�
			while (left < right && arr[right] > key)
				right--;
			// �����������ߵ�ֵ
			if (arr[right] <= key) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}

			// ��ǰ���Ƚ�
			while (right > left && arr[left] < key)
				left++;
			if (arr[left] >= key) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}

			if (left > low)
				sort(arr, low, left - 1);
			if (right < high)
				sort(arr, right + 1, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 5, 10, 9, 1, 6, 8, 2 };

		sort(arr, 0, arr.length - 1);
		ForeachPrint.foreachPrint(arr);
	}
}
