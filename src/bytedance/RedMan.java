package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月26日 下午4:36:23
* 字节跳动 --抖音红人
*
*/
public class RedMan {

	//用户的关注列表
	public static  KV[] kvs ;
	
	//k 被关注人,v代表关注列表,即哪些人关注了这个人
	public static HashMap<Integer, ArrayList<Integer>> hashMap =new HashMap<Integer,ArrayList<Integer>>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n个人
		int n = scanner.nextInt();
		
		//m个关系对
		int m = scanner.nextInt();
		
		kvs = new KV[m];
		
		
		//读取数据
		for(int i = 0 ; i< m;i++) {
			kvs[i] = new KV(scanner.nextInt(),scanner.nextInt());
			
			//每次都初始化链表空间
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			//反转
			if (hashMap.containsKey(kvs[i].y)) {
				arrayList = hashMap.get(kvs[i].y);
				arrayList.add(kvs[i].x);
			}else {
				arrayList.add(kvs[i].x);
				hashMap.put(kvs[i].y, arrayList);
			}
			
		}
		

		//迭代HashMap中每个元素的被关注列表
		 Iterator<Entry<Integer, ArrayList<Integer>>> iterator = hashMap.entrySet().iterator();
		
		 while(iterator.hasNext()) {
			 Entry<Integer, ArrayList<Integer>> next = iterator.next();
			 Integer key = next.getKey();
			 ArrayList<Integer> value = next.getValue();
			 
			 //除了自己被所有人关注
			 if (value.size() == n - 1) {
				System.out.println(key);
			}
			  
			 
		 }
		
		//每个用户的被关注列表
		
		
	}
	
}
/**
 * x 指 关注人,y代表被关注人
 */
class KV{
	int x;
	int y;
	public KV(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
