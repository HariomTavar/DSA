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

  sc.close();  }
}