abstract class a{
   public a(){
      System.out.println("me constructor hoon");
   }
   abstract public void dk();
}
class b extends a{
   public void dk(){
      System.out.println("class a ka abstract method hun me");
   }
}
public class abstractclass {
   public static void main(String[] args) {
    b B = new b();
    B.dk();
    //a c = new a();           //not allowed 
    a A = new b();           //allowed
    A.dk();
   }
}
