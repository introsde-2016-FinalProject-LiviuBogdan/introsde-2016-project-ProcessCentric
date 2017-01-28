package lifecoach.pc.rest.server.resources;

import java.util.List;

import javax.ejb.*;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Holder;

import lifecoach.localdb.soap.ws.HealthMeasureHistory;
import lifecoach.localdb.soap.ws.Measure;
import lifecoach.localdb.soap.ws.Person;
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
@Path("/profile")
public class MeasureResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Path("/{id}/{measureType}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<HealthMeasureHistory> getPerson(@PathParam("id") long id, @PathParam("measureType") String measureType){
		
		System.out.println("Getting person "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readPersonHistory(id, measureType);
	}
	
	@POST
	@Path("/{id}/{measureType}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<HealthMeasureHistory> saveMeasure(@PathParam("id") long id, @PathParam("measureType") String measureType){
		
		/*BusinessLogic Service here
		 * 
		 * System.out.println("Getting person "+id);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
		 */
        //return storage.readPersonHistory(id, measureType);
		return null;
	}
	

}
