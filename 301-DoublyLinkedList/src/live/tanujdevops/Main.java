package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

//		append(-)
		myDLL.append(2);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

//		removeLast()
		System.out.println("removed: " + myDLL.removeLast().value);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

		System.out.println("removed: " + myDLL.removeLast().value);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

//		prepend(-)
		myDLL.prepend(1);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

		myDLL.prepend(2);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

//		removeFirst()
		System.out.println("removed: " + myDLL.removeFirst().value);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

		System.out.println("removed: " + myDLL.removeFirst().value);

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");

		System.out.println("removed: " + myDLL.removeFirst());

		myDLL.getHead();
		myDLL.getTail();
		myDLL.getLength();
		myDLL.printList();
		System.out.printf("\n\n");
	}
}
