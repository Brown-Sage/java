class j53_constructorinineheri{
    animal(){
        System.out.println("i am the legendary constuctor bitch");
    }
    animal(int a,int b){
        System.out.println("fark nhi padta pucha bhi nhi");
    }
}
class j53_constructorinineheri extends animal{
    dog(){
        System.out.println("i am the child of animal class");
    }
    dog(int a, int b, int c){
        super(a,b);
    System.out.println("i am the overloaded dog cons.");
    }
}
class j53_constructorinineheri extends dog{
    kutta(){
        System.out.println("i am the child of dog and grand child of animal");
    }
    kutta(int a, int b, int c, int d){
        super(a,b,c);                               // jin cons. me int h sirf unhe hi use krne ke liye
        System.out.println("overloaded kutta moment");   // we use super
    }
}

public class constructorinineheri {
    public static void main(String[] args) {
        kutta videshi = new kutta(12,23,34,45);
        kutta chutiya = new kutta();
    }
}
