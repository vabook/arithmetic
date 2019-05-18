package sort4j.insert;

import java.util.Arrays;

import sort4j.util.ForeachPrint;

/**
* @author vabook@163.com
* @date 2019年5月18日 上午10:25:56
*  插入排序,将数组中的所有元素依次跟前面已经排好的元素相比较，如果选择的元素比已排序的元素小，则交换，直到全部元素都比较过为止。
*  平均时间复杂度n方
*/
public class InsertSort {
	public static void qucikSort(int[] arr) {
		if (arr.length == 0 || arr == null) {
			return;
		}
		
		for(int i = 1; i < arr.length; i ++) {
			int j = i - 1;
			int temp = arr[i];
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j --;
			}
			arr[j+1] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 5, 10, 9, 1, 6, 8, 2 };
		qucikSort(arr);
		
		System.out.println(Arrays.toString(arr));
		ForeachPrint.foreachPrint(arr);
	}
}
