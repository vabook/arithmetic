package bytedance;

import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019��4��25�� ����8:27:29
*  ����ͷ�������⣺����һϵ�е㣬��� һϵ������ϵ�����ĵ㣨�ҷ������޵����Ҫ�ߣ�������x��ģ�y������С
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
		
		//ÿһ����������Ԫ�����Ƚ�
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
