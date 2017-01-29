package lifecoach.pc.rest.server.resources;

import java.util.List;

import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Holder;

import lifecoach.localdb.soap.ws.Person;
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
@Path("/profile")
public class ProfileResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<Person> getPeople(){
		
		System.out.println("Getting all people");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readPersonList();
	}
	
	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Person getPerson(@PathParam("id") long id){
		
		System.out.println("Getting person "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readPerson(id);
	}
	
	@PUT
	@Path("{id}")
	@Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Person updatePerson(Person person, @PathParam("id") long id){
		person.setPersonId(id);
		System.out.println("Updating person "+person.getPersonId());
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        Holder<Person> pHolder = new Holder<Person>(person);
        storage.updatePerson(pHolder);
        
        return pHolder.value;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Person createPerson(Person person){
		System.out.println("Updating person "+person.getPersonId());
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        Holder<Person> pHolder = new Holder<Person>(person);
        storage.createPerson(pHolder);
        
        return pHolder.value;
	}
	
	@Path("{id}/goals/")
	public GoalResource getGoalList(@PathParam("id") long id) {
		System.out.println("Entering AchievementResource...");
		return new GoalResource(uriInfo, request, id);
	}	
	
	@Path("{id}/achievements/")
	public AchievementResource getAchievementList(@PathParam("id") long id) {
		System.out.println("Entering AchievementResource...");
		return new AchievementResource(uriInfo, request, id);
	}

	@Path("{id}/history/{measureType}")
	public MeasureResource getHistory(@PathParam("id") long id, @PathParam("measureType") String name) {
		System.out.println("Entering MeasureResource...");
		return new MeasureResource(uriInfo, request, id, name);
	}
	
}
