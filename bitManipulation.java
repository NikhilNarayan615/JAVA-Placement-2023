import java.util.*;
public class bitManipulation{
    public static void main(String args[]){
        //Get bit

        // int n =5;
        // int pos = 2;
        // int bitMask = 1 << pos;
        // if((bitMask & n ) == 0){
        //     System.out.println("bit is zero");
        // }else {
        //     System.out.println("bit is one");
        // }

        //Set bit

        // int n = 5;
        // int pos = 1;
        // int bitMask = 1 << pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear Bit

        // int n = 5;
        // int pos = 2 ;
        // int bitMask = 1 << pos;

        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        //Update

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;

        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = (newBitMask);
            System.out.println(newNumber);
        }

    }
}