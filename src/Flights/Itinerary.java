package Flights;

/*Please put your student ID in so proper accreditation can be given for your work. 
Ensure it is only your Student ID and *not* your name as marking is done anonymously.
Please only add your name on this class if you have worked on this class.
Work can take any form from refactoring to code writing and anything in between, of course
You should always take credit for your work.*/
/**
* @author 2819600
* @author 
* @author 
* @author 
* @author 
* @author 
*/
public class Itinerary {
	private String from;
	private String to;
	private String next;
	
	
	/**
	 * Write Javadoc Description Here
	 * @param from
	 * @param to
	 * @param next
	 */
	public Itinerary(String from, String to, String next) {
		//TODO Create Itinerary Constructor
		
	}

	/**
	 * Returns the destination the flight will depart from
	 * @return String Instance Variable 'from'
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Returns the current destination the flight will travel to
	 * @return String Instance Variable 'to'
	 */
	public String getTo() {
		return to;
	}

	/**
	 * Returns the destination the flight will travel to after 'to'
	 * @return String Instance Variable 'next'
	 */
	public String getNext() {
		return next;
	}

}
