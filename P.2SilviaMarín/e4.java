
package practicas.p2;
import java.util.Scanner;
import java.util.Arrays;

public class e4 {
    public static void main(String [] args) {
        ejercicio4();
    }
    
    static void ejercicio4() {
        int [][] numbers = new int[7][7];
        for (int x = 0; x < 7; x++) 
        {
            String str = "";
            for (int y = 0; y < 7; y++) 
            {
                if(x==y){
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


