import java.util.ArrayList;
public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(4);

        System.out.println(list.get(3));            
        System.out.println(list.size());    //to see total arraylists
        
        list.add(0,1);                      //to add the numbers in between
        System.out.println(list);           //to print numbers inside array       
    }
}
