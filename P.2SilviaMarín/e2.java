
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;

public class e2 {
    public static void main(String [] args) {
        ejercicio2();
    }
    
    static void ejercicio2() {
        int [][] numbers = {
            {1, 2, 3, 4 },
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
          };
      
        boolean isSimmetric= true;
        for (int x1 = 0; x1 < 4; x1++) 
        {
            for (int y1 = 0; y1 < 4; y1++) 
            {
                if(numbers[x1][y1] != numbers[y1][x1]){
                    isSimmetric = false;
                }
            }
        }
        if (isSimmetric){
            System.out.println("El array es simétrico");
        }
        else{
            System.out.println("El array no es simétrico");
        }
    }
}


