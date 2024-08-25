public class j15_method3 {
    static int logic(int x, int y){
        int z ;
        if(x>y){
            z = 100;
        }
        else {
            z = 50;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        c = logic(a,b);
        System.out.println(c);
    }
}
