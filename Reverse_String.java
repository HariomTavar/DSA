class  Oops{
int age ;
int roll;
String name;
Oops(int age, int roll,String name ){
    this.name = name ;
    this.age= age;
    this.roll = roll;
}
public void display(){
    System.out.println(age+" "+name+" "+ roll);
}
}


public class Reverse_String {
    public static void main(String[] args) {
        Oops obj = new Oops(12,34 , "Ram");
        obj.display();
    }
}
