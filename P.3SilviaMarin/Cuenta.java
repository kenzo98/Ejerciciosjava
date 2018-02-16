
package práctica3;
import java.util.Scanner;

public class Cuenta {
    String Nombre;
    double interes;
    double saldo;
    int numero_cuenta;

    public Cuenta() {
    }
    
    
    public Cuenta(String Nombre, double interes, double saldo, int numero_cuenta) {
        this.Nombre = Nombre;
        this.interes = interes;
        this.saldo = saldo;
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    
    //public void introducirDatos() {
       // Scanner introducirDatos = new Scanner(System.in);
       // System.out.println("Introduce tu nombre:  ");
       // setNombre(introducirDatos.nextLine());
        //System.out.println("Introduce tu número de cuenta: ");
        //setNumero_cuenta(introducirDatos.nextLine());
      //  System.out.println("Introduce el tipo de interés: ");
      //  setInteres (introducirDatos.nextDouble());
        //System.out.println("Introduce el saldo: ");
        //setSaldo (introducirDatos.nextDouble());
        
     
      public static boolean ingreso (Cuenta cliente1, Cuenta cliente2) {
       boolean ingreso = false;
       Scanner sc= new Scanner(System.in);
       System.out.println("Selecciona la cuenta de destino: ");
       System.out.println(" 1: " + cliente1.getNumero_cuenta() + "\n 2: "+ cliente2.getNumero_cuenta());
       int seleccionacuenta =sc.nextInt();
       switch (seleccionacuenta) {
           case 1234:               
               System.out.println("¿Cuánto dinero quiere ingresar?");
               double cantidad=sc.nextDouble();
               cliente1.setSaldo(cliente1.getSaldo()+ cantidad);
               System.out.println("El saldo en la cuenta se queda en: " + cliente1.getSaldo());
               break;
       case 5678:
               System.out.println("¿Cuánto dinero quiere ingresar?");
               double cantidad2=sc.nextDouble();
               cliente2.setSaldo(cliente2.getSaldo()+ cantidad2);
               System.out.println("El saldo en la cuenta se queda en: " + cliente2.getSaldo());           
               break;
       }        
       return ingreso;
    }
      
      public static boolean reintegro (Cuenta cliente1, Cuenta cliente2) {
       boolean reintegro = false;
       Scanner sc= new Scanner(System.in);
       System.out.println("Selecciona la cuenta de origen: ");
       System.out.println("1: " + cliente1.getNumero_cuenta() + "\n 2: "+ cliente2.getNumero_cuenta());
       int seleccionacuenta =sc.nextInt();
       switch (seleccionacuenta) {
           case 1234:
               if (cliente1.getSaldo() >= 0) {
               System.out.println("¿Cuánto dinero quiere retirar?");
               double cantidad=sc.nextDouble();
               cliente1.setSaldo(cliente1.getSaldo()- cantidad);
               System.out.println("El saldo en la cuenta se queda en: " + cliente1.getSaldo());
               break;
               }
               else {
               System.out.println("Saldo insuficiente");
               }
           case 5678:
               if (cliente1.getSaldo() >= 0) {
               System.out.println("¿Cuánto dinero quiere retirar?");
               double cantidad=sc.nextDouble();
               cliente2.setSaldo(cliente2.getSaldo()- cantidad);
               System.out.println("El saldo en la cuenta se queda en: " + cliente2.getSaldo());
               break;
               }
               else {
               System.out.println("Saldo insuficiente");
               }
       }            
       return reintegro;
    }
      
      public static boolean transferencia (Cuenta cliente1, Cuenta cliente2) {
       boolean transferencia = false;
       Scanner sc= new Scanner(System.in);
       System.out.println("Selecciona la cuenta de origen: ");
       System.out.println("1: " + cliente1.getNumero_cuenta() + "\n 2: "+ cliente2.getNumero_cuenta());
       int seleccionarcuenta=sc.nextInt();
       switch (seleccionarcuenta) {
           case 1234:
               if (cliente1.getSaldo() >= 0) {
                   System.out.println("La cuenta de destino es: " + cliente2.getNumero_cuenta());
                   System.out.println("¿Cuánto dinero quiere ingresar?");
                   double cantidad=sc.nextDouble();
                   cliente1.setSaldo(cliente1.getSaldo()- cantidad);
                   cliente2.setSaldo(cliente2.getSaldo()+ cantidad);
                   System.out.println("El saldo en la cuenta de origen se queda en: " + cliente1.getSaldo());
                   System.out.println("El saldo en la cuenta de destino se queda en: " + cliente2.getSaldo());
                   break;
                }
               else {
                   System.out.println("Saldo insuficiente");
                }
            
       case 5678:
           if (cliente2.getSaldo() >= 0) {
               System.out.println("La cuenta de destino es: " + cliente1);
               System.out.println("¿Cuánto dinero quiere ingresar?");
               double cantidad=sc.nextDouble();
               cliente2.setSaldo(cliente2.getSaldo()- cantidad);
               cliente1.setSaldo(cliente1.getSaldo()+ cantidad);
               System.out.println("El saldo en la cuenta de origen se queda en: " + cliente2.getSaldo());
               System.out.println("El saldo en la cuenta de destino se queda en: " + cliente1.getSaldo());
               break;
           }
           else {
           System.out.println("Saldo insuficiente");
           }
       }                  
       return transferencia;      
    }
}  


        
        
        
    
    