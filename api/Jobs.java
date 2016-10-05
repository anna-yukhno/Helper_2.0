/**
 * 
 */
package api;

/**
 * @author Anna_Kovalenko, 2016
 */
public interface Jobs {
	
	/**
	 * @return the jobId
	 */
	long getJobId();
	
	/**
	 * the jobId to set
	 */
	void setJobId();
	
	/**
	 * @return the description
	 */
	String getDescription();
	
	/**
	 * @return the district
	 */
	String getDistrict();
	
	/**
	 * @return the address
	 */
	String getAddress();
	
	/**
	 * @return the customer
	 */
	String getCustomer();
	
	/**
	 * @param customer the customer to set
	 */
	void setCustomer(String customer);
	
	/**
	 * @return the executor
	 */
	public String getExecutor();
	
	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(String executor);
	
	/**
	 * @return the cost
	 */
	public int getCost();
	
	/**
	 * @return the begin_date
	 */
	public String getBegin_date();
	
	/**
	 * @param begin_date the begin_date to set
	 */
	public void setBegin_date(String begin_date);
	
	/**
	 * @return the end_date
	 */
	public String getEnd_date();

}
