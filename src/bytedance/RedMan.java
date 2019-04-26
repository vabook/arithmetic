package bytedance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019��4��26�� ����4:36:23
* �ֽ����� --��������
*
*/
public class RedMan {

	//�û��Ĺ�ע�б�
	public static  KV[] kvs ;
	
	//k ����ע��,v�����ע�б�,����Щ�˹�ע�������
	public static HashMap<Integer, ArrayList<Integer>> hashMap =new HashMap<Integer,ArrayList<Integer>>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//n����
		int n = scanner.nextInt();
		
		//m����ϵ��
		int m = scanner.nextInt();
		
		kvs = new KV[m];
		
		
		//��ȡ����
		for(int i = 0 ; i< m;i++) {
			kvs[i] = new KV(scanner.nextInt(),scanner.nextInt());
			
			//ÿ�ζ���ʼ������ռ�
			ArrayList<Integer> arrayList = new ArrayList<>();
			
			//��ת
			if (hashMap.containsKey(kvs[i].y)) {
				arrayList = hashMap.get(kvs[i].y);
				arrayList.add(kvs[i].x);
			}else {
				arrayList.add(kvs[i].x);
				hashMap.put(kvs[i].y, arrayList);
			}
			
		}
		

		//����HashMap��ÿ��Ԫ�صı���ע�б�
		 Iterator<Entry<Integer, ArrayList<Integer>>> iterator = hashMap.entrySet().iterator();
		
		 while(iterator.hasNext()) {
			 Entry<Integer, ArrayList<Integer>> next = iterator.next();
			 Integer key = next.getKey();
			 ArrayList<Integer> value = next.getValue();
			 
			 //�����Լ��������˹�ע
			 if (value.size() == n - 1) {
				System.out.println(key);
			}
			  
			 
		 }
		
		//ÿ���û��ı���ע�б�
		
		
	}
	
}
/**
 * x ָ ��ע��,y������ע��
 */
class KV{
	int x;
	int y;
	public KV(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
