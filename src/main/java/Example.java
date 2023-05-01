public class Example {

    public int calculation(int arr[], int k){
         int count = 0;
        for(int i =0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
               if( (arr[i]+arr[j])%k == 0 ){
                   count++;
               }

            }
        }
                return count;


    }

    public static void main(String[] args) {

        int arr[] = {2, 2, 1, 7, 5, 3},  k=4;
        Example count = new Example();
        System.out.println(count.calculation(arr,k));

    }
}
