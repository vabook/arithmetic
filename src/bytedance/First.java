package bytedance;
/**
* @author vabook@163.com
* @date 2019��4��25�� ����7:32:21
* @reference https://www.nowcoder.com/discuss/99061
* �ֽ������󴳹�
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class First {

	public static class Node {

		public Set<Integer> friends = new HashSet<>();
	}

	public static HashMap<Node, Node> fatherMap;

	// �ڵ��������
	public static HashMap<Node, Integer> sizeMap;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ��ȡ��һ��n
		int n = scanner.nextInt();

		if (n <= 0 || n >= 100000) {
			System.out.println(0);
			return;
		}

		// 11
		Node[] nodes = new Node[n + 1];

		int temp;

		fatherMap = new HashMap<Node, Node>();

		sizeMap = new HashMap<Node, Integer>();

		for (int i = 1; i <= n; i++) {
			nodes[i] = new Node();
			fatherMap.put(nodes[i], nodes[i]);
			sizeMap.put(nodes[i], i);

			// һֱ���걾������
			while ((temp = scanner.nextInt()) != 0) {
				nodes[i].friends.add(temp);
			}
		}
		for (int i = 1; i < nodes.length; i++) {
			if (nodes[i].friends.size() == 0)
				continue;
			for (Iterator<Integer> iterator = nodes[i].friends.iterator(); iterator.hasNext();) {
				Integer one = iterator.next();
				// �жϵ�ǰ��Žڵ��������ѽڵ�Ĺ�ϵ
				if (!isSameSet(nodes[i], nodes[one])) {
					union(nodes[i], nodes[one]);
					n --;
				}
			}
		}

	}

	public static void union(Node a, Node b) {
		if (a == null || b == null) {
			return;
		}
		Node aHead = findHead(a);
		Node bHead = findHead(b);

		if (aHead != bHead) {
			int aSetSize = sizeMap.get(aHead);
			int bSetSize = sizeMap.get(bHead);
			if (aSetSize <= bSetSize) {
				fatherMap.put(aHead, bHead);
				sizeMap.put(bHead, aSetSize + bSetSize);
			} else {
				fatherMap.put(bHead, aHead);
				sizeMap.put(aHead, aSetSize + bSetSize);
			}

		}
	}

	public static Node findHead(Node node) {
		Node father = fatherMap.get(node);
		if (father != node) {
			father = findHead(father);
		}
		fatherMap.put(node, father);
		return father;
	}

	// �ж��Ƿ������һ���ڵ��Ƴ���
	public static boolean isSameSet(Node a, Node b) {

		return findHead(a) == findHead(b);

	}

}
