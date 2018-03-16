package counter;
/**
 * A simple counter.
 * @author Kwanwan Tantichartkul
 * @version 1.0
 * @since 2018.03.16
 */

public class Counter extends java.util.Observable{
	private int count;
	
	public Counter() {
		this.count = 0;
	}
	
	public void add(int howmuch) {
		count += howmuch;
		// Its like if the Bank sends you an SMS whenever money
		// is deposited in your account. If the SMS just says 
		// "you received a deposit" then you need to login to check it.
		// If the SMS says "you received 5,000 Bt from xxx" then you
		// have everything you need.
		setChanged();
		notifyObservers();
	}
	
	public int getCount() {
		return count;
	}
}
