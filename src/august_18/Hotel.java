package august_18;

public class Hotel {
    Room[] rooms;
    Guest[] guests;
    Booking[] bookings;
    public Hotel(Room[] rooms, Guest[] guests, Booking[] bookings) {
        this.rooms = rooms;
        this.guests = guests;
        this.bookings = bookings;
    }
    void addRoom(Room room) {
        Room[] newRooms = new Room[rooms.length + 1];
        System.arraycopy(rooms, 0, newRooms, 0, rooms.length);
        newRooms[rooms.length] = room;
        rooms = newRooms;
    }
    void addGuest(Guest guest) {
        Guest[] newGuests = new Guest[guests.length + 1];
        System.arraycopy(guests, 0, newGuests, 0, guests.length);
        newGuests[guests.length] = guest;
        guests = newGuests;
    }
    Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
    Guest findGuestById(int guestId) {
        for (Guest guest : guests) {
            if (guest.getGuestId() == guestId) {
                return guest;
            }
        }
        return null;
    }
    void bookRoom(int guestId, int roomNumber, String checkInDate, String checkOutDate) {
        Room room = findRoomByNumber(roomNumber);
        Guest guest = findGuestById(guestId);
        if (room != null && guest != null && room.bookRoom()) {
            Booking booking = new Booking(room,guest,checkInDate, checkOutDate);
            Booking[] newBookings = new Booking[bookings.length + 1];
            System.arraycopy(bookings, 0, newBookings, 0, bookings.length);
            newBookings[bookings.length] = booking;
            bookings = newBookings;
        } else {
            System.out.println("Fail to book room");
        }
    }
     void checkOut(int guestId, int roomNumber) {
        Room room = findRoomByNumber(roomNumber);
        if (room != null) {
            room.freeRoom();
        }
    }
    double getTotalIncome() {
        double total = 0;
        for (Booking b : bookings) {
            total+= b.calculateTotalAmount();
        }
        return total;
    }

}
