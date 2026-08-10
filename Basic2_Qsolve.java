public class Basic2_Qsolve {
    static double Simple_interst(double p, double r, double t){
double si = (p*r*t)/100;
return si;
    }
    public static void main(String[] args ){
    double Simple = Simple_interst(3,32,5);
    System.out.println("its Simple interst : "+Simple);
     int n = -30;
     if (n<0){
        n = -n;
        System.out.println("num absolute value : "+ n);
     }
     else{
          System.out.println("num  not absolute ");
     }
    }
}
//  year % 4 = 0 
// year % 100 != 0
