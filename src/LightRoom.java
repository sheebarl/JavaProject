public class LightRoom extends Room{
    public LightRoom(String type,String number, String dimension, int quantity,boolean check ){
        super(type,number,dimension,quantity,check);
    }

    public String describe(){
        room_description="It is a LightRoom where the  animals can play " ;
        System.out.println(room_description);
        return  room_description;

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
