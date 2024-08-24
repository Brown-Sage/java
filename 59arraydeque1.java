import java.util.ArrayDeque;

public class arraydeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(5);
        list.add(4);
        System.out.println(list.size());
    }
}
