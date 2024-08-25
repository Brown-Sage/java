public class j7_breakinloop {
    public static void main(String[] args) {
        
        for (int i=1; i<10;i++){
          
            if (i==3){
               
                System.out.println("lets just end it here");
                break;
            }
            System.out.println(i+" its running");
        }
    }
}
