public class Organizer extends User {
    private int oId;
    private String dept;

    public Organizer(int userId, String name, String email, String phone, String password, String role, String dept, int oId) {
        super(userId, name, email, phone, password, role);
        this.dept = dept;
        this.oId = oId;
    }
}