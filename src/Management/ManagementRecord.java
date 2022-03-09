package Management;

import Flights.FlightDescriptor;
import Flights.Itinerary;
import Passenger.PassengerDetails;
import Passenger.PassengerList;

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

public class ManagementRecord {
	
	//This could be a lot tidier if it were an Enum
	public static final int FREE = 0;
	public static final int IN_TRANSIT = 1;
	public static final int WANTING_TO_LAND = 2;
	public static final int GROUND_CLEARANCE_GRANTED = 3;
	public static final int LANDING = 4;
	public static final int LANDED = 5;
	public static final int TAXIING = 6;
	public static final int UNLOADING = 7;
	public static final int READY_CLEAN_AND_MAINT = 8;
	public static final int FAULTY_AWAIT_CLEAN = 9;
	public static final int CLEAN_AWAIT_MAINT = 10;
	public static final int OK_AWAIT_CLEAN = 11;
	public static final int AWAIT_REPAIR = 12;
	public static final int READY_REFUEL = 13;
	public static final int READY_PASSENGERS = 14;
	public static final int READY_DEPART = 15;
	public static final int AWAITING_TAXI = 16;
	public static final int AWAITING_TAKEOFF = 17;
	public static final int DEPARTING_THROUGH_LOCAL_AIRSPACE = 18;
	
	private int status;
	private int gateNumber;
	private String flightCode;
	private Itinerary itinerary;
	private PassengerList passengerList;
	private String faultDescription;
	
	public void setStatus (int newStatus) {
		this.status = newStatus;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public String getFlightCode() {
		return flightCode;
	}
	
	public void radarDetect(FlightDescriptor fd) {
		//TODO Complete Method
	}
	
	public void radarLostcontact() {
		//TODO Complete Method
	}
	
	public void taxiTo(int gateNumber) {
		//TODO Complete Method
	}
	
	public void faultsFound(String description) {
		//TODO Complete Method
	}
	
	/**
	 * Appends a passenger onto the PassengerList
	 * @param details
	 */
	public void addPassenger(PassengerDetails details) {
		this.passengerList.addPassenger(details);
	}
	
	/**
	 * Returns current instance's passenger list
	 * @return Instance PassengerList object 'passengerList'
	 */
	public PassengerList getPassengerList() {
		return this.passengerList;
	}
	
	/**
	 * Returns the current instance's itinerary object
	 * @return Instance Itinerary Object 'itinerary'
	 */
	public Itinerary getItinerary() {
		return this.itinerary;
	}
}
