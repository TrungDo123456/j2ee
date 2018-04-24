package uit.edu.vn.action;
import uit.edu.vn.model.*;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private Customer customer;

	@Override
	public String execute() throws Exception {
		//customer = new Customer();
		return SUCCESS;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
