package it.accaemme.spring.demo;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@Consumes("application/json")
//@Produces("application/json")
@Produces({MediaType.APPLICATION_JSON+ ";charset=utf-8"})
@Path("rest")
public class GreetingsAPI {
	/*
	 * The correct URL would be:

		http://{server}:{port}/{context-root}/{servlet-mapping}/{path}
		In your example:

		{server} = localhost
		{port} = 8080
		{context-root} = service? (usually the name of the war file)
		{servlet-mapping} = webapi
		{path} = test
		So it should be: http://localhost:8080/service/webapi/test
	 */
	
	
	@GET
	@Path("lang/{lang}/user/{u}/greets")	
	public ArrayList<GreetingsBean> greets(
						 @PathParam("lang") String lang
						,@PathParam("u") String user
					  ){
		assert lang=="it" || lang=="en";
		
		GreetingsBean gb = new GreetingsBean(lang, user);
		
		ArrayList<GreetingsBean> result = new ArrayList<GreetingsBean>();
		result.add(gb);
		
		System.out.println(  gb.getMessage()  );
		
		return result;
	}
}
