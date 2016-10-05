/**
 * 
 */
package impl;

import java.util.Scanner;

import org.apache.log4j.Logger;

import api.UI;

/**
 * @author Anna_Kovalenko, 2016
 */
public class UIimpl implements UI{
	private static Logger logger = Logger.getLogger(UIimpl.class);
	
	String userId, password, name;
	String description, district, address, customer;
	int cost, phone;
	String begin_date, end_date;
	ServiceImpl service;	
	
	
	/**
	 * constructor
	 */
	public UIimpl(ServiceImpl service) {
		super();
		this.service = service;
	}

	/* (non-Javadoc)
	 * @see api.UI#logIn()
	 */
	@Override
	public void logIn() {
		Scanner scan = new Scanner(System.in);
		logger.info("login");
		userId = scan.nextLine();
		logger.info("password");
		password = scan.nextLine();
		
	}

	/* (non-Javadoc)
	 * @see api.UI#register()
	 */
	@Override
	public void register() {
		Scanner scan = new Scanner(System.in);
		logger.info("login");
		userId = scan.nextLine();
		logger.info("password");
		password = scan.nextLine();
		logger.info("name");
		name = scan.nextLine();
		logger.info("phone");
		phone = scan.nextInt();
		UsersImpl user = new UsersImpl(userId, password);
		user.setName(name);
		user.setPhone(phone);
		service.users.put(userId, user);
			
	}

	/* (non-Javadoc)
	 * @see api.UI#enterJobInfo()
	 */
	@Override
	public void enterJobInfo() {
		Scanner scan = new Scanner(System.in);
		logger.info("district");
		district = scan.nextLine();
		logger.info("address");
		address = scan.nextLine();
		logger.info("description");
		description = scan.nextLine();
		logger.info("cost");
		cost = scan.nextInt();
		logger.info("Until");
		end_date = scan.nextLine();
		JobsImpl job = new JobsImpl(description, district, address, cost, end_date);
		job.setCustomer(userId);
		job.setJobId();
		logger.debug(job.toString());
		service.jobs.put(job.getJobId(), job);
	}
	
	public void work() {
		logIn();
		
		if(service.users.containsKey(userId)){
			enterJobInfo();							
		} else {
			logger.info("registration");
			register();	
			logger.info(service.users.entrySet());
			enterJobInfo();
		}
		
	}
	

}
