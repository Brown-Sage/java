class animal{
    public void b1(){
        System.out.println("i am b1 from class animal");;
    }
    public void b2(){
        System.out.println("hey i m b2 from class animal");
    }
}
class dog extends animal{

    public void b1(){
        System.out.println("i m b1 from class dog");
    }
    public void b2(){
        System.out.println("hey i m b2 from class dog");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        
        dog bhow = new dog();
        bhow.b1();
        
    }
}

