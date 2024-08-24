class thr1 extends Thread{
    public thr1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("the Name is "+this.getName());
        }
    }
}
class dk {
    public static void main(String[] args) {
        thr1 t1 = new thr1("Aaryan");
        thr1 t2 = new thr1("mayank");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}