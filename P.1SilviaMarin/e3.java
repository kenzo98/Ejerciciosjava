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
public class e3 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int pos = 0;
        int neg = 0;
        int[] myIntArray = new int[5];
        double sumaPos = 0;
        double sumaNeg = 0;
        int contador=0;
        

        for (i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            myIntArray[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            if (myIntArray[i] > 0) {
                sumaPos += myIntArray[i];
                pos++;
            } else if (myIntArray[i] < 0) {
                sumaNeg += myIntArray[i];
                neg++;
            }
        }

        if (pos != 0) {
            System.out.println("Media de los números positivos:");
            System.out.println(sumaPos / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }

        if (neg != 0) {
            System.out.println("Media de los números negativos:");
            System.out.println(sumaNeg / neg);
        } else {
            System.out.println("No ha introducido números negativos");
        }

        for (int j = 0;j < myIntArray.length; j++) {
            if (myIntArray[j]==0){
                contador=contador+1;
            }
        }

        System.out.println("Número de ceros:");
        System.out.println(contador);
    }
}
