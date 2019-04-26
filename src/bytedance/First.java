package bytedance;
/**
* @author vabook@163.com
* @date 2019年4月25日 下午7:32:21
* @reference https://www.nowcoder.com/discuss/99061
* 字节跳动大闯关
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

	// 节点与其序号
	public static HashMap<Node, Integer> sizeMap;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 获取第一个n
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

			// 一直读完本行数据
			while ((temp = scanner.nextInt()) != 0) {
				nodes[i].friends.add(temp);
			}
		}
		for (int i = 1; i < nodes.length; i++) {
			if (nodes[i].friends.size() == 0)
				continue;
			for (Iterator<Integer> iterator = nodes[i].friends.iterator(); iterator.hasNext();) {
				Integer one = iterator.next();
				// 判断当前序号节点与他朋友节点的关系
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

	// 判断是否可以由一个节点推出来
	public static boolean isSameSet(Node a, Node b) {

		return findHead(a) == findHead(b);

	}

}
