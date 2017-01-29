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
import javax.xml.ws.Holder;

import lifecoach.businesslogic.soap.ws.BusinessLogic;
import lifecoach.businesslogic.soap.ws.BusinessLogic_Service;
import lifecoach.localdb.soap.ws.HealthMeasureHistory;
import lifecoach.localdb.soap.ws.Measure;
import lifecoach.localdb.soap.ws.Person;
import lifecoach.storageservice.soap.ws.Storage;
import lifecoach.storageservice.soap.ws.StorageService;

@Stateless
@LocalBean
@Path("/measures")
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
        
        List<HealthMeasureHistory> history = storage.readPersonHistory(id, measureType);
        //include the current measure as well
        for(Measure m : storage.readPerson(id).getCurrentHealth().getMeasure()){
        	if(m.getMeasureDefinition().getMeasureType().equals(measureType)){
        		HealthMeasureHistory hm = new HealthMeasureHistory();
        		hm.setMid(m.getMid());
        		hm.setMeasureDefinition(m.getMeasureDefinition());
        		hm.setMeasureValue(m.getMeasureValue());
        		hm.setDateRegistered(m.getDateRegistered());
        		history.add(hm);
        	}
        }
        return history;
	}
	
	@POST
	@Path("/{id}/{measureType}")
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public String saveMeasure(Measure measure, @PathParam("id") long id){
		
        BusinessLogic_Service service = new BusinessLogic_Service();
        BusinessLogic logic = service.getBusinessLogicImplPort();
		/*BusinessLogic Service here
		 * 
		 * System.out.println("Getting person "+id);
		 */
        //return storage.readPersonHistory(id, measureType);
		return logic.savePersonMeasure(id, measure);
	}
	

}
