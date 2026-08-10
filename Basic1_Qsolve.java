import java.util.Scanner;
public class Basic1_Qsolve {
    public static void add(int a , int b){
        System.out.println(a+b);
    }
    static void swap(int a , int b){
        int temp = a ;
        a = b;
        b = temp;
        System.out.println("after swaping  a : "+ a +"and   b :"+b);
    }
    public static double celsioutoFahra(double c ){
 
       double  f = (c*9/5)+32;
return f;
    }
    public static void main (String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter A :");
int a = sc.nextInt();
System.out.println("Enter B :");
int b = sc.nextInt();
System.out.println("Sum of two number is :");
add(a,b);
swap(a,b);
System.out.println("Enter the celsious :" );
double c = sc.nextDouble();
double fahra = celsioutoFahra(c);
System.out.println("C :"+c + "   F :"+fahra);



//  in it have three  code :
// 1. add number 
// 2. swap 
// 3. ces and fahra  


sc.close();}
}
