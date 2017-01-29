package lifecoach.pc.rest.server.resources;

import java.util.List;

import javax.ejb.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import lifecoach.localdb.soap.ws.Achievement;
import lifecoach.localdb.soap.ws.Goal;
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
public class GoalResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	long personId;
	
	public GoalResource(UriInfo uriInfo, Request request,long personId) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.personId = personId;
	}
	@GET
	@Path("/goals")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Response getGoals() {

		System.out.println("Getting goals");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
        
        List<Goal> goals = storage.readGoalList(personId);
        System.out.println(goals.size());

        return Response.ok().entity(goals).build();
	}	
	
	@GET
	@Path("/goal/{id}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Goal getGoal(@PathParam("id") long id){
		
		System.out.println("Getting goal "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readGoal(id);
	}
	
	@GET
	@Path("/achievements")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Response getAchievements() {
		
		System.out.println("Getting achievements");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
        
        List<Achievement> achievements = storage.readAchievementList(personId);
        System.out.println(achievements.size());

        return Response.ok().entity(achievements).build();
	}	
	
	@GET
	@Path("/achievements/{id}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Achievement getAchievement(@PathParam("id") long id){
		
		System.out.println("Getting achievement "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readAchievement(id);
	}
}
