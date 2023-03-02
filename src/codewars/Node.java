package codewars;

class Node {
	public int data;
	public Node next = null;

	public static int getNth(Node n, int index) throws Exception {
		if (index < 0) {
			throw new Exception();
		}
		for (int i = 0; i < index; i++) {
			System.out.println(n.data);
			if (n.next == null) {
				throw new Exception();
			}
			n = n.next;
		}
		return n.data;
	}
}