package counter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Controller for the Counter buttons user interface.
 * @author jim
 *
 */
public class ClickController {
	@FXML
	private Button plusbutton;
	@FXML
	private Button minusbutton;
	/** The counter that records button clicks. */
	private Counter counter;
	/**
	 * Set the counter 
	 * @param counter is the counter that want to set.
	 */
	public void setCounter(Counter counter) {
		this.counter = counter;
	}
	/**
	 * The add counter when press + button.
	 * @param event is the event that press + button.
	 */
	public void plusButtonHandler(ActionEvent event) {
		counter.add(1);
	}
	
	/**
	 * The minus counter when press - button.
	 * @param event is the event that press - button.
	 */	
	public void minusButtonHandler(ActionEvent event) {
		counter.add(-1);
	}
}
