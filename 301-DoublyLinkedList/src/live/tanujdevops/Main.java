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

//		get(-)
		myDLL.append(0);
		myDLL.append(1);
		myDLL.append(2);
		myDLL.append(3);
		myDLL.printList();
		System.out.printf("\n\n");

		System.out.println("get: " + myDLL.get(0).value);
		System.out.println("get: " + myDLL.get(1).value);
		System.out.println("get: " + myDLL.get(2).value);
		System.out.println("get: " + myDLL.get(3).value);
		System.out.println("get: " + myDLL.get(4));
		System.out.println("get: " + myDLL.get(-4));
	}
}
