import java.util.*;


public class selectionsort {
    
        public static void printArry(int arr[]){
            for(int i =0 ; i < arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args) {

        int arr[] = { 9, 3, 2, 1, 0 };

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j ;                    
                }
            }
            int temp = arr[smallest] ;
            arr[smallest] = arr[i] ;
            arr[i] = temp ;
        }
        printArry(arr);
    }
}