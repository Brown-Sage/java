import java.util.Scanner;
public class nestedtrycatch {
    public static void main(String[] args) {
   int [] marks = {80,78,94};
   System.out.println("what is the number");
   Scanner sc = new Scanner(System.in);
    int ind = sc.nextInt();
       try{
        System.out.println("this is the main try");
        try{
            System.out.println("yeah its fine and it is "+ marks[ind]);
        }
        catch(Exception e){
            System.out.println("nested catch is working");
        }
       } 
       catch(Exception e){                           // this is useless now
        System.out.println("STFU its wrong");
       }
    }
}

