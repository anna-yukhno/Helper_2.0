/**
 * 
 */
package impl;

import java.util.Map;

import org.apache.log4j.Logger;

import api.Jobs;
import api.Users;

/**
 * @author Anna_Kovalenko, 2016
 */
public class UsersImpl implements Users{
	int phone;
	String userId;
	String password;
	String name;
	Map <Long, Jobs> jobs;
	
	private static Logger logger = Logger.getLogger(UsersImpl.class);
	
	/**
	 * constructor
	 */
	public UsersImpl(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	@Override
	public void setJobs(Map<Long, Jobs> jobs) {
		this.jobs = jobs;		
	}

	@Override
	public String getUserId() {
		return userId;
	}
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Map<Long, Jobs> getJobs() {
		return jobs;
	}
	
	@Override
	public int getPhone() {
		return phone;
	}
	
	@Override
	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}
