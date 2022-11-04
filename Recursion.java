import java.util.Scanner;
public class Recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
}
    public static void main(String[] args) {
            final Scanner sc = new Scanner(System.in);  //we can use final before Scanner sc for stop running it
            System.out.println("What is The number");
            int x = sc.nextInt();
            System.out.println(factorial(x));
        
        }  
}