package Model;

public class Venue {
    private int vId;
    private String vName;
    private String block;
    private int capacity;

    public Venue(int vId, String vName, String block, int capacity) {
        this.vId = vId;
        this.vName = vName;
        this.block = block;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return vName + " (Block: " + block + ", Capacity: " + capacity + ")";
    }
}