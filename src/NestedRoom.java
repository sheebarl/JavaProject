public class NestedRoom extends Room{
    public NestedRoom(String type,String number,String dimension,int quantity,boolean check){
        super(type,number,dimension,quantity,check);
    }

    public String describe(){
        room_description="It is a NestedRoom where the birds love to stay";
        return room_description;
    }

    public String toString(){
        return room_number + describe();
    }

    public String getRoom_description(){
        return room_description;
    }

    public void setRoom_description(String description){
        this.room_description=description;
    }
}
