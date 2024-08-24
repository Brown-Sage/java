import java.util.Random;
import java.util.Scanner;
class rockpaper {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random(upperBound);
    System.out.println("What is your choice");
    int mine = sc.nextInt();
    int bot = rand.nextInt();
    System.out.println("bot chose "+ bot );

    if (bot==0 && mine==0){
        System.out.println("match draw");
    }
    else if (bot==0 && mine==1) {
        
        System.out.println("i won");
    }
    else if (bot==0 && mine==2){
        
        System.out.println("bot won");
    }
    else if (bot==1 && mine==0){
        
        System.out.println("bot won");
    }
    else if (bot==1 && mine==1){
        
        System.out.println(" match draw");
    }
    else if (bot==1 && mine==2){
        
        System.out.println("i won");
    }
    else if (bot==2 && mine==0){
        
        System.out.println("i won");
    }
    else if (bot==2 && mine==1) {
        
        System.out.println("bot won");
    }
    else if (bot==2 && mine==2) {
        
        System.out.println("match draw");
    }
    else {
     System.out.println("not a valid number");
    } 
  }
}

