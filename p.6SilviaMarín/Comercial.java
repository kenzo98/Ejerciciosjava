
package p6;

import java.util.ArrayList;
import java.util.Scanner;


public class Comercial extends Empleado {
    int comision;
    
    public Comercial (){
        
    }
    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public Comercial(int comision) {
        this.comision = comision;
    }

    public Comercial(int comision, String nombre, String apellidop, String apellidos, String nif, int edad, double salario) {
        super(nombre, apellidop, apellidos, nif, edad, salario);
        this.comision = comision;
    }
    
    @Override
    public void alta(){
        super.alta();
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce la comisión: ");
        this.setComision(sc.nextInt());
        
}
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("COMISIÓN: "+this.getComision());
            
        }
    }

