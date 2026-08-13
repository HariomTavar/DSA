public class Exceptoion_handling {
    
    public static void main(String[] args) {
        try {
            int a =20;
            int b =0;
            System.out.println(a/b);
            
        } catch (Exception e) {
            System.out.println("Cannot divided by Zero");
          
        }
        finally{
            System.out.println("print final");
        }
    }
}
