
package p6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;
public class Empleado {
    String nombre;
    String apellidop;
    String apellidos;
    String nif;
    int edad;
    double salario;
    static ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();

    public static ArrayList<Empleado> getLista_empleados() {
        return lista_empleados;
    }

    public static void setLista_empleados(ArrayList<Empleado> lista_empleados) {
        Empleado.lista_empleados = lista_empleados;
    }
    


public Empleado () {

}
public Empleado (String nombre, String apellidop, String apellidos, String nif, int edad, double salario){
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



public void alta(){
    Scanner sc= new Scanner (System.in);
    
    System.out.println("========SISTEMA DE ALTA DE EMPLEADOS========");
    System.out.println("============================================");
    System.out.println("Introduce nombre del empleado: ");
    boolean may= false;
    while (may== false){  
        /*NO HE UTILIZADO UN MÉTODO PARA DETECTAR LAS MAYÚSCULAS YA QUE SE ACTUALIZAN DATOS DIFERENTES*/
        this.setNombre(sc.nextLine());
        String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";        
        for(int i=0; i< mayus.length(); i++) {
            if (mayus.charAt(i)==this.getNombre().charAt(0)){
                may=true;    
            }                   
        }
        if (may != true) {
            System.out.println("Formato incorrecto. Introdúcelo de nuevo: ");
        }
    } 
    System.out.println("Introduce primer apellido: "); 
    may=false;
    while (may== false){       
        this.setApellidop(sc.nextLine());            
        String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        for(int i=0; i< mayus.length(); i ++) {
            if (mayus.charAt(i)==this.getApellidop().charAt(0)){
                may=true;    
            }                   
        }
        if (may != true) {
            System.out.println("Formato incorrecto. Introdúcelo de nuevo: ");
        }
    }    
    System.out.println("Introduce segundo apellido: ");
    may=false;
    while (may== false){       
        this.setApellidos(sc.nextLine());            
        String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        for(int i=0; i< mayus.length(); i ++) {
            if (mayus.charAt(i)==this.getApellidos().charAt(0)){
                may=true;    
            }                   
        }
        if (may != true) {
            System.out.println("Formato incorrecto. Introdúcelo de nuevo: ");
        }
    } 
    System.out.println("Introduce N.I.F.: ");
    may= false;
    while (may == false) {
        this.setNif(sc.nextLine());
        String mayus ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";     
        if (this.getNif().length()==9){ //COMPRUEBA QUE LA LONGITUD SEA CORRECTA Y QUE EL FORMATO TAMBIÉN
            
            for(int i=0; i< mayus.length(); i ++) {
            if (mayus.charAt(i)==this.getNif().charAt(8)) {        
                may=true;
            }         
        }
        }
        
        if (may !=true) {
            System.out.println("Formato incorrecto. Introdúcelo de nuevo: ");
        }
    }
    
    System.out.println("Introduce edad: ");
        this.setEdad(sc.nextInt());
        
    System.out.println("Introduce salario: ");
        this.setSalario(sc.nextDouble()); 
        
    Empleado.lista_empleados.add(this);
}

public void mostrar(){
   
    System.out.println("\n========MOSTRAR EMPLEADOS========");
    System.out.println("=================================");
    System.out.println("NOMBRE: "+this.getNombre()+"\nPRIMER APELLIDO: "+this.getApellidop()+"\nSEGUNDO APELLIDO: "+this.getApellidos()+"\nNIF: "+this.getNif()+"\nEDAD: "+this.getEdad()+"\nSALARIO: "+this.getSalario());
            
        }
    
}
    
    

    

