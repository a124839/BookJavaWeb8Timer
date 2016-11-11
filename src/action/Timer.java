package action;

import com.opensymphony.xwork2.ActionSupport;

public class Timer extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		Thread.sleep(100);
		return SUCCESS;
	}
	
	
}
