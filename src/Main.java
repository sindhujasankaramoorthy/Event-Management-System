import java.util.Scanner;
import Controller.AuthController;
import Model.User;
import Model.Participant;
import Model.Organizer;
import View.OrganizerView;
import View.ParticipantView;
import Controller.EventController;

public class Main {

    public static void main(String[] args) {

        AuthController authController = new AuthController();
        EventController eventController = new EventController();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n---------- WELCOME -----------");
            System.out.println("1. Login");
            System.out.println("2. Create Identity");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 2) {

                System.out.println("Enter Role: (Participant / Organizer)");
                String role = sc.nextLine();

                System.out.print("Enter User Id: ");
                int uId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Phone Number: ");
                String phNo = sc.nextLine();

                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                if (role.equals("Participant")) {

                    System.out.print("Enter College: ");
                    String pClg = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int yr = sc.nextInt();

                    User participant = new Participant(
                        uId, name, email, phNo,
                        "Participant", pass,
                        pClg, branch, yr
                    );

                    authController.addUser(participant);
                    System.out.println("Participant Identity Created Successfully!");

                } else if (role.equals("Organizer")) {

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Organizer ID: ");
                    int oId = sc.nextInt();

                    User organizer = new Organizer(
                        uId, name, email, phNo,
                        "Organizer", pass,
                        dept, oId
                    );

                    authController.addUser(organizer);
                    System.out.println("Organizer Identity Created Successfully!");

                } else {
                    System.out.println("Invalid Role!");
                }

            } else if (choice == 1) {

                System.out.print("Enter User Id: ");
                int uId = sc.nextInt();

                System.out.print("Enter Password: ");
                String pass = sc.next();

                User user = authController.login(uId, pass);

                if (user == null) {
                    System.out.println("Oops..Invalid Login!");
                } 
                else if (user instanceof Participant) {

                    ParticipantView view = new ParticipantView(eventController);
                    view.start();

                } 
                else if (user instanceof Organizer) {

                    OrganizerView view = new OrganizerView(eventController);
                    view.start();
                }

            } else if (choice == 3) {

                System.out.println("Exiting....");
                running = false;

            } else {

                System.out.println("Invalid Choice!");
            }
        }
    }
}