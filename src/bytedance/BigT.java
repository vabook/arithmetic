package bytedance;

import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月27日 上午11:37:58
*	字节跳动 - 特工距离
*/
public class BigT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(method(arr, d));
	}
	
	public static int method(int[] arr,int d) {
		int s = arr.length - 1;
		//如果最大减最小都满足最远距离
		if (arr[s] -arr[0] < d) {
			int m = 1;
			int count =3;
			while(count -- >0) {
				m *= s;
				s--;
			}
			return m / 6;
		}
		int gtCount = 0;
		for(int i = 0 ; i < arr.length - 1;i++) {
			
			if (arr[i+1] - arr[i] > d ) {
				gtCount ++;
			}
		}
		if (gtCount >= arr.length -3) {
			return 1;
		}
		return 0;
	}
}
