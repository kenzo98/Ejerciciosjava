
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Bd {

    
    public static void main(String[] args) {
        
        boolean ok =false;
        Scanner sc = new Scanner(System.in);  
        System.out.println("     MENÚ ACCESO");
        System.out.println("===========================");
        System.out.println("1. CONSULTA ");
        System.out.println("2. ACTUALIZAR BASE DE DATOS");
        System.out.println("3. INSERTAR");
        System.out.println("4. SALIR");
        System.out.println("===========================");
        
        while (!ok){
            System.out.println("\nSelecciona opción: ");
            int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
            {
                try {
                    Beer.select();
                } catch (SQLException ex) {
                    Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex.getErrorCode());
                }
            }
                        break;
                    case 2:
            {
                try {
                    Beer.update();
                } catch (SQLException ex) {
                    Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex.getErrorCode());
                }
            }
                        break;
                    case 3:
            {
                try {
                    Beer.insert();
                } catch (SQLException ex) {
                    Logger.getLogger(Bd.class.getName()).log(Level.SEVERE, null, ex.getErrorCode());
                }
            }
                        break;
                    case 4:
                        System.out.println("Gracias. Vuelva pronto!");
                        ok = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
            }
            
        
        
    }
   
    }

    
    
}

