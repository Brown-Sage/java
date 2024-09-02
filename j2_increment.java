import java.util.Scanner;
public class j2_increment {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("what is the number");
        int a = sc.nextInt();
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(--a);
    }
}