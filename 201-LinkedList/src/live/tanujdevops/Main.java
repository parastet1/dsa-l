package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
//		var myLinkedList = new LinkedList(4);

//		myLinkedList.append(5);
//		myLinkedList.append(6);
//		myLinkedList.append(7);
//		
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		System.out.println();
//		
//		myLinkedList.removeLast();
//		myLinkedList.removeLast();
//		myLinkedList.removeLast();
//		myLinkedList.removeLast();
//		myLinkedList.removeLast();
//		
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.prepend(1);
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.prepend(2);
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.prepend(3);
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		System.out.println("removing first ...");
//		myLinkedList.removeFirst();
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.removeFirst();
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.removeFirst();
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();
//		
//		myLinkedList.removeFirst();
//		myLinkedList.getHead();
//		myLinkedList.getTail();
//		myLinkedList.getLength();
//		myLinkedList.printList();

		System.out.println("get at index ...");
		var myLinkedList = new LinkedList(4);
		myLinkedList.append(5);
		myLinkedList.append(6);
		myLinkedList.append(7);
		myLinkedList.append(0);
		System.out.println(myLinkedList.get(-1));
		System.out.println(myLinkedList.get(1).value);
		System.out.println(myLinkedList.get(0).value);
		System.out.println(myLinkedList.get(4).value);
		System.out.println(myLinkedList.get(5));
		myLinkedList.printList();
	}
}
