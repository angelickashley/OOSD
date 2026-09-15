public class HotelRoom {

    //Q1
    private int roomNumber;
    private String roomType;    //"Single" or "Double"
    //Q2
    private int occupied;       // 0 = vacant, 1 = occupied
    private double rate;        //nightly rate

    //Q1
    public HotelRoom() {
        this.roomNumber = 0;
        this.roomType = "Unknown";
        this.occupied = 0;
        this.rate = 0.0;
    }

    //Q3
    public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
    }

    //Q1
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    //Q2
    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //Q4
    public boolean isOccupied() {
        return occupied == 1;
    }
}