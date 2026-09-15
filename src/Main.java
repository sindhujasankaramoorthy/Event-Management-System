import java.util.*;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("========== Student Management System ===========");

    while(sc.hasNextInt()) {
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine();

                System.out.print("Enter student name: ");
                String stud_name = sc.nextLine();

                System.out.print("Enter roll number: ");
                int rollNo = sc.nextInt();

                Student s = new Student(stud_name, rollNo);
                break;

            case 2:
                viewStud();
                break;

            case 3:
                System.out.print("Enter search roll number: ");
                int search_rollNo=sc.nextInt();
                search(search_rollNo);
                break;

            case 4:
                System.out.print("Enter roll number: ");
                int rNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                update(rNo, name);
                break;
            case 5:
                System.out.print("Enter roll number to delete: ");
                int del_rol = sc.nextInt();
                delete(del_rol);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
