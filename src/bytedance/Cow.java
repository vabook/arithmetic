package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月27日 上午10:06:47
* 字节跳动-母牛的个数
*
*/
public class Cow {

	//保存第几头牛,以及它的当前岁数
	public static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//第n年
		int n = scanner.nextInt();
		//第一头1岁
		hashMap.put(1, 1);
		System.out.println(countCow(n));
		
	}
	public static int countCow(int n) {
		if (n == 1) {
			
		}

		if (n == 3) {
			
			hashMap.put(2, 1);
		}
		Iterator<Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, Integer> entry = iterator.next();
			entry.getKey();
		}
		return n;
		
	}
	
}
