package View;

import java.util.*;
import Model.Event;
import Controller.EventController;


public class ParticipantView {

    private EventController eventController;

    public ParticipantView(EventController eventController) {
        this.eventController = eventController;
    } 

    public void start() {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n------ PARTICIPANT MENU ------");
            System.out.println("1. View Events");
            System.out.println("2. Register for Event");
            System.out.println("3. Logout");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                List<Event> events = eventController.viewEvents();
                System.out.println(events);

            } else if (choice == 2) {

                System.out.println("Register for Event");

            } else if (choice == 3) {

                System.out.println("Logging out...");
                running = false;

            } else {

                System.out.println("Invalid Choice!");
            }
        }
    }
}