package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customers")
public class CustomerService {
	@POST
	@Path("/register")
	public String registerCustomer(@FormParam("name_field") String name,
								   @FormParam("age_field") Integer age,
								   @FormParam("addr_field") String address) {
		//logic to save the data in database
		String response = "<p style=font-size:20px><ins>Customer Registration Successful</ins>"
				+ "<br><br>Name = "+name+"<br>Age = "+age+"<br>Address = "+address+"</p>";
		return response;
	}
}
