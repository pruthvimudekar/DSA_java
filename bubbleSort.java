//bubble sort - arrange in an order.

public class bubbleSort {

    public static void bubblesortt(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){

                if(arr[j] > arr[j+1]){

                    // swap
                     int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
public static void printarr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

    public static void main(String args[]){
        int arr[]= {5,2,8,4,6,1,3};
        bubblesortt(arr);
        printarr(arr);
    }
}
