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
public class e7 {
    public static void main(String [] args) {
        int seleccion = 0;
        System.out.println("Qué ejercicio deseas ejecutar?");
        Scanner scn = new Scanner(System.in);
        seleccion = scn.nextInt();
        if (seleccion == 1){
            ejercicio1(args);
        }
        else if(seleccion == 2){
            ejercicio2(args);
        }
        else if(seleccion == 3){
            ejercicio3(args);
        }
        else if(seleccion == 4){
            ejercicio4(args);
        }
        else if(seleccion == 5){
            ejercicio5(args);
        }
        else if(seleccion == 6){
            ejercicio6(args);
        }
        else if(seleccion == 7){
            System.out.println("No puedes hacer eso, sería un bucle infinito :p");
        }
        else{
            System.out.println("Ese ejercicio no existe");
        }
        
        
    }
    
    static void ejercicio1(String [] args) {
        e1 obj=new practicas.p1.e1();
        obj.main(args);
    }
    
    static void ejercicio2(String [] args) {
        e2 obj=new practicas.p1.e2();
        obj.main(args);
    }
    static void ejercicio3(String [] args) {
        e3 obj=new practicas.p1.e3();
        obj.main(args);
    }
    static void ejercicio4(String [] args) {
        e4 obj=new practicas.p1.e4();
        obj.main(args);
    }
    static void ejercicio5(String [] args) {
        e5 obj=new practicas.p1.e5();
        obj.main(args);
    }
    static void ejercicio6(String [] args) {
        e6 obj=new practicas.p1.e6();
        obj.main(args);
    }
}
