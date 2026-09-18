package Model;
import java.util.*;

public class Event {
    private int eId;
    private String eName;
    private String type;
    private String date;
    private String startTime;
    private String endTime;

    private Venue venue;
    private List<Organizer> organizers;

    public Event(int eId, String eName, String type, String date, String startTime, String endTime, Venue venue, List<Organizer> organizers) {
        this.eId = eId;
        this.eName = eName;
        this.type =  type;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.venue = venue;
        this.organizers = organizers;
    }

    //we have used this is EventController -> searchEvent
    public int getEId() {
        return eId;
    }
}