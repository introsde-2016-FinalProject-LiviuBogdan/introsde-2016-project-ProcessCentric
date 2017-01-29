
package lifecoach.storageservice.soap.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import lifecoach.localdb.soap.ws.Achievement;
import lifecoach.localdb.soap.ws.Goal;
import lifecoach.localdb.soap.ws.HealthMeasureHistory;
import lifecoach.localdb.soap.ws.Measure;
import lifecoach.localdb.soap.ws.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Storage", targetNamespace = "http://ws.soap.storageservice.lifecoach/")
@XmlSeeAlso({
    lifecoach.localdb.soap.ws.ObjectFactory.class,
    lifecoach.storageservice.soap.ws.ObjectFactory.class
})
public interface Storage {


    /**
     * 
     * @param goal
     */
    @WebMethod
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdateGoalResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/updateGoalRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/updateGoalResponse")
    public void updateGoal(
        @WebParam(name = "goal", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Goal> goal);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Goal>
     */
    @WebMethod
    @WebResult(name = "goals", targetNamespace = "")
    @RequestWrapper(localName = "readGoalList", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadGoalList")
    @ResponseWrapper(localName = "readGoalListResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadGoalListResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readGoalListRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readGoalListResponse")
    public List<Goal> readGoalList(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param goalId
     * @return
     *     returns lifecoach.localdb.soap.ws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadGoalResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readGoalRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readGoalResponse")
    public Goal readGoal(
        @WebParam(name = "goalId", targetNamespace = "")
        long goalId);

    /**
     * 
     * @param goal
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Goal
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreateGoalResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/createGoalRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/createGoalResponse")
    public Goal createGoal(
        @WebParam(name = "Goal", targetNamespace = "")
        Goal goal,
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param goalId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeleteGoalResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/deleteGoalRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/deleteGoalResponse")
    public void deleteGoal(
        @WebParam(name = "goalId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> goalId);

    /**
     * 
     * @param personId
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Achievement>
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "readAchievementList", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadAchievementList")
    @ResponseWrapper(localName = "readAchievementListResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadAchievementListResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readAchievementListRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readAchievementListResponse")
    public List<Achievement> readAchievementList(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param achievementId
     * @return
     *     returns lifecoach.localdb.soap.ws.Achievement
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "readAchievement", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadAchievement")
    @ResponseWrapper(localName = "readAchievementResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadAchievementResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readAchievementRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readAchievementResponse")
    public Achievement readAchievement(
        @WebParam(name = "achievementId", targetNamespace = "")
        long achievementId);

    /**
     * 
     * @param achievement
     */
    @WebMethod
    @RequestWrapper(localName = "updateAchievement", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdateAchievement")
    @ResponseWrapper(localName = "updateAchievementResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdateAchievementResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/updateAchievementRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/updateAchievementResponse")
    public void updateAchievement(
        @WebParam(name = "achievement", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Achievement> achievement);

    /**
     * 
     * @param achievement
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Achievement
     */
    @WebMethod
    @WebResult(name = "achievement", targetNamespace = "")
    @RequestWrapper(localName = "createAchievement", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreateAchievement")
    @ResponseWrapper(localName = "createAchievementResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreateAchievementResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/createAchievementRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/createAchievementResponse")
    public Achievement createAchievement(
        @WebParam(name = "Achievement", targetNamespace = "")
        Achievement achievement,
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param achievementId
     */
    @WebMethod
    @RequestWrapper(localName = "deleteAchievement", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeleteAchievement")
    @ResponseWrapper(localName = "deleteAchievementResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeleteAchievementResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/deleteAchievementRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/deleteAchievementResponse")
    public void deleteAchievement(
        @WebParam(name = "achievementId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> achievementId);

    /**
     * 
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonListResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readPersonListRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readPersonRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePersonResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonResponse")
    public void updatePerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param person
     */
    @WebMethod
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.CreatePersonResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/createPersonRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/createPersonResponse")
    public void createPerson(
        @WebParam(name = "person", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Person> person);

    /**
     * 
     * @param personId
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.DeletePersonResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/deletePersonRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/deletePersonResponse")
    public void deletePerson(
        @WebParam(name = "personId", targetNamespace = "", mode = WebParam.Mode.INOUT)
        Holder<Long> personId);

    /**
     * 
     * @param personId
     * @param measureType
     * @return
     *     returns java.util.List<lifecoach.localdb.soap.ws.HealthMeasureHistory>
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonHistory", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonHistory")
    @ResponseWrapper(localName = "readPersonHistoryResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonHistoryResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readPersonHistoryRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readPersonHistoryResponse")
    public List<HealthMeasureHistory> readPersonHistory(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(name = "measureTypes", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypes", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadMeasureTypes")
    @ResponseWrapper(localName = "readMeasureTypesResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadMeasureTypesResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readMeasureTypesRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readMeasureTypesResponse")
    public List<String> readMeasureTypes();

    /**
     * 
     * @param mid
     * @param personId
     * @param measureType
     * @return
     *     returns lifecoach.localdb.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "readPersonMeasure", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonMeasure")
    @ResponseWrapper(localName = "readPersonMeasureResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.ReadPersonMeasureResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/readPersonMeasureRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/readPersonMeasureResponse")
    public HealthMeasureHistory readPersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureType", targetNamespace = "")
        String measureType,
        @WebParam(name = "mid", targetNamespace = "")
        long mid);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "savePersonMeasure", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.SavePersonMeasure")
    @ResponseWrapper(localName = "savePersonMeasureResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.SavePersonMeasureResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/savePersonMeasureRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/savePersonMeasureResponse")
    public Person savePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param measure
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.Measure
     */
    @WebMethod
    @WebResult(name = "measureOut", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonMeasure", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePersonMeasure")
    @ResponseWrapper(localName = "updatePersonMeasureResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePersonMeasureResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonMeasureRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonMeasureResponse")
    public Measure updatePersonMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measure", targetNamespace = "")
        Measure measure);

    /**
     * 
     * @param measureHistory
     * @param personId
     * @return
     *     returns lifecoach.localdb.soap.ws.HealthMeasureHistory
     */
    @WebMethod
    @WebResult(name = "healthHistory", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonHistoryMeasure", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePersonHistoryMeasure")
    @ResponseWrapper(localName = "updatePersonHistoryMeasureResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.UpdatePersonHistoryMeasureResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonHistoryMeasureRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/updatePersonHistoryMeasureResponse")
    public HealthMeasureHistory updatePersonHistoryMeasure(
        @WebParam(name = "personId", targetNamespace = "")
        long personId,
        @WebParam(name = "measureHistory", targetNamespace = "")
        HealthMeasureHistory measureHistory);

    /**
     * 
     * @param topic
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "picurl", targetNamespace = "")
    @RequestWrapper(localName = "getPicUrl", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.GetPicUrl")
    @ResponseWrapper(localName = "getPicUrlResponse", targetNamespace = "http://ws.soap.storageservice.lifecoach/", className = "lifecoach.storageservice.soap.ws.GetPicUrlResponse")
    @Action(input = "http://ws.soap.storageservice.lifecoach/Storage/getPicUrlRequest", output = "http://ws.soap.storageservice.lifecoach/Storage/getPicUrlResponse")
    public String getPicUrl(
        @WebParam(name = "topic", targetNamespace = "")
        String topic);

}
