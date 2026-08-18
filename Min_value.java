
 class Min_value {
    public void Minimun(){
        int[] arr ;

      

        int min = arr[0];

        // Find minimum
        for(int value : arr) {

            if(value < min) {
                min = value;
            }

        }

        System.out.println("Minimum Value = " + min);
    }
}