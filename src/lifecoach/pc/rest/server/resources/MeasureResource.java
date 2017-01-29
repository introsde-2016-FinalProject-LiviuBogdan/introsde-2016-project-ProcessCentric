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
public class MeasureResource {

	// Allows to insert contextual objects into the class,
	// e.g. ServletContext, Request, Response, UriInfo
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	String measureType;
	long personId;
	
	public MeasureResource(UriInfo uriInfo, Request request,long idPerson, String measureType) {
		this.uriInfo = uriInfo;
		this.request = request;
		this.personId = idPerson;
		this.measureType = measureType;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public List<HealthMeasureHistory> getPersonHistory(){
		
		System.out.println("Getting "+measureType+" history of person "+personId);
        StorageService service = new StorageService();
        Storage storage = service.getStorageImplPort();
        
        List<HealthMeasureHistory> history = storage.readPersonHistory(personId, measureType);

        //include the current measure as well
        for(Measure m : storage.readPerson(personId).getCurrentHealth().getMeasure()){
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
	@Produces({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	@Consumes({MediaType.APPLICATION_JSON ,  MediaType.APPLICATION_XML })
	public Feedback saveMeasure(Measure measure){
		System.out.println("Saving new measure for person: "+personId);
		
        BusinessLogic_Service service = new BusinessLogic_Service();
        BusinessLogic logic = service.getBusinessLogicImplPort();
        
		return logic.savePersonMeasure(personId, measure);
	}
}
