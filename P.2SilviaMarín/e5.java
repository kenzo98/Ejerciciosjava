
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;

public class e5 {
    public static void main(String [] args) {
        ejercicio5();
    }
    
    static void ejercicio5() {
        int [][] numbers = new int[8][6];
        for (int x = 0; x < 8; x++) 
        {
            String str = "";
            for (int y = 0; y < 6; y++) 
            {
                if(x == 0 || y == 0 || x == 7 || y == 5){
                    numbers[x][y] = 1;
                }
                else{
                    numbers[x][y] = 0;
                }
                str += numbers[x][y] + " ";
            }
            System.out.println(str);
        }
    }
}


