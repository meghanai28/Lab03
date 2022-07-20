
public class Main {
	public static void main (String[] args) throws Exception
	{
		Currency []arr = {new Dollar(57.12),new Dollar(23.44), new Dollar(87.43), new Dollar(68.99), new Dollar(111.22),
		new Dollar(44.55), new Dollar(77.77), new Dollar(18.63), new Dollar(543.21),new Dollar(20.21),
		new Dollar(345.67),new Dollar(36.18), new Dollar(48.48),new Dollar(101.00),new Dollar(11.00),
		new Dollar(21.00), new Dollar(51.00), new Dollar(1.00), new Dollar(251.00), new Dollar(151.00)};
		
		System.out.println("Testing singlylinkedlist");
		SinglyLinkedList test = new SinglyLinkedList();
		int add = 7;
		for(int i = 0; i<add; i++)
		{
			test.addCurrency(arr[i], 0);
		}
		

		System.out.println();
		System.out.println(test.findCurrency(new Dollar(87.43)));
		System.out.println(test.findCurrency(new Dollar(44.56)));
		
		test.removeCurrency(new Dollar(111.22));
	
		test.removeCurrency(2);
		
		System.out.println();
		System.out.println(	test.printList());
		System.out.println();
		
		add++;
		for(int i =0; i<4; i++)
		{
			test.addCurrency(arr[add], add%5 );

			add++;
		}
		
	
		
		test.removeCurrency(test.countCurrency() % 6);
	
		test.removeCurrency(test.countCurrency() / 7);
		System.out.println(	test.printList());
		System.out.println("\nDone testing Singly linked list");
		
		
		System.out.println("\n\nTesting Stack");
		Stack test2 = new Stack();
		
		for(int i = 0 ; i<7; i++)
		{
			test2.push(arr[13+i]);
		}
		
		System.out.println(test2.peek());
		test2.pop();
		test2.pop();
		test2.pop();
		
		System.out.println();
		System.out.println(	test2.printStack());
		System.out.println();
		
		for(int i = 0 ; i<5; i++)
		{
			test2.push(arr[i]);
		}
		
		
		test2.pop();
		test2.pop();
		
		System.out.println();
		System.out.println(test2.printStack());
		System.out.println();
		
		System.out.println("\nDone Testing Stack");
		
		
		System.out.println("\n\nTesting Queue");
		Queue test3 = new Queue();
		for(int i = 0 ; i<7; i++)
		{
			test3.enqueue(arr[5+i]);
		}
		
		System.out.println(test3.peekFront());
		System.out.println(test3.peekRear());

		test3.dequeue();
		test3.dequeue();
		
		System.out.println();
		System.out.println(test3.printQueue());
		System.out.println();
		
		for(int i = 0 ; i<5; i++)
		{
			test3.enqueue(arr[10+i]);
		}
		
		test3.dequeue();
		test3.dequeue();
		test3.dequeue();
		
		
		System.out.println(test3.printQueue());
		System.out.println();
		System.out.println("\n\nDone Testing Queue");
		
		//cleaning up 
		arr = null;
		test = null;
		test2 = null;
		test3 = null;
		
		
	}
}
