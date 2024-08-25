import java.util.Scanner;
public class j14_method1 {
    static int logic(int a, int b){   
        int c ;
        if(a>b){
            c = (a+b)/a;
        }
        else{
            c = (a-b)*b;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z;
        z = logic(x,y);
        System.out.println(z);
        
        System.out.println("now x1 ans y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1;
        z1 = logic(x1,y1);
        System.out.println(z1); 
    }


}

