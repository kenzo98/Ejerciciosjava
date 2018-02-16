package practicas.p1;
import java.util.Scanner;
import java.util.Arrays;

public class e2 {

    public static void main(String [] args) {
        int[] myIntArray = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Introduce un número:");
            Scanner scn = new Scanner(System.in);
            myIntArray[i] = scn.nextInt();
        }
        
        for(int i=4; i>-1; i--){
            System.out.print(myIntArray[i]+", ");
        }
    }
}
