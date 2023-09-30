/**
 * Class for testing the Queue class
 * @author Fanni Kertesz
 * @version 09/28/23
 */
public class Application
{
	public static void main(String[] args)
	{
		Queue<String> queue = new Queue<String>();//create Queue object
		
		//create Strings with customer names
		String bill = "Bill";
		String alice = "Alice";
		String bob = "Bob";
		String jane = "Jane";
		String hamad = "Hamad";
		String jim = "Jim";
		
		//Testing enqueue, dequeue, and toString with customer scenario
		
		//Bill, Alice, and Bob arrives
		queue.enqueue(bill);
		queue.enqueue(alice);
		queue.enqueue(bob);
		System.out.println(bill + ", " + alice + ", and " + bob + " arrive.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//One custoemr was served
		System.out.println(queue.dequeue() + " was served.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//Jane arrives
		queue.enqueue(jane);
		System.out.println(jane + " arrives.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//Hamad arrives
		queue.enqueue(hamad);
		System.out.println(hamad + " arrives.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//Two customers were served
		System.out.println(queue.dequeue() + " and " + queue.dequeue() + " were served.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//Jim arrives
		queue.enqueue(jim);
		System.out.println(jim + " arrives.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//A customer was served
		System.out.println(queue.dequeue() + " was served.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
		//A customer was served
		System.out.println(queue.dequeue() + " was served.");
		System.out.println("Current queue: " + queue.toString() + ".");
		
	}//end main
}//end class
