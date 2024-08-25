interface a{
    void dc();
    void da();
}
class j21_interfaces implements a{
    public void dc(){
        System.out.println("frk nhi padta ");
    }
    public void da(){
        System.out.println("pucha bhi nhi");
    }

}
class j21_interfaces {
    public static void main(String[] args) {
        b A = new b();
        A.dc();
        b B = new b();
        B.da();
    }
}