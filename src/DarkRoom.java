public class DarkRoom extends Room{
    public DarkRoom(String type,String number,String dimension,int quantity,boolean check){
        super(type,number,dimension,quantity,check);

    }

    public String describe(){
        room_description="It is a DarkRoom where the animals can sleep" ;
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



