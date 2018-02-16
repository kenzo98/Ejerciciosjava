/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas.p1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sylvia
 */
public class e5 {
    public static void main(String [] args) {
        int[] myIntArray1 = new int[10];
        int[] myIntArray2 = new int[10];
        int[] myIntArray3 = new int[20];
        System.out.println("Primera tabla:");
        for(int i=0; i<10; i++){
            System.out.println("Introduce un número:");
            Scanner scn = new Scanner(System.in);
            myIntArray1[i] = scn.nextInt();
        }
        System.out.println("Segunda tabla:");
        for(int i=0; i<10; i++){
            System.out.println("Introduce un número:");
            Scanner scn = new Scanner(System.in);
            myIntArray2[i] = scn.nextInt();
        }
        
        
        for (int i = 0, j = 0; j < myIntArray3.length; ++i) {
            if (i < myIntArray1.length) {
                myIntArray3[j++] = myIntArray1[i];
            }
            if (i < myIntArray2.length) {
                myIntArray3[j++] = myIntArray2[i];
            }
        }

        System.out.println(Arrays.toString(myIntArray3));
    }
}
