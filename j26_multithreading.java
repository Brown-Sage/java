class thread1 extends Thread{
    @Override
    public void run(){                //run is a special method in java in Thread class(ig)
     int a = 1;
     while(a<4000){   
        System.out.println("i am walking");
        a++;
    }
  }
}
class thread2 extends Thread{
    @Override 
    public void run(){
        int b = 1;
        while(b<4000){
            System.out.println("i am running");
            b++;
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.start();                           //start(); is special way to initialize programme
    t2.start();
    }
}
