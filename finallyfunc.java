import java.util.Scanner;
public class finallyfunc{
    public static int method(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("what is a and b ");
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            try {
                int c = a/b;
                return c;
            } catch (ArithmeticException e) {
                System.out.println("i am catch and its an excpetion ");
            }
            finally{
                System.out.println("its finally ");
            }
            return 0;
        }
    }
    public static void main(String[] args) {
      int x;
      x = method();
       System.out.println(x);
    }
}