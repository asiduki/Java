import java.util.*;

public class sortinginjava {
    public static void pritnarry(int arr[]){
        for(int i =0 ; i<arr.length;i++){
            System.err.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,4,2,1};

        //time complexity = O(n^2)
        //bubble sort
        for(int i =0 ; i < arr.length-1; i++){//n-1 time
            for(int j =0 ; j<arr.length-i-1 ; j++){//n^2
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;

                }
            }
        }
        pritnarry(arr);
    }
    
}
