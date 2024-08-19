package august_18;

public class Guest {
    String name;
    int guestId;
    public Guest(String name, int guestId) {
        this.name = name;
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }
}
