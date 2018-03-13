
package p6;

import java.util.Scanner;


public class Repartidor extends Empleado{
    String zona;
    
    public Repartidor(){
        
    };
    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona) {
        this.zona = zona;
    }

    public Repartidor(String zona, String nombre, String apellidop, String apellidos, String nif, int edad, double salario) {
        super(nombre, apellidop, apellidos, nif, edad, salario);
        this.zona = zona;
    }
    @Override
    public void alta(){
        super.alta();
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce la zona donde reparte: ");
        System.out.println("A o B");
        boolean correcto=false;
        while (correcto == false) {
        this.setZona(sc.nextLine());
        if (this.getZona()== "A" || this.getZona()== "B"){
            correcto=true;
        }
        else {
            System.out.println("Zona indicada incorrecta, introdúcela de nuevo: ");
            correcto=false;
        }
    }
    }
         @Override
        public void mostrar(){
        super.mostrar();
        System.out.println("ZONA: "+this.getZona());
            
        }
       
}


