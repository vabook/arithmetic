package bytedance;

import java.util.Scanner;

/**
* @author vabook@163.com
* @date 2019��4��25�� ����5:20:32
* ����Scanner��
*
*/
public class TestScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//nextInt����,�ո񶼿��Ը���
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
		
		//������next()������ȡ�ַ���������tab��space��enterʱ���������Ϊ�ϵ㣬ֻ���ȡ֮ǰ������
		//String  string = scanner.next();
		//������in.nextLine()������ȡһ�����������,��������tab��space���������Ļ�ȡ����������enterʱ����ʾ������ϡ�
		//���ʹ����in.next()��û�йرգ���ʹ��in.nextLine()����in.nextLine()���ȡǰһ�����ضϺ������
		
		//!!!!!!!!!!!!��next��nextline����ʱ,��Ҫдһ��nextline
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
