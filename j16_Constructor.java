class j16_Constructor{
    dog(String b, int id){                            //This is constructor
        System.out.println("breed of the dog is "+ b);
        System.out.println("id of the dog is "+ id);
    }
}
class j16_Constructor {
    public static void main(String[] args) {
        dog harry = new dog("German shepherd",7);
        dog kutta = new dog("lab retrever",7);
    }
}    