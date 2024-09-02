package revision;
import java.util.Scanner;

public class method {
    static int a = 10;
    int b;

    static void plus() {
        a = a + 10;
        System.out.println(a);
    }

    static void minus() {
        a = a - 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose - plus or minus");
        String decide = sc.nextLine();
        if (decide.equals("plus")) {
            plus();
        }
        else if (decide.equals("minus")) {
            minus(); 
        }
    }
}
