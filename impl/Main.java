/**
 * 
 */
package impl;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Map;
import java.util.Map;

import api.Jobs;
import api.Users;

/**
 * @author Anna_Kovalenko, 2016
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashMap <String, Users> users = new HashMap <>();
		Map <Long, Jobs> jobs = new HashMap <>();
		
		ServiceImpl service = new ServiceImpl();
		
		UIimpl ui = new UIimpl(service);
		UIimpl ui2 = new UIimpl(service);
		UIimpl ui3 = new UIimpl(service);
		
		service.setUsers(users);
		service.setJobs(jobs);
		
		ui.work();
		ui2.work();
		ui3.work();
		
		service.jobsSortRes(service.sortJobByCost(jobs));

	}

}
