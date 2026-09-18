package View;
import java.util.*;
import Controller.EventController;
import Model.Event;
import Model.Venue;
import java.util.*;
import Model.Organizer;

public class EventView {
    private Scanner sc = new Scanner(System.in);

    private EventController eventController;

    public EventView(EventController eventController) {
        this.eventController = eventController;
    }

    public void showMenu() {
        System.out.println("====== EVENT MANAGEMENT ======");
        System.out.println("1. Add Event");
        System.out.println("2. View Events");
        System.out.println("3. Search Event");
        System.out.println("4. Update Event");
        System.out.println("5. Delete Event");
        System.out.println("6. Exit");
    }

    public int getChoice() {
        System.out.println("Enter your choice: ");
        return sc.nextInt();
    }

    public void start() {
        int choice;

        do {
            showMenu();
            choice = getChoice();
            switch (choice) {
                case 1:
                    System.out.print("Enter Event ID: ");
                    int eId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Event Name: ");
                    String eName = sc.nextLine();
                    System.out.print("Enter Event Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter Start Time: ");
                    String startTime = sc.nextLine();
                    System.out.print("Enter End Time: ");
                    String endTime = sc.nextLine();

                    System.out.print("Enter Venue ID: ");
                    int vId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Venue Name: ");
                    String vName = sc.nextLine();
                    System.out.print("Enter Block: ");
                    String block = sc.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = sc.nextInt();
                    sc.nextLine();

                    Venue venue = new Venue(vId, vName, block, capacity);

                    List<Organizer> organizers = new ArrayList<>();

                    Event event = new Event(
                            eId,
                            eName,
                            type,
                            date,
                            startTime,
                            endTime,
                            venue,
                            organizers
                    );

                    eventController.addEvent(event);
                    System.out.println("Event added successfully!");
                    break;

                case 2:
                    List<Event> events = eventController.viewEvents();
                    if (events.isEmpty()) {
                        System.out.println("No events found.");
                    } else {
                        for (Event event1 : events) {
                            System.out.println(event1);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Event ID to search:");
                    int sId = sc.nextInt();
                    Event event1 = eventController.searchEvent(sId);
                    System.out.println(event1 ==null ? "Not Found" : event1 );
                    break;

                case 4:
                    System.out.println("Update Event");
                    break;

                case 5:
                    System.out.println("Delete Event");
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }while(choice != 6);
    }
}