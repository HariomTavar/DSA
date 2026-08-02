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

static int[] Countvariable(int[] arr ){
    int Zero_count = 0;
    int one_count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            Zero_count++;

        }
        else{
            one_count++;
        }
    }
    int ans[] = { Zero_count,one_count};
    return ans;
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

int [] arr1 = {1,0,2,0,1,5,6,7,8,9};
System.out.println("Zero counting  = " + ans[0]);
System.out.println("");
}
}
