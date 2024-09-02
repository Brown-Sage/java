package revision;

import java.util.Scanner;
class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your age");
        int age = sc.nextInt();
        String a = (age >= 18) ? "Allowed" : "Not Allowed";
        System.out.println(a);
        int b = (age < 18) ? 1 : 0;
        System.out.println(b);
    }

}
