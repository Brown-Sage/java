public class continueinloop {
    public static void main(String[] args) {
        int i=1;
        do{
        System.out.println(i);
        i++;
        if (i==5){
            System.out.println("This is ignored");
            continue;
        }
        }while(i<10);
    }
}
