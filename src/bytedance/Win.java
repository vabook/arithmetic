package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019��4��27�� ����10:36:10
*	�ֽ����� -�齫
*/
public class Win {

	//������
	public static ArrayList<Integer> list = new ArrayList<>();
	
	//����ÿ���Ƶĳ��ִ���<1,3>,<2,3> <5,3>,<6,3>,<9,1>
	public static HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
	
	//������������ <3,4>,<1,1>
	public static HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[13];
		
		for(int i = 0; i < 13 ; i ++) {
			arr[i] = scanner.nextInt();
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
			}else {
				hashMap.put(arr[i], 1);
			}
		}
		
		testWin();
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		
		
	}
	public static void testWin() {
		
		Iterator<Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, Integer> next = iterator.next();
			if (hashMap2.containsKey(next.getValue())) {
				hashMap2.put(next.getValue(),hashMap2.get(next.getValue()) + 1 );
			}else {
				hashMap2.put(next.getValue(), 1);
			}
		}
		//����������������ε���
		if (!hashMap2.containsValue(2)) {
			if (hashMap2.get(3) == 4) {
				list.add(hashMap2.get(1));
			}else {
				
			}
		}else {
			
		}
		
		
	}
}
