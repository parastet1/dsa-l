package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		var myLinkedList = new LinkedList(4);
		
		myLinkedList.append(5);
		myLinkedList.append(6);
		myLinkedList.append(7);
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		System.out.println();
		
		myLinkedList.removeLast();
		myLinkedList.removeLast();
		myLinkedList.removeLast();
		myLinkedList.removeLast();
		myLinkedList.removeLast();
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.prepend(1);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.prepend(2);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.prepend(3);
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		System.out.println("removing first ...");
		myLinkedList.removeFirst();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.removeFirst();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.removeFirst();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		
		myLinkedList.removeFirst();
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
	}
}