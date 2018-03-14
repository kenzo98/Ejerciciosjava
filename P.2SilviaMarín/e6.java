
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;

public class e6 {
    public static void main(String [] args) {
        ejercicio6();
    }
    
    static void ejercicio6() {
        System.out.println("Introduce un número:");
        Scanner scn = new Scanner(System.in);
        int ejeX = scn.nextInt();
        System.out.println("Introduce otro número:");
        int ejeY = scn.nextInt();
        
        int [][] numbers = new int[ejeX][ejeY];
        for (int x = 0; x < ejeX; x++) 
        {
            String str = "";
            for (int y = 0; y < ejeY; y++) 
            {
                if(x == 0 || y == 0 || x == (ejeX-1) || y == (ejeY-1)){
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


