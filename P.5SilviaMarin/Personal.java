
package Practica_5;

import java.util.Scanner;

public class Personal {
    private String Nombre;
    private String Apellido;
    private int Dni;
    private String Cargo;
    
    
    public Personal(){
    }
    
    
    public Personal (final Personal copia){
        Nombre = copia.Nombre;
        Apellido = copia.Apellido;
        Dni = copia.Dni;
        Cargo = copia.Cargo;
    }
    
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDni() {
        return Dni;
    }

    public String getCargo() {
        return Cargo;
    }
    
    
    public void añadirPersonal(){
        Scanner nuevPer = new Scanner(System.in);
        System.out.print("=========================");
        System.out.print("INTRODUCIR NUEVO PERSONAL");
        System.out.print("========================="); 
        System.out.print("Introduce el Nombre: ");
        String nombre = nuevPer.nextLine();
        this.Nombre = nombre;
        System.out.print("Introduce el Apellido: ");
        String apellido = nuevPer.nextLine();
        this.Apellido = apellido;
        System.out.print("Introduce el Cargo: ");
        String cargo = nuevPer.nextLine();
        this.Cargo = cargo;
        System.out.print("Introduce el DNI: ");
        int dni = nuevPer.nextInt();
        this.Dni = dni;
    }
        
    public void imprimirPersonal(){
            System.out.print(this.getNombre()+",");
    }
    
}
