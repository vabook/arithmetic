package sort4j.exchange;


import sort4j.util.ForeachPrint;

/**
 * @author vabook@163.com
 * @date 2019年5月18日 上午10:23:36 
 * 快速排序 不稳定,因为每次交换位置的元素都有可能是不相邻的.
 * 平均时间复杂度 nlogn 
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

			// 从后向前比较
			while (left < right && arr[right] > key)
				right--;
			// 交换左右两边的值
			if (arr[right] <= key) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}

			// 从前向后比较
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
