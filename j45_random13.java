class j45_random13{
    public int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("this is x");
         this.x = x;
    }
}
public class random13 {
    public static void main(String[] args) {
        animal cat = new animal();
        cat.setX(23);
        System.out.println(cat.getX());
    }
    
}
