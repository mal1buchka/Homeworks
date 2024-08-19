package august_18;

public class Booking {
    Room room;
    Guest guest;
    String checkinDate;
    String checkoutDate;
    double totalAmount;

    public Booking(Room room, Guest guest, String checkinDate, String checkoutDate) {
        this.room = room;
        this.guest = guest;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }
    double calculateTotalAmount() {
        return room.pricePerNight * (Integer.parseInt(getCheckoutDate())-Integer.parseInt(getCheckinDate()));
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

