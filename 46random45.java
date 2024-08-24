import java.util.Scanner;

public class random45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age :");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("What is your height in cm ");
            int height = sc.nextInt();
            
             if(height<182){
                 System.out.println("sorry you are short and not eligible");
            }else{
                System.out.println("you are eligible");
            }
        }else {
            System.out.println("You can fuck off respectfully");
        }
    }
}
