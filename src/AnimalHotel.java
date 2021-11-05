import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalHotel {
    ArrayList<Room> RoomArray=new ArrayList<Room>();
    ArrayList<String> BookingArray=new ArrayList<String>();
    ArrayList<Animals> AnimalsArray=new ArrayList<Animals>();


    Room Room1=new Room("LightRoom","R001","50x50",1,true);
    String desc=Room1.describe();
    Room Room2=new Room("DarkRoom","R002","150x150",3,true);
    String desc1=Room2.describe();
    Room Room3=new Room("NestedRoom","R003","100x100",4,true);
    String desc2=Room3.describe();

    Animals Animals1=new Animals("Cat","Fish","Play");
    Animals Animals2=new Animals("Dog","Bones","Sleep");
    Animals Animals3=new Animals("Eagle","Fish","Making nest");



    public void PrintMenu(){
        System.out.println("Hej ! Welcome to the AnimalHotel");
        System.out.println("1.Booking");
       // System.out.println("2.Cancellation");
        System.out.println("2.Edit Booking");
        System.out.println("3.Check_In");
        System.out.println("4.Check_Out");
        System.out.println("5.Exit");

    }

    public void start(){


        boolean menuOption=true;
        while(menuOption){
            PrintMenu();
            System.out.print("Enter your Choice > ");
            int menuChoice=getUserInt();
            switch(menuChoice){
                case 1:
                    System.out.println("Hotel Booking");
                    BookingMethod();
                    break;
                case 2:
                    System.out.println("Edit Booking");
                    EditMethod();
                    break;
                case 3:
                    System.out.println("Check_In Details");
                    CheckInMethod();
                    break;
                case 4:
                    System.out.println("Check_Out Details");
                    CancelMethod();
                    break;
                case 5:
                    System.out.println("Exit from Booking");
                    System.out.println("You selected to exit");
                    menuOption=false;
                    break;
                default:
                    System.out.println("You entered wrong option ");
                    break;
            }
        }
    }

    public int getUserInt(){
        Scanner scan=new Scanner(System.in);
        int values=scan.nextInt();
        return values;
    }

    public String getUserString(){
        Scanner scan=new Scanner(System.in);
        String myString=scan.nextLine();
        return myString;
    }

    public void BookingMethod(){

        System.out.print("Enter the name : ");
        String name=getUserString();
        System.out.print("Enter your Favourite Food : ");
        String food=getUserString();
        System.out.print("Enter your Favourite activity : ");
        String activity=getUserString();
        BookingArray.add(name);
        BookingArray.add(food);
        BookingArray.add(activity);
       /*for(int i=0;i<AnimalsArray.size();i++)
        {
            if(name.equals(AnimalsArray.get(i).animal_name)){
                BookingArray.add(name);

                break;
        }
        }*/
        /*for(int i=0;i<BookingArray.size();i++){
            System.out.print(BookingArray.get(0) + " like to eat " + BookingArray.get(1) + " and " + BookingArray.get(2) + "  like to " + BookingArray.get(3));
            break;
        }*/
        System.out.println();
        RoomAvailabilityMethod();

    }

    public void CancelMethod(){
        System.out.println("Enter the name");
        String name=getUserString();
        System.out.println("Enter the Room number");
        String number=getUserString();
        for(int i=0;i<BookingArray.size();i++){

            if(name.equals(BookingArray.get(i))){
                //BookingArray.remove(name);
                //BookingArray.remove(number);
                BookingArray.clear();
                System.out.println("Booking Cancelled");
            }
        }
        //if(RoomArray.size()!=0){
            if(BookingArray.size()!=0){
            System.out.println(BookingArray);
        }
        else{
            System.out.println("No Booking.");
        }
    }

    public void RoomAvailabilityMethod() {
        System.out.print("Enter the  Room : ");
        String number = getUserString();
        int quantity;
        RoomArray.add(Room1);
        RoomArray.add(Room2);
        RoomArray.add(Room3);
        System.out.println("Select the Room Type");
        System.out.println("1.LightRoom");
        System.out.println("2.DarkRoom");
        System.out.println("3.NestedRoom");
        String roomChoice=getUserString();

        for (int i = 0; i < RoomArray.size(); i++) {
            //if (RoomArray.get(i).RoomChecking) {

                System.out.println(RoomArray.get(i).describe());
                System.out.println(RoomArray.get(i).room_number);
            //}
        }
        for (int i = 0; i < RoomArray.size(); i++) {
            //System.out.println(number);
            //while (RoomArray.get(i).RoomChecking) {

                if (RoomArray.get(i).room_number.equals(number) && RoomArray.get(i).room_type.equals(roomChoice)) {
                    //if (RoomArray.get(i).room_quantity != 0) {
                    if (RoomArray.get(i).room_quantity > 0) {
                    //while (RoomArray.get(i).room_quantity > 0) {
                        System.out.println("Rooms are available ");
                        quantity = RoomArray.get(i).room_quantity - 1;
                        System.out.println("Number of Rooms available now : " + quantity);
                        Room1.room_quantity=quantity;
                        BookingArray.add(number);
                        // RoomArray.get(i).setRoomChecking(false);
                        break;
                    }
                    else{
                        System.out.println("You cannot book.Rooms are already booked");
                        BookingArray.clear();
                      break;
                    }
                    //break;
                }
                     else {
                        System.out.println("Sorry,this Room is not available");
                    }

                //} //else {
                    //System.out.println("You entered a wrong room number");
                //}

//            }
        }
            System.out.println("Your Booking details ");
            for (int i = 0; i < BookingArray.size(); i++) {
                System.out.print(BookingArray.get(i) + " ");
            }
            System.out.println();

    }
        public void EditMethod(){
            System.out.println("Enter the name");
            String name=getUserString();
            System.out.println("Do you want to change your favourite activity?");
            String s1=getUserString();
            String activity;
            if(s1.equals("Yes")){
                System.out.println("Enter your Favourite Activity");
                activity=getUserString();
                if(activity.equals("Play")){
                    BookingArray.set(3,"R001");
                }
                else if(activity.equals("Sleep")){
                    BookingArray.set(3,"R002");
                }
                else if(activity.equals("Making Nest")){
                    BookingArray.set(3,"R003");
                }

            }else{
                System.out.println("No Changes");
            }
            for(int i=0;i<BookingArray.size();i++){
                System.out.println(BookingArray.get(i));
            }
        }

        public void CheckInMethod() {
            boolean option = true;
            while (option) {
                System.out.println("Select Booking details");
                System.out.println("1.List of all bookings");
                System.out.println("2.Individual bookings");
                int select=getUserInt();
                if(select==1) {
                    for (int i = 0; i < BookingArray.size(); i++) {
                        System.out.println(BookingArray.get(i));
                    }
                }
                else if(select==2){
                    System.out.println("Enter the Room number");
                    String rn
                }
            }
        }
    }

