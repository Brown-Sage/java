import java.util.Scanner;
public class j13_method {
    static int logic(int x, int y){
       int z;
       if(x>y){
        z = x+y;
       }
       else{
        z = y-x;
       }
       return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a and then b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = logic(a,b);
        System.out.println(c);
    }
}
