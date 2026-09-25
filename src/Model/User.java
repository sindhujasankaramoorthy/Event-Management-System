package Model;

public class User {
    private int userId;
    private String name;
    private String email;
    private String phNo;
    private String role;
    private String pass;

    public User(int userId, String name, String email, String phNo, String role, String pass) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phNo = phNo;
        this.role = role;
        this.pass = pass;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getRole() {
        return role;
    }

    public String getPass() {
        return pass;
    }
}