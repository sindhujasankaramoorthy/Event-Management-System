package Model;

public class Guest {
    private int gId;
    private String gName;
    private String designation;
    private String organization;
    private String phNo;
    private String email;

    public Guest(int gId, String gName, String designation, String organization, String phNo, String email) {
        this.gId = gId;
        this.gName = gName;
        this.designation = designation;
        this.organization = organization;
        this.phNo = phNo;
        this.email =email;
    }
}

