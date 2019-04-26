package bytedance;

import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019年4月25日 下午8:27:29
*  今日头条笔试题：输入一系列点，输出 一系列坐标系中最大的点（右方区域无点比其要高）。比其x大的，y都比它小
*
*/
public class Second {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		XY[] xys = new XY[n];
		for(int i = 0 ; i < n; i ++) {
			xys[i] = new XY();
			xys[i].x = scanner.nextInt();
			xys[i].y = scanner.nextInt();
		}
		scanner.close();
		
		//每一个都与其他元素作比较
		for(int i=0;i<xys.length;i++) {
			boolean isNull = false;
			for(int j = 0;j <xys.length;j++) {
				if(i != j && xys[j].x > xys[i].x && xys[j].y > xys[i].x) {
					isNull = true;
				}
			}
			if (! isNull) {
				System.out.println(xys[i].x + "\t" + xys[i].y);
			}
		}
	}
}
class XY{
	int x,y;
}
