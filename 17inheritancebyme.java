class animal{
    public int a;
   int getX(){
    return a;
   }
   void setX(int a){
   this.a=a;
    }
}
class cat extends animal{
    public int y;
    public int getY(){
        return y;
    }
     public void setY(int y){
       this.y=y;
    }
}
public class inheritancebyme {
    public static void main(String[] args) {
    animal dk = new animal();
    dk.setX(24);
    System.out.println("the animal class answer is "+ dk.getX());

    
    cat meow = new cat();
    meow.setY(23);
    System.out.println("the answer of animal class is "+ meow.getY());
    }
}
