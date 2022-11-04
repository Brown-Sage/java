public class multiplevarinloop {
    public static void var(int q){
        for(int i = 1 , j = 2, k = 3; i<=q ; i++,k++){   //MULTIPLE VARIABLE IN A LOOP
            System.out.println("i is "+i+ " j is "+j+ " k is "+k);
        }
    }
    public static void main(String[] args) {
        var(9);
    }
}
