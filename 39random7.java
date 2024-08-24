import java.util.Scanner;
public class random7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the number a = ");
        int a = sc.nextInt();
        System.out.println("what is the number b = ");
        int b = sc.nextInt();
        System.out.println("what is the number c = ");
        int c = sc.nextInt();
        int d = (a*b)+(b/c);
        System.out.println(d);
    }
}