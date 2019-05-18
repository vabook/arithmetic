package sort4j.insert;

import java.util.Arrays;

import sort4j.util.ForeachPrint;

/**
* @author vabook@163.com
* @date 2019��5��18�� ����10:25:56
*  ��������,�������е�����Ԫ�����θ�ǰ���Ѿ��źõ�Ԫ����Ƚϣ����ѡ���Ԫ�ر��������Ԫ��С���򽻻���ֱ��ȫ��Ԫ�ض��ȽϹ�Ϊֹ��
*  ƽ��ʱ�临�Ӷ�n��
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
