package Controller;

import Model.Event;
import java.util.ArrayList;
import java.util.List;

public class EventController {

    private List<Event> events;

    public EventController() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Event> viewEvents() {
        return events;
    }

    public Event searchEvent(int eId) {
        for (Event event : events) {
            if (event.getEId() == eId) {
                return event;
            }
        }
        return null;
    }

    public boolean updateEvent(int eId, Event updatedEvent) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEId() == eId) {
                events.set(i, updatedEvent);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEvent(int eId) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEId() == eId) {
                events.remove(i);
                return true;
            }
        }
        return false;
    }
}