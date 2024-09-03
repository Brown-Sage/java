class human{
    int x;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}
class woman extends human{         //we use this format for child class class <subclass> extends <parentclass>
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}
    
public class inheritancebyme2 {
    public static void main(String[] args) {
        human trash = new human();
        trash.setX(9);
        woman gore = new woman();
        gore.setY(8);
        System.out.println("answer of class human is "+trash.getX() + "\n"+ "answer of class woman is "+ gore.getY());
    }
}
