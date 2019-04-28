package bytedance;

import java.util.HashMap;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月27日 上午11:05:26
*	字节跳动 - 1的个数
*/
public class IncludeOne {
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		int[] arr = new int[n];
		
		//保存0 1次数
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i = 0 ; i < n; i ++) {
			arr[i] = scanner.nextInt();
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			}else {
				hashMap.put(arr[i], 1);
			}
		}
		System.out.println(maxLength(arr,k,hashMap));
		
		
		
	}
	public static int maxLength(int[] arr,int k,HashMap<Integer, Integer> hashMap) {
		
		if (k == 0) {
			boolean flag = true;
			int count = 0;
			int max = 0;
			for(int i = 0 ; i < arr.length; i ++) {
				if (arr[i] == 1) {
					flag = true;
				}else {
					flag = false;
				}
				if (arr[i] == 1 && flag) {
					count += 1;
					max = count > max?count:max;
				}
				if (!flag) {
					count = 0;
				}
				
			}
			return max;
		}
		
	if (hashMap.get(0) < k) {
		return arr.length;
	}
	
	
	if (hashMap.get(1) == 0) {
		return 0;
	}
	
	for(int i = 0 ; i < arr.length; i ++) {
		
	}

	return 0;
		
	}

}
