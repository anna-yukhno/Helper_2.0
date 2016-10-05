/**
 * 
 */
package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Anna_Kovalenko, 2016
 */
public interface Service {
	
	/**
	 * @param users the users to set
	 */
	void setUsers(HashMap<String, Users> users);
	
	/**
	 * @return the users
	 */
	HashMap<String, Users> getUsers();
	
	/**
	 * 
	 * @param jobs to set
	 */
	void setJobs(Map <Long, Jobs> jobs);
	
	/**
	 * put the job to executor's map
	 * @param user
	 * @param job
	 */
	void takeJob(Users user, Jobs job);
	
	/**
	 * 
	 * @param job
	 */
	void publishJob(Jobs job);
	
	/**
	 * @return the user
	 */
	Users getUser(String userId, String password);
	
	/**
	 * @return the job by unique Id
	 */
	Jobs getJobBy(long jobId);
	
	/**
	 * @param cost
	 * @return the set, sorted by cost
	 */
	Set<Jobs> sortJobByCost(Map <Long, Jobs> jobs);
	
	/**
	 * 
	 * @param jobs
	 * @return the set, sorted by customer
	 */
	Set<Jobs> sortJobByCustomer(Map <Long, Jobs> jobs);
	/** 
	 * @param endDate
	 * @return the set, sorted by endDate
	 */
	Set<Jobs> sortJobByEnd(Map <Long, Jobs> jobs);
	
	/**
	 * @param sortJobBy
	 * @return sort results
	 */
	void jobsSortRes(Set<Jobs> sortJobBy);

}
