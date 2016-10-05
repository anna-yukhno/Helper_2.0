/**
 * 
 */
package api;

import java.util.Map;

/**
 * @author Anna_Kovalenko, 2016
 */
public interface Users {
	
	/**
	 * @param jobs the jobs to set
	 */
	void setJobs(Map <Long, Jobs> jobs);

	/**
	 * @return the jobs
	 */
	Map <Long, Jobs> getJobs();
	
	/**
	 * @return the userId
	 */
	public String getUserId();
	
	/**
	 * @return the password
	 */
	public String getPassword();
	
	/**
	 * @return the name
	 */
	public String getName();
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * @return the phone
	 */
	public int getPhone();
	
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone);
	

}
