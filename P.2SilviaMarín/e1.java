
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;


public class e1 {
    public static void main(String [] args) {
        ejercicio1();
    }
    
    static void ejercicio1() {
        int [][] numbers = new int[5][5];
        for (int x = 0; x < 5; x++) 
        {
            String str = "";
            for (int y = 0; y < 5; y++) 
            {
                numbers[x][y] = x + y;
                str += numbers[x][y] + " ";
            }
            System.out.println(str);
        }
    }
}


