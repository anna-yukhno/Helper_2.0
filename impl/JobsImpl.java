/**
 * 
 */
package impl;

import api.Jobs;

/**
 * @author Anna_Kovalenko, 2016
 */
public class JobsImpl implements Jobs{
	
	long jobId;
	String description, district, address, customer, executor;
	int cost;
	String begin_date, end_date;
	
	
	/**
	 * constructor
	 */
	public JobsImpl(String description, String district, String address, int cost, String end_date) {
		super();
		this.description = description;
		this.district = district;
		this.address = address;
		this.cost = cost;
		this.end_date = end_date;
	}
	
	@Override
	public long getJobId() {		
		return jobId;
	}
	
	@Override
	public void setJobId() {
		jobId = hashCode();
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public String getDistrict() {
		return district;
	}
	
	@Override
	public String getAddress() {
		return address;
	}
	
	@Override
	public String getCustomer() {
		return customer;
	}
	
	@Override
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	@Override
	public String getExecutor() {
		return executor;
	}
	
	@Override
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	
	@Override
	public int getCost() {
		return cost;
	}
	
	@Override
	public String getBegin_date() {
		return begin_date;
	}
	
	@Override
	public void setBegin_date(String begin_date) {
		this.begin_date = begin_date;
	}
	
	@Override
	public String getEnd_date() {
		return end_date;
	}
	
	@Override
	public String toString(){
		return jobId + ", " + customer + ", " + address + ", " + cost + ", until " + end_date;
	}
	
	

}
