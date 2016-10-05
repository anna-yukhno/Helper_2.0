/**
 * 
 */
package impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import api.Jobs;
import api.Service;
import api.Users;

/**
 * @author Anna_Kovalenko, 2016
 */
public class ServiceImpl implements Service {
	private static Logger logger = Logger.getLogger(ServiceImpl.class);
	
	private static Comparator<Jobs> comparByCost = new Comparator<Jobs>() {
		@Override
		public int compare(Jobs job1, Jobs job2) {
		      return job1.getCost() - job2.getCost();
		   }
	};
	
	private static Comparator<Jobs> comparByCustomer = new Comparator<Jobs>() {
		@Override
		public int compare(Jobs job1, Jobs job2) {
		       return job1.getCustomer().compareTo(job2.getCustomer());		     
		   }
	};
	
	private static Comparator<Jobs> comparByEndDate = new Comparator<Jobs>() {
		@Override
		public int compare(Jobs job1, Jobs job2) {
		       return job1.getEnd_date().compareTo(job2.getEnd_date());		     
		   }
	};
	
	HashMap <String, Users> users;
	Map <Long, Jobs> jobs;
	
	@Override
	public HashMap<String, Users> getUsers() {
		return users;
	}

	@Override
	public void setUsers(HashMap<String, Users> users) {
		this.users = users;
	}
	
	@Override
	public void setJobs(Map <Long, Jobs> jobs){
		this.jobs = jobs;
	}
	
	@Override
	public Users getUser(String userId, String password) {		
		return users.get(userId);
	}

	@Override
	public Jobs getJobBy(long jobId) {		
		return jobs.get(jobId);
	}	
	
	@Override
	public Set<Jobs> sortJobByCost(Map <Long, Jobs> jobs) {		
		Set<Jobs> jobsByCost = new TreeSet<Jobs>(comparByCost);
		jobsByCost.addAll(jobs.values());
		return jobsByCost;
	}
	
	public Set<Jobs> sortJobByCustomer(Map <Long, Jobs> jobs) {
		Set<Jobs> jobsByCustomer = new TreeSet<Jobs>(comparByCustomer);
		jobsByCustomer.addAll(jobs.values());
		return jobsByCustomer;
	}
	
	@Override
	public Set<Jobs> sortJobByEnd(Map <Long, Jobs> jobs){		
		Set<Jobs> jobsByEnd = new TreeSet<Jobs>(comparByEndDate);
		jobsByEnd.addAll(jobs.values());
		return jobsByEnd;
	}
	
	@Override
	public void takeJob(Users user, Jobs job) {
		job.setExecutor(user.getUserId());
		user.getJobs().put(job.getJobId(), job);		
	}
	
	@Override
	public void jobsSortRes(Set<Jobs> sortJobBy){
		Iterator iterator = sortJobBy.iterator();
		while(iterator.hasNext()){
			logger.info(iterator.next().toString());
		}		
	}

	@Override
	public void publishJob(Jobs job) {
		// TODO Auto-generated method stub
		
	}

}
