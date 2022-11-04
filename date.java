import java.util.Date;
public class date {
    public static void main(String[] args) {
        System.out.println("hi");

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());
    }

}
