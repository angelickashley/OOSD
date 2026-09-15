public class lab2q1{
    public static void main(String[] args){
        HotelRoom roomA = new HotelRoom();
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        HotelRoom roomB = new HotelRoom();
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        //"===== Q1 — Room Details =====")
        System.out.println("Room A — Number: " + roomA.getRoomNumber() + ", Type: " + roomA.getRoomType());
        System.out.println("Room B — Number: " + roomB.getRoomNumber() + ", Type: " + roomB.getRoomType());

        roomA.setOccupied(1); // 1 = occupied
        roomA.setRate(100);

        roomB.setOccupied(0); // 0 = vacant
        roomB.setRate(80);

        //Q2 — Full Room Details "
        System.out.println("Room A — Number: " + roomA.getRoomNumber() +
                        ", Type: " + roomA.getRoomType() + ", Occupied(1=yes): " + roomA.getOccupied() +
                        ", Rate: €" + roomA.getRate());
        System.out.println("Room B — Number: " + roomB.getRoomNumber() + ", Type: " + roomB.getRoomType() +
                        ", Occupied(1=yes): " + roomB.getOccupied() + ", Rate: €" + roomB.getRate());

        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
        //Q3 — Room C (4-arg Constructor)
        System.out.println("Room C — Number: " + roomC.getRoomNumber() + ", Type: " + roomC.getRoomType() +
                        ", Occupied(1=yes): " + roomC.getOccupied() + ", Rate: €" + roomC.getRate());
        //"Q4 — Occupancy Check & Double-Booking Prevention"
        System.out.println("Room A is occupied? " + roomA.isOccupied());
        System.out.println("Room B is occupied? " + roomB.isOccupied());

        if (!roomB.isOccupied()) { // "if NOT occupied"
            roomB.setOccupied(1);
            System.out.println("Room B was vacant — now set to occupied.");
        }
        else {
            System.out.println("Room B is already occupied — CANNOT double-book!");
        }
        if (!roomA.isOccupied()) {
            roomA.setOccupied(1);
            System.out.println("Room A was vacant — now set to occupied.");
        } else {
            System.out.println("Room A is already occupied — CANNOT double-book!");
        }
    }
}