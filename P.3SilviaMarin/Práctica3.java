
package práctica3;
import java.util.Scanner;


public class Práctica3 {

    
    public static void main(String[] args) {
       Cuenta cliente1= new Cuenta();
       cliente1.setNombre ("Silvia");
       cliente1.setNumero_cuenta (1234);
       cliente1.setSaldo (1300);
       cliente1.setInteres(2.0);
       Cuenta cliente2= new Cuenta();
       cliente2.setNombre ("Bruno");
       cliente2.setNumero_cuenta (5678);
       cliente2.setSaldo (1350);
       cliente2.setInteres(2.0);
       
       System.out.println("Datos clientes: \n");
       System.out.println("||Nombre: " + cliente1.getNombre() + "|| Numero de cuenta: " + cliente1.getNumero_cuenta()
                + "|| Tipo de Interes: " + cliente1.getInteres() + "|| Saldo: " + cliente1.getSaldo());
       System.out.println("=================================================================================");
       System.out.println("||Nombre: " + cliente2.getNombre() + "|| Numero de cuenta:" + cliente2.getNumero_cuenta()
                + "|| Tipo de Interes: " + cliente2.getInteres() + "|| Saldo: " + cliente2.getSaldo());
       System.out.println("=================================================================================");
        
       Scanner sc= new Scanner (System.in);
       System.out.println("Identifícate con tu número de cuenta, por favor: ");
       int entrada = sc.nextInt();
       while (entrada == 1234 || entrada == 5678) {          
            if (entrada == 1234) {
            System.out.println ("\n Bienvenido/a " + cliente1.getNombre());
            break;
            }
            else if (entrada == 5678) {
                System.out.println ("\n Bienvenido/a " + cliente2.getNombre());
                break;
            }       
            else {
                System.out.println ("Datos incorrecctos");
                break;
            } 
       }
        System.out.println ("\n Elige una opción: \n 1: Ingresar "
                + "\n 2: Reintegro \n 3: Transferir \n 4: Salir   ");
        
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Cuenta.ingreso (cliente1, cliente2);
                break;
            case 2:
                Cuenta.reintegro(cliente1, cliente2);
                break;
            case 3:
                Cuenta.transferencia(cliente1, cliente2);
                break;
            case 4:
                System.out.println("Hasta la próxima!");                                   
                }
        }      
    }

    


