package Gate;

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

public class Gate {
	//An Enum would make these first 3 variables much cleaner
	public static final int FREE = 0;
	public static final int RESERVED = 1;
	public static final int OCCUPID = 2;
	private int status = FREE;
	private int mCode;
	
	/**
	 * Returns the current status code of the aircraft gate
	 * @return Integer Instance Variable 'status'
	 */
	public int getStatus() {
		return this.status;
	}
	
	/**
	 * 
	 * @param mCode
	 */
	public void allocate (int mCode) {
		
	}
	
	/**
	 * 
	 */
	public void docked() {
		
	}
	
	/**
	 * 
	 */
	public void departed() {
		
	}
	
	
}
