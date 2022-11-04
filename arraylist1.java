import java.util.ArrayList;
import java.util.Collections;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        list.add(0,2);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
         // Loops
        for(int i = 0; i<list.size(); i++){
            System.out.println("value in our "+i+" array is "+list.get(i));
        }
               //sorting 
        Collections.sort(list);
            System.out.println(list);
            list.remove(2);  
            System.out.println(list);
    }
}
