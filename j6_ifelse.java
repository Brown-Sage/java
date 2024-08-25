import java.util.Scanner;
public class j6_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("WHAT IS YOUR AGE");
        float age = sc.nextFloat();
        
        if (age<18){
            System.out.println("you are a brat STFU");
        }
        else {
            System.out.println("you can give your opinion");
        }
    }
}
