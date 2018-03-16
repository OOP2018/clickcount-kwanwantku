package counter;

import java.util.Scanner;
/**
 * Test the observer Observable behavior for Counter object 
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.03.16
 */
public class ObserverTest {
	/**
	 * The main for running obervable test
	 * @param args is the argument to run it.
	 */
	public static void main (String[] args) {
		final Scanner console = new Scanner(System.in);
		//1. create the subject (Observable)
		Counter counter = new Counter();
		//2.Create the Observer with reference to subject.
		ConsoleView view  = new ConsoleView(counter);
		//3. add Observer to subject
		counter.addObserver(view);
//		//create another view 
//		CounterView view2  = new CounterView(counter);
//		view2.run();
		
		//4. run the app
		while(true) {
			System.out.println("Count how many? ");
			int howmany = console.nextInt();
			if (howmany == 0) 
				System.exit(0);
			counter.add(howmany);
		}
	}
}
