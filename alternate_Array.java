public class alternate_Array {
    static boolean shorted(int [] arr){
        boolean shorted=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                shorted = false;
            }
            
        }
        
    }
    static int Maximum(int[] arr ){
        int Maximum = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]> Maximum){
                Maximum = arr[i];
            }
        }
        return Maximum;
     }
    
    // static void Mix_number(int [] arr){
    // int max  = arr[0];
    // for(int i=0; i<arr.length;i++){
    //     if(arr[i]> max){
    //         max = arr[i];
    //     }

    // }
    // System.out.println(max);
    // }
    public static void main(String[] args) {
        // System.out.println("print value");
        // double r = 0;
        // int n =34;
        // String re = (n%2<=0)?"even":"off";
        // System.out.println(n);
        // System.out.println(re);
        // int num = 234;
//         int [] arr = {3,2,34,5,6,7,85,7,8};
//         int re = Mix_number(arr);
// System.out.println(re);
//         // while (num<0) {
//         //     int d = num%10;
//         //     int ree = ree*10+d;
//         // }
        int [] arr = {3,5,6,7,8,9,0,8,77,6,5};
        boolean re = shorted(arr);
        System.out.println(re);
        // for(int i=0; i<2;i++){
        //     for(int j =0;j<5;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }}
}
