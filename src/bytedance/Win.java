package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月27日 上午10:36:10
*	字节跳动 -麻将
*/
public class Win {

	//保存结果
	public static ArrayList<Integer> list = new ArrayList<>();
	
	//保存每个牌的出现次数<1,3>,<2,3> <5,3>,<6,3>,<9,1>
	public static HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
	
	//保存牌数次数 <3,4>,<1,1>
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
		//如果不包括出现两次的牌
		if (!hashMap2.containsValue(2)) {
			if (hashMap2.get(3) == 4) {
				list.add(hashMap2.get(1));
			}else {
				
			}
		}else {
			
		}
		
		
	}
}
