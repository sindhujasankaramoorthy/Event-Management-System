public class Participant extends User {
    private String pClg;
    private String branch;
    private int yr;

    public Participant(int userId, String name, String email, String phNo, String role, String pass, String pClg, String branch, int yr) {
        super(userId, name, email, phNo, role, pass);

        this.pClg = pClg;
        this.branch = branch;
        this.yr = yr;


    }
}