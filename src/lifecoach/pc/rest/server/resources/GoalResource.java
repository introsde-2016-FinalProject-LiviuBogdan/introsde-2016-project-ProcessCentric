package lifecoach.pc.rest.server.resources;

import java.util.List;

import javax.ejb.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import lifecoach.businesslogic.soap.ws.BusinessLogic;
import lifecoach.businesslogic.soap.ws.BusinessLogic_Service;
import lifecoach.businesslogic.soap.ws.Feedback;
import lifecoach.localdb.soap.ws.Goal;
import lifecoach.localdb.soap.ws.HealthMeasureHistory;
import lifecoach.localdb.soap.ws.Measure;
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
	
	public GoalResource(UriInfo uriInfo, Request request,long idPerson) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.personId = idPerson;
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<Goal> getPersonGoals() {

		System.out.println("Getting goals");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
        
        List<Goal> goals = storage.readGoalList(personId);
       // System.out.println(goals.size());

        return goals;
	}		
	
	@POST
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Goal savePersonGoal(Goal g) {

		System.out.println("Saving goal");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.createGoal(g, personId);
	}	
	
	@GET
	@Path("{gid}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Goal getGoal(@PathParam("gid") long gid){
		
		System.out.println("Getting goal "+gid);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readGoal(gid);
	}
}
