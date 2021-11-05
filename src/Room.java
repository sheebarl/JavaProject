public class Room {

    String room_number;
    String room_dimension;
    int room_quantity;
    String room_type;
    String room_description;
    boolean RoomChecking;
    LightRoom Room1;
    Animals guest;



    public Room(String type,String number,String dimension,int quantity,boolean check){
        this.room_type=type;
        this.room_number=number;
        this.room_dimension=dimension;
        this.room_quantity=quantity;
        //this.room_description=describe();
        this.RoomChecking=check;

    }

    public String describe(){
        room_description="Room for Animals";
        return room_description;
    }

    public String toString(){
        return room_number + describe();
    }

    public void setRoomChecking(boolean check){
        this.RoomChecking=true;

    }

    public Boolean getRoomChecking() {
        return RoomChecking;
    }

    public String getRoom_description(){
        return room_description;
    }

    public void setRoom_description(String description){
        this.room_description=description;
    }

    public void setGuest(Animals guest){
        this.guest=guest;
    }

    public boolean isAvailable(){
        //return guest==Null;
        return guest==null;

    }
     public Animals getGuest(){
        return guest;
     }
}
