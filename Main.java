import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        PrintName obj =  new PrintName();
        obj.Print_namee();
        Count1ToN obj2 = new Count1ToN();
        System.out.println("Enter number");
        int n = sc.nextInt();
        obj2.Count_number(n);
        Min_value obj3 = new Min_value();
        int [] arr;
          System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

  sc.close();  }
}