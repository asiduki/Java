import java.util.*;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of rows and coloumns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];

        for(int i =0 ;i < rows ; i++){
            for ( int j = 0 ; j < cols ; j++){
                 numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int i ;
        int j;
        for( i = 0; i < rows ; i++){
            for( j = 0; j < cols ; j++){
                if (numbers[i][j] == x) {
                    System.out.println("the location of x is " + i + "," + j);
                    
                }
            }
        }

    }
}
