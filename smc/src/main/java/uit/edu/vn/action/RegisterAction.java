package uit.edu.vn.action;
import uit.edu.vn.model.*;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	
	private Customer customer;
	private String aaa = "tao la le van cuong";
	public String getA() {
		return aaa;
	}

	public void setA(String a) {
		this.aaa = a;
	}

	@Override
	public String execute() throws Exception {
		aaa = "h may cos qua khong";
		return "success";
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
