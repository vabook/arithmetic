package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019��4��27�� ����10:06:47
* �ֽ�����-ĸţ�ĸ���
*
*/
public class Cow {

	//����ڼ�ͷţ,�Լ����ĵ�ǰ����
	public static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//��n��
		int n = scanner.nextInt();
		//��һͷ1��
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
