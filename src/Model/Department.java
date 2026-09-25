package Model;

public class Department {
    private int dId;
    private String dName;
    private String hod;
    private String phNo;
    private String email;
    private College college;

    public Department(int dId, String dName, String hod, String phNo, String email, College college) {
        this.dId = dId;
        this.dName = dName;
        this.hod = hod;
        this.phNo= phNo;
        this.email = email;
        this.college = college;
    }
}
