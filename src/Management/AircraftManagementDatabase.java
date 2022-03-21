package Management;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.Action;

import Flights.FlightDescriptor;
import Flights.Itinerary;
import Management.ManagementRecord.Status;
import Passenger.PassengerDetails;
import Passenger.PassengerList;

/**
* @author 2819600
*/

public class AircraftManagementDatabase extends Observable{
	public int maxMRs = 10;
	private ManagementRecord[] MRs;
	
	/**
	 * Returns the status the given record. 
	 * If the given record does not exist, returns -1.
	 * @param mCode
	 * @return Int value of given record's status, if it exists
	 */
	public int getStatus(int mCode) {
		return isValidMCode(mCode) ? MRs[mCode].getStatus() : -1;
	}
	
	/**
	 * If the given status code and mCode are valid, changes the mCode's status equal to the newStatus value.
	 * @param mCode
	 * @param newStatus
	 */
	public void setStatus (int mCode, int newStatus) {
		if (newStatus < ManagementRecord.Status.values().length || newStatus >-1) { //Validates Status
			if (isValidMCode(mCode)) 
				MRs[mCode].setStatus(newStatus);
				setChanged();
				notifyObservers();
		}
	}
	
	/**
	 * Internal method for verifying if mCodes are valid.
	 * If the mCode is <0 or > Number of Records -1, returns false.
	 * @param mCode
	 * @return If the mCode corresponds to an existing record
	 */
	private boolean isValidMCode(int mCode) {
		//If the mCode exceeds the len-1 or is less than 0, the record cannot exist, ergo returns -1.
		//Equally, it will return false if the mCode exceeds the max number of MRs allowed.
		if (mCode > maxMRs) return false;
		if (mCode > (MRs.length-1)) return false;
		if (mCode < 0) return false;
		return true;
	}
	
	/**
	 * Internal method for verifying if a status code is valid.
	 * If the status exceeds the Statuses enum size-1 or is <0, it cannot be valid, ergo returns false.
	 * Otherwise, returns true.
	 * @param status
	 * @return
	 */
	private boolean isValidStatus(int status) {
		if (status > Status.values().length-1) return false;
		if (status < 0) return false;
		return true;
	}
	
	/**
	 * Returns the flight code of given Management Record
	 * If the mCode is invalid, returns null.
	 * @param mCode
	 * @return The flight code of the given management record, if a valid code.
	 */
	public String getFlightCode(int mCode) {
		if (isValidMCode(mCode)) {
			return MRs[mCode].getFlightCode();
		} else {
			return null;
		}
	}
	
	/**
	 * Returns an int array of all mCodes with the given status.
	 * If the status code given is invalid, returns null.
	 * @param statusCode
	 * @return Int array of all mCodes with the given status
	 */
	public int[] getWithStatus(int statusCode) {
		if (!(isValidStatus(statusCode))) return null;
		
		ArrayList<Integer> mCodesList = new ArrayList<Integer>();
		
		/*This function iterates through each Record using mCode as the initialised iterator
		 * As the iterator in MRs works identically to a for loop, this is used. 
		 * If the record's status code matches the given status code, the record's code is added to the list.*/
		
		for (int mCode = 0; mCode < MRs.length; mCode++) {
			if (MRs[mCode].getStatus() == statusCode) 
				mCodesList.add(mCode);
		}
		//If list is empty, returns null. Else, returns an array of the mCodes with the given status.
		//For some unknown reason there is no kind way to parse Integer Lists to int arrays in Java
		return mCodesList.isEmpty() ? null : mCodesList.stream().mapToInt(i -> i).toArray();
	}

	/**
	 * Finds a managementRecord whos status is marked as 'FREE'. If one is found, forwards the descriptor.
	 * When one is found, all observers are notified.
	 * @param fd
	 */
	public void radarDetect (FlightDescriptor fd) {
		for (ManagementRecord MR : MRs) {
			if (MR.getStatus() == Status.FREE.ordinal()) {
				MR.radarDetect(fd);
				setChanged();
				notifyObservers();
				break;
			}//EO If
		}//EO For
		
		//TODO This method I am unsure as to its completion; If there is no found free MR, what happens?
		//If you are reading this and I (Adam) have forgot to raise it with the group already, please raise this
	}
	
	/**
	 * Forwards the radarLostContact request to the relevant MR and notifies all observers of this change.
	 * @param mCode
	 */
	public void radarLostContact (int mCode) {
		if(isValidMCode(mCode)) {
			MRs[mCode].radarLostcontact();
			setChanged();
			notifyObservers();
		}
	}
	
	/**
	 * Indicates to the given record to taxi to the given gate, if the record is valid.
	 * Notifies all observers once state has changed.
	 * @param mCode
	 * @param gateNumber
	 */
	public void taxiTo (int mCode, int gateNumber) {
		if (isValidMCode(mCode)) {
			MRs[mCode].taxiTo(gateNumber);
			setChanged();
			notifyObservers();
		}
	}
	
	/**So long as the mCode is valid the method will;
	 * Indicate to the given record that faults have been found, passing the description of the faults along
	 * And notify any observers of this change
	 * @param mCode
	 * @param description
	 */
	public void faultsFound (int mCode, String description) {
		if (isValidMCode(mCode)) {
			MRs[mCode].faultsFound(description);
			setChanged();
			notifyObservers();
		}
	}
	
	/**
	 * Appends a given passenger's details to the given Management Record, as long as it exists.
	 * @param mCode
	 * @param details
	 */
	public void addPassenger(int mCode, PassengerDetails details) {
		if (isValidMCode(mCode)) {
			MRs[mCode].addPassenger(details);
		}
	}
	
	/**
	 * Returns the list of passengers for a given record, should it exist.
	 * @param mCode
	 * @return
	 */
	public PassengerList getPassengerList(int mCode) {
		if (isValidMCode(mCode)) {
			return MRs[mCode].getPassengerList();
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the Itinerary of a given record, should the record exist.
	 * @param mCode
	 * @return
	 */
	public Itinerary getItinirary(int mCode) {
		if(isValidMCode(mCode)) {
			return MRs[mCode].getItinerary();
		}else {
			return null;
		}
	}
	
}
