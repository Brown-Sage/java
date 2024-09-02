import java.util.Scanner;
public class para2 {
    static void method(int a,String name) {
        System.out.println(name + " " + a);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age");
        int a = sc.nextInt();
        sc.nextLine();   // to consume the leftover newline character
        System.out.println("what is your name");
        String name = sc.nextLine();
        method(a , name);
    }
}
