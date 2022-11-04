class phone{
    public void on(){
        System.out.println("turning on phone....");
    }
    
    public void off(){
        System.out.println("turning off the phone....");
    }
}
class smartphone extends phone{
    @Override
    public void on(){
        System.out.println("turning on the smartphone....");
    }
    public void off(){
        System.out.println("turning off the smartphone ....");
    } 
}
public class DynamicMethoDispatch {
   public static void main(String[] args) {
    phone obj = new phone();              // allowed
    phone dk = new smartphone();          // allowed
 //   smartphone dc = new phone();          not allowed {only parent class can make obj child class}  
    smartphone dc = new smartphone();
    obj.on();
    dk.on();
    dc.off();
   }   
}