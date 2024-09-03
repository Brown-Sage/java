class trycatch {
    public static void main(String[] args) {
        int x = 3;
        int y = 0;
        
        try {
            int z = x/y;
            System.out.println("the answer is "+z);
        }
        catch(Exception e){
            System.out.println("sorry but there is some error occured \n"+ e);
            System.out.println(e);
        }
        
    }
}