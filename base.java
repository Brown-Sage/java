
class Baserandom{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class base{
 public static void main(String[] args) {
        Baserandom b = new Baserandom();
        b.setX(23);
        System.out.println(b.getX());
    }
}