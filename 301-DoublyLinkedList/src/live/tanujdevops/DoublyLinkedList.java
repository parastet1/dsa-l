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
		System.out.println("head: " + head.value);
	}

	public void getTail() {
		System.out.println("tail: " + tail.value);
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

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

}
