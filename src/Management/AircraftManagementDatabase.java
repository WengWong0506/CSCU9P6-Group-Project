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

public class AircraftManagementDatabase {
	private ManagementRecord[] MRs;
	public int maxMRs = 10; 
	
	public int getStatus(int mCode) {
		return -1;
	}
	
	public void setStatus (int mCode, int newStatus) {
		
	}
	
	public String getFlightCode(int statusCode) {
		return null;
	}
	
	public int getWithStatus(int statusCode) {
		return -1;
	}
	
	public void radarDetect (FlightDescriptor fd) {
		
	}
	
	public void radarLostContact (int mCode) {
		
	}
	
	public void taxiTo (int mCode, int gateNumber) {
		
	}
	
	public void faultsFound (int mCode, String description) {
		
	}
	
	public void addPassenger(int mCode, PassengerDetails details) {
		
	}
	
	public PassengerList getPassengerList(int mCode) {
		return null;
	}
	
	public Itinerary getItinirary(int mCode) {
		return null;
	}
	
	
}
