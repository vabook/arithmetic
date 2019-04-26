package bytedance;

import java.util.Scanner;

/**
 * @author vabook@163.com
 * @date 2019��4��26�� ����10:51:01 
 * �ֽ����� ���籭��Ļʽ��Ŀ
 *
 */
public class WordCup {

	// ���ڱ���01����
	public static int[][] arr;
	public static Boolean[][] mark;
	public static int count = 0;
	public static int maxCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// m*nά
		int m, n;
		String line = scanner.nextLine();
		String[] string = line.split(",");
		m = Integer.parseInt(string[0]);
		n = Integer.parseInt(string[1]);

		// ����
		scanner.nextLine();

		// ��ȡ��������
		for (int i = 0; i < m; i++) {
			String string2 = scanner.nextLine();
			String[] strings = string2.split(",");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(strings[j]);
				mark[i][j] = false;
			}
			scanner.nextLine();
		}
		
		System.out.println(count + ',' + maxCount);
		

	}
	
	/**
	 * ����ĳ��λ�õĵ�,�����������ڵĵ�ĸ���,������Ѿ������ĵ�
	 * @param arr
	 * @param x
	 * @param y
	 * @param mark
	 * @return
	 */

	public static  int dfs(int[][] arr, int x, int y, Boolean[][] mark) {

		if (x >= arr.length || y > arr[0].length || x < 0 || y < 0)
			return 0;

		if (mark[x][y] == true)
			return 0;

		if (arr[x][y] == 0) {
			return 0;
		}

		mark[x][y] = true;
		
		return 1 + dfs(arr, x-1, y-1, mark) + dfs(arr, x-1, y, mark)
				+ dfs(arr, x-1, y +1, mark) + dfs(arr, x, y - 1, mark)
				+ dfs(arr, x, y +1, mark) + dfs(arr, x+1, y + 1, mark)
				+ dfs(arr, x + 1, y, mark) + dfs(arr, x, y - 1, mark);
	}
	
	//�����м�����������
	public static int count(int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j < arr[0].length; j ++) {
				if (arr[i][j] == 0) {
					continue;
				}else {
					
					//����ĳ��������ڶ�,���ĳ�����Ѿ�����,��ô�����ټ���,mark����Ҫ
					int n = dfs(arr, i, j, mark);
					if (n > 0) {
						count ++;
						//�Ƚ����ֵ
						maxCount = n>maxCount ? n:maxCount;
					}
				}
			}
				
		}
		return 0;
		
	}
}
