package sort4j.exchange;

import sort4j.util.ForeachPrint;

/**
 * @author vabook@163.com
 * @date 2019年5月18日 上午10:23:25
 *	冒泡排序,属于稳定排序
 */
public class BubbleSort {
	public static void sort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int length = array.length;
		int temp;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 2, 4, 7, 6, 9, 23, 5 };
		sort(array);
		ForeachPrint.foreachPrint(array);
	}
}
