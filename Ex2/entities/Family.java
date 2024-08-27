package Ex2.entities;

public class Family {
    private static int autoId;
    private int id;
    private int address;

    public Family(int id, int address) {
        this.id = ++autoId;
        this.address = address;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Family.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
