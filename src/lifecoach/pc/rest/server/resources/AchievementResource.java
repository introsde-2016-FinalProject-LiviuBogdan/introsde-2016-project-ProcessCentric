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
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
public class AchievementResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	long personId;
	
	public AchievementResource(UriInfo uriInfo, Request request,long personId) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.personId = personId;
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<Achievement> getAchievements() {
		
		System.out.println("Getting achievements for person "+personId);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
        
        List<Achievement> achievements = storage.readAchievementList(personId);
        System.out.println(achievements.size());

        return achievements;
	}	
	
	@GET
	@Path("{idAchievement}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Achievement getAchievement(@PathParam("idAchievement") long id){
		
		System.out.println("Getting achievement "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readAchievement(id);
	}
}
