
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;

public class e3 {
    public static void main(String [] args) {
        ejercicio3();
    }
    
    static void ejercicio3() {
        int [][] numbers1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
          };
        
        int [][] numbers2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
          };
        
        for (int x = 0; x < 3; x++) 
        {
            String str = "";
            for (int y = 0; y < 3; y++) 
            {
                str += (numbers1[x][y] + numbers2[x][y]) + " ";
            }
            System.out.println(str);
        }
    }
}


