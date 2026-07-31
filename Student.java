public class Student{

       public int id;
      public   String name ;
      public   int roll;
      public  Student (int id,int roll,String name){ 
        this.id = id;
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return "Student{" +
        "roll="+roll +
        ", name ="+ name + "}";
    }

}