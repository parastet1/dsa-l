package live.tanujdevops;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public void getHead() {
		System.out.println("head: " + (head == null ? null : head.value));
	}

	public void getTail() {
		System.out.println("tail: " + (tail == null ? null : tail.value));
	}

	public void getLength() {
		System.out.println("length: " + length);
	}

//	O(1)
	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

//	O(1)
	public Node removeLast() {
		if (head == null) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

//	O(1)
	public void prepend(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	}

//	O(1)
	public Node removeFirst() {
		if (head == null) {
			return null;
		}
		Node temp = head;
		if (length == 1) {
			head = tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

//	O(n)
	public Node get(int index) {
		if (index < 0 || index >= length) {
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print("<--" + temp.value + "-->");
			temp = temp.next;
		}
	}

}
