import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args) {
        // get bit

        // int n = 5;
        // int pos = 3 ;
        // int bitmask = 1<<pos;

        // if ((bitmask & n)== 0) {
        //     System.out.println("bit was zero");
            
        // }
        // else{
        //     System.out.println("bit was one");
        // }

        // set bit

        // int n = 5;
        // int pos = 1 ;
        // int setbit = 1<<1;
        // int number = setbit | n ;
        // System.out.println(number);

        // clear bit
        // int n = 5;
        // int pos = 2;
        // int clearbit = 1<<pos;
        // int not = ~(clearbit);
        // int And = (not & n) ;
        // System.out.println(And);

        // update bit
        int number=5;
        int pos=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("only enter 0 and 1");
        int oper = sc.nextInt(); // update bit 1 else update bit to 0

        int bitmask = 1<<pos;
        if(oper==1){
            // if the operation is 1 
        int newnumber = bitmask | number ;
        System.out.println(newnumber);
        }
        else{
            //if the opertaion is 0
    
            int newbitmark = ~(bitmask);
            int newnumber = (newbitmark & number);
            System.out.println(newnumber);
        }
    }
}
