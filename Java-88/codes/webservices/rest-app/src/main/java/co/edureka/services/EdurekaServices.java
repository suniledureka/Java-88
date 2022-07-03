package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/html")
	public String localService() {
		return "India Customer Service Center";
	}
	
	@GET
	@Produces("text/html")
	@Path("/international")
	public String internationalService() {
		return "International Customer Service Center";
	}
	
	@GET
	@Produces("text/html")
	@Path("/enquiry")
	public String getCourseDetails(@QueryParam(value = "name") String name, @QueryParam("course") String course) {
		//logic to get the course details from database
		String response = "Hi "+name+", we will revert back to you with the Course Details of \""+course+"\"";
		return response;
	}
	
	@GET
	@Produces("text/html")
	@Path("/enquiry/{name}/{course}")
	public String getCourseDetailsByNameAndCourse(@PathParam(value = "name") String name, @PathParam("course") String course) {
		//logic to get the course details from database
		String response = "@Path Parameters --> Hi "+name+", we will revert back to you with the Course Details of \""+course+"\"";
		return response;
	}	
}
