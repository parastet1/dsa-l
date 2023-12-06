package live.tanujdevops;

/*
 * 
 * singly linked list
 * 
 * */

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList() {
	}

	public LinkedList(int value) {
		var newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

//	O(1)
	public void append(int value) {
		var newNode = new Node(value);
		if (length == 0) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}

	public Object removeLast() {
		Node temp = head;
		Node prev = null;
		Node removed = temp;

		if (length == 0) {
			return null;
		}

		// edge case
		if (length == 1) {
			head = null;
			tail = null;
			length = 0;
			return removed.value;
		}

		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		tail.next = null;
		length--;
		removed = temp;
		temp = null;

		return removed.value;
	}

	public void getHead() {
		System.out.println("head: " + (head != null ? head.value : null));
	}

	public void getTail() {
		System.out.println("tail: " + (tail != null ? tail.value : null));
	}

	public void getLength() {
		System.out.println("length: " + length);
	}

	public void printList() {
		var temp = head;
		while (temp != null) {
			System.out.print(temp.value + " --> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void printAll() {
		if (length == 0) {
			System.out.println("head: null");
			System.out.println("tail: null");
		} else {
			System.out.println("head: " + head.value);
			System.out.println("tail: " + tail.value);
		}

		System.out.println("Length: " + length);
		System.out.println("Linked List:");
		if (length == 0) {
			System.out.println("empty");
		} else {
			printList();
		}
	}
}
