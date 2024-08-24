class a implements Runnable{
    public void run(){
    System.out.println("i am class a");
    }
}
public class threadbyrunnableinterface {
    public static void main(String[] args) {
        a a1 = new a();
        Thread t1 = new Thread(a1);
        t1.start();
    }
}
