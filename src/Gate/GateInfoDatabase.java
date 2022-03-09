package Gate;

import java.util.List;

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

public class GateInfoDatabase {
	private Gate[] gates;
	public int maxGateNumber = 2;
	
	public int getStatus(int gateNumber) {
		return this.getStatus(gateNumber);
	}
	
	public int[] getStatuses() {
		int statuses[] = {};
		for (Gate g : this.gates) statuses[statuses.length] = g.getStatus();
		return statuses;
	}
	
	public void allocate(int gateNumber, int mCode) {
		
	}
	
	public void docked(int gateNumber, int mCode) {
		
	}
	
	public void departed(int gateNumber, int mCode) {
		
	}
	
	
}
