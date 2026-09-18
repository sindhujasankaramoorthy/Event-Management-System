import java.util.*;

public class EventController {
    private List<Event> events;

    //at eveery obj creation an empty list is created and events in that instance is added to the list
    public EventController() {
        events = new ArrayList<>();
    }

    //we'll receive Event obj here
    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> viewEvents() {
        return events;
    }

    public Event searchEvent(int eId) {
        for(Event event: events) {
            if(event.getEId() == eId) {
                return event;
            }
        }
        return null;
    }

    public boolean updateEvent(int eId, Event updatedEvent) {
        for(int i=0;i<events.size();i++) {
            if(events.get(i).getEId() == eId) {
                evets.set(i, updatedEvent);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEvent(int eId) {
        for(int i=0;i<events.size();i++) {
            if(events.get(i).getEId() == eId) {
                events.remove(i);
                return true;
            }
        }
        return false;
    }
}