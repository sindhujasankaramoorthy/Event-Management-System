package View;

import java.util.*;

import Model.Event;
import Model.Venue;
import Model.Organizer;
import Controller.EventController;

public class OrganizerView {

    private EventController eventController;

    public OrganizerView(EventController eventController) {
        this.eventController = eventController;
    }

    public void start() {

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n------ ORGANIZER MENU ------");
            System.out.println("1. Create Events");
            System.out.println("2. Manage Events");
            System.out.println("3. Logout");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

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

                Venue venue = new Venue(vId, vName, block, capacity);

                List<Organizer> organizers = new ArrayList<>();

                Event event = new Event(
                    eId, eName, type, date,
                    startTime, endTime,
                    venue, organizers
                );

                eventController.addEvent(event);

                System.out.println("Event Created Successfully!");

            } else if (choice == 2) {
                System.out.println("\n------ MANAGE EVENTS ------");
                System.out.println("1. View Events");
                System.out.println("2. Search Event");
                System.out.println("3. Delete Event");
                System.out.println("4. Update Event");
                System.out.println("5. Back");

                System.out.print("Enter Choice: ");

                int manageChoice = sc.nextInt();

                if (manageChoice == 1) {
                    List<Event> events = eventController.viewEvents();
                    System.out.println(events);
                } else if (manageChoice == 2) {
                    System.out.print("Enter Event ID: ");
                    int eId = sc.nextInt();

                    Event event = eventController.searchEvent(eId);

                    if (event != null) {
                        System.out.println(event);
                    } else {
                        System.out.println("Event Not Found!");
                    }
                } else if (manageChoice == 3) {
                    System.out.print("Enter Event ID: ");
                    int eId = sc.nextInt();

                    boolean deleted = eventController.deleteEvent(eId);

                    if (deleted) {
                        System.out.println("Event Deleted Successfully!");
                    } else {
                        System.out.println("Event Not Found!");
                    }

                } else if (manageChoice == 4) {

                    System.out.print("Enter Event ID to Update: ");
                    int eId = sc.nextInt();
                    sc.nextLine();

                    Event oldEvent = eventController.searchEvent(eId);

                    if (oldEvent != null) {

                        System.out.print("Enter New Event Name: ");
                        String eName = sc.nextLine();

                        System.out.print("Enter New Event Type: ");
                        String type = sc.nextLine();

                        System.out.print("Enter New Date: ");
                        String date = sc.nextLine();

                        System.out.print("Enter New Start Time: ");
                        String startTime = sc.nextLine();

                        System.out.print("Enter New End Time: ");
                        String endTime = sc.nextLine();

                        System.out.print("Enter New Venue ID: ");
                        int vId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Venue Name: ");
                        String vName = sc.nextLine();

                        System.out.print("Enter New Block: ");
                        String block = sc.nextLine();

                        System.out.print("Enter New Capacity: ");
                        int capacity = sc.nextInt();

                        Venue venue = new Venue(vId, vName, block, capacity);

                        List<Organizer> organizers = new ArrayList<>();

                        Event updatedEvent = new Event(
                            eId, eName, type, date,
                            startTime, endTime,
                            venue, organizers
                        );

                        boolean updated = eventController.updateEvent(eId, updatedEvent);

                        if (updated) {
                            System.out.println("Event Updated Successfully!");
                        } else {
                            System.out.println("Event Update Failed!");
                        }
                    }else {
                        System.out.println("Event Not Found!");
                    }

                } else if (manageChoice == 5) {
                    System.out.println("Returning...");
                } else {
                    System.out.println("Invalid Choice!");
                }

            } else if (choice == 3) {

                System.out.println("Logging out...");
                running = false;

            } else {

                System.out.println("Invalid Choice!");
            }
        }
    }
}