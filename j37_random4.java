import java.util.Scanner;
public class random4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("what are the marks");
    float maths = sc.nextInt();
    float english = sc.nextInt();
    float hindi = sc.nextInt();
    float marks = maths+english+hindi;
float b ;
b = ((maths+english+hindi)/60)*100;
     System.out.println(b);
    }
}