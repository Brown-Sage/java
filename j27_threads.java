class j27_threads extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
       for(int i = 2;i<10;){
         System.out.println("his name is " + this.getName());
       }
    }
}
    public class threads {
    public static void main(String[] args) {
        mythr t1 = new mythr("Aaryan1");
        mythr t2 = new mythr("Aaryan2");
        mythr t3 = new mythr("Aaryan3");
        mythr t4 = new mythr("Aaryan4");
        mythr t5 = new mythr("Aaryan5");
        t1.setPriority(Thread.MIN_PRIORITY);     //this is used to set priority in code that which object will run more
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
    
}
