
package p6;

import java.util.Scanner;
import java.util.ArrayList;
public class P6 {

    
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();
       boolean salir= false;
       while (salir== false){
       System.out.println("\nBIENVENIDO");
       System.out.println("==========");
       System.out.println("Por favor, indica el número de opción: ");
       System.out.println("1. Introducir nuevo empleado en el sistema");
       System.out.println("2. Mostrar empleados del sistema");
       System.out.println("3. Salir");
       int opcion = sc.nextInt();
        switch (opcion) {
            case 1:  
                System.out.println("Indica si es 1. Empleado Standard, 2. Comercial o 3. Repartidor: ");
                int opc;
                boolean correcto=false;
                while (correcto == false) {
                    opc= sc.nextInt();
                    if (opc == 1){
                        Empleado nuevo_empleado= new Empleado();
                        nuevo_empleado.alta();
                        correcto=true;
                    }
                    else if (opc == 2){
                        Comercial nuevo_comercial= new Comercial();
                        nuevo_comercial.alta();
                        correcto=true;
                    }
                    else if (opcion == 3) {
                        Repartidor nuevo_repartidor= new Repartidor();
                        nuevo_repartidor.alta();
                        correcto=true;
                    }
                    else {
                        System.out.println("Por favor, indica tipo de empleado: ");
                        correcto= false;
                    }
                }            
                break;
                
            case 2:
                System.out.println("Introduce N.I.F: ");
                String nif;
                correcto=false;
                while (correcto!=true){
                    nif=sc.nextLine();
                    for (Empleado i: Empleado.getLista_empleados()) {
                        if (nif.equals(i.getNif())){
                            i.mostrar();
                            correcto=true;
                        }  
                        else {
                            System.out.println("Incorrecto, introdúcelo de nuevo: "); 
                            correcto =false;
                    }    
                    }
                }
                break;
            
            case 3:
                System.out.println("Hasta la próxima!");                                   
                }
       
    }
    }
    }