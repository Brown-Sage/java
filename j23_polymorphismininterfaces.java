interface wifi{
    void getnetwork();
    void connect();
}
interface gps{
    void getlocation();
    private void dk(){                                      //THIS IS PRIVATE METHOD WE CAN USE IT BY PLACING IN SAME INTERFACE OR CLASS
        System.out.println("fark nhi padta pucha bhi nhi ");
        
    }
    default void showlocation(){                            //DEFAULT METHOD...
        System.out.println("this is your location");
        dk();
    }
}
interface speaker{
    void connectspeaker();
    void producesound();
}
class j23_polymorphismininterfaces {
    void calling(){
        System.out.println("we are calling......");
    }
}
class j23_polymorphismininterfaces extends call implements wifi,gps,speaker{
    public void getnetwork(){
        System.out.println("trying to get network");
    }
    public void connect (){
        System.out.println("connecting to network");

    }
    public void getlocation(){
        System.out.println("trying to get location");
    }
    public void connectspeaker(){
        System.out.println("connecting to speaker");
    }
    public void producesound(){
        System.out.println("playing your favourite song");
    }
}

public class polymorphismininterfaces {
   public static void main(String[] args) {
    smartphone v = new smartphone();
    v.getnetwork();
    v.connect();
    v.getlocation();
    v.connectspeaker();
    v.producesound();     
    gps s = new smartphone();                    //WE CAN'T MAKE OBJECTS OF INTERFACE BY DEFAULT SO WE HAVE TO USE THE CLASS
    s.showlocation();                            //THAT INHERITS IT
   } 
}
