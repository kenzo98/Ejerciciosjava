/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicas.p1;

import java.util.Scanner;

/**
 *
 * @author Sylvia
 */
public class e4 {
        public static void main(String [] args) {
        int[] myIntArray = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Introduce un número:");
            Scanner scn = new Scanner(System.in);
            myIntArray[i] = scn.nextInt();
        }
        System.out.print(myIntArray[0]+", "+myIntArray[9]+", "+myIntArray[1]+", "+myIntArray[8]+", "+myIntArray[2]+", "+myIntArray[7]+", "+myIntArray[3]+", "+myIntArray[6]+", "+myIntArray[4]+", "+myIntArray[5]);
    }
}
