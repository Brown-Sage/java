public class varArgs {
    static int logic(int a, int ...arr){
        int result = 2;
        for(int b:arr){
            result += b;
        }
         return result;
        
    }
    public static void main(String[] args) {
        System.out.println(logic(1,2,3));
        System.out.println(logic(1,3,4,4));
    }

}
