package lifecoach.pc.rest.server.resources;

import java.util.List;

import javax.ejb.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
@Path("/measureTypes")
public class MeasureTypesResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<String> getTypes(){
		
		System.out.println("Getting types");
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();

        return storage.readMeasureTypes();
	}	
}
