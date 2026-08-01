public class Array_problems {
//     }
static double getArrays(int[] arr){
int sum =0;
for ( int i : arr){
    sum += i;

}
int size = arr.length;
double avg = sum/ size;
return avg;
}
static int[] muttipleby10( int [] arr){
    int  size = arr.length;
    int newArray[] = new int [size];
    for (int index = 0; index < arr.length; index++) {
int ele = arr[index];
int newele = ele *10;
newArray[index] = newele;
        
    }
    return newArray;
}
static boolean Searching ( int[] arr , int target){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == target){
            return true;
        }
        
    }
    return false;
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
 public static void main(String [] args){
    int[] arr = {2,3,4,5,6,};
    int ans[] = muttipleby10(arr);
    System.out.println(getArrays(arr));
    System.out.println();
    for( int index : ans){
        System.out.println(index);
    }
    //  shearching 
    boolean search = Searching(arr, 6);
System.out.println("by seaching the anyment :"+search);
int maxi = Maximum(arr);
System.out.println(maxi);
}
}
