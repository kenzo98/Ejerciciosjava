/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package practicas.p1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Sylvia
 */
public class e1 {

    public static void main(String [] args) {
        int[] myIntArray = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Introduce un número:");
            Scanner scn = new Scanner(System.in);
            myIntArray[i] = scn.nextInt();
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}
