package bytedance;

import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月25日 下午5:20:32
* 测试Scanner类
*
*/
public class TestScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//nextInt换行,空格都可以隔开
	/*	int a = scanner.nextInt();
		System.out.println(a);
		int[] aa = new int[10];
		int temp;
		for(int i = 1 ; i <= a; i++) {
			while((temp = scanner.nextInt()) != 0) {
				aa[i] = temp;
			}
		}
		System.out.println(aa);*/
		
		//单独用next()方法获取字符串，输入tab、space、enter时，会从这里为断点，只会获取之前的数据
		//String  string = scanner.next();
		//单独用in.nextLine()方法获取一行输入的数据,无论输入tab、space都会完整的获取到，当输入enter时，表示输入完毕。
		//如果使用完in.next()后没有关闭，就使用in.nextLine()，则in.nextLine()会获取前一方法截断后的数据
		
		//!!!!!!!!!!!!当next与nextline连用时,需要写一行nextline
		/*scanner.nextLine();
		String string2 = scanner.nextLine();
		System.out.println(string);
		System.out.println(string2);*/
		
		int n = scanner.nextInt();
		int x ,y;
		for(int i = 0; i< n ; i++) {
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.println(x +" "+ y);
		}
		
		
	}
}
