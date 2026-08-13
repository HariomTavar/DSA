
public class Throw {
static void Get(int age ){
      
        if (age<= 18) {
            throw new ArithmeticException("not allowed");
        }
        else{
            System.out.println("not");
        }
        System.out.println("print :");
    }


    public static void main(String[] args) {
        int age =12;
    Get(age);
}
}