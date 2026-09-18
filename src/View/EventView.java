package View;
import java.util.*;
import Controller.EventController;
import Model.Event;

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
                    System.out.println("Add Event");
                    break;

                case 2:
                    System.out.println("View Events");
                    break;

                case 3:
                    System.out.println("Search Event");
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