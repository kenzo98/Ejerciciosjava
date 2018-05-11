
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Savepoint;

public class Beer {
    static String bd="BEER";
    static String usuario="beer";
    static String contraseña="beer";
    static String url="jdbc:derby://localhost:1527/beer"; 

    public Beer() {
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public static void select() throws SQLException{ 
        Connection c =null;
            c=(Connection) DriverManager.getConnection(url,usuario,contraseña);
            Statement sentencia=c.createStatement();
            System.out.println("====================");
            System.out.println("Conexión establecida");
            System.out.println("====================\n");
            System.out.println("Nombre y Cadena: ");
            System.out.println("====================");
            String query="SELECT * FROM beer";
            ResultSet resultado=sentencia.executeQuery(query);
            while(resultado.next()){
                System.out.println(resultado.getString(1)+"|"+ resultado.getString(2));
            }
        
            System.out.println("No se ha podido establecer la conexión");
        
            c.close();
        }
    
    public static void update()throws SQLException {
        Connection c =null;
       
            c=(Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexión establecida");
            Scanner sc = new Scanner(System.in);  
            System.out.println("Indica a continuación el nombre del fabricante que quieres cambiar: ");
            String producto=sc.nextLine();
            System.out.println("Indica a continuación el nombre del nuevo fabricante: ");
            String productoNuevo=sc.nextLine();
            String actualizar= "update beer set brewer = ? where brewer = ?";
            PreparedStatement sentencia=c.prepareStatement(actualizar);
            sentencia.setString(1, productoNuevo);
            sentencia.setString(2, producto);
            sentencia.executeUpdate();
            System.out.println("Imprimiendo resultados");
            Beer.select();
            c.close();
        
        
        
}   
    public static void insert()throws SQLException {
        Connection c =null;
        Savepoint savepoint = null;
         try {
            
            c=(Connection) DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("Conexión establecida");
            c.setAutoCommit(false);
            Scanner sc = new Scanner(System.in);
            System.out.println("Introducir registro en 'Beer': \n");
            System.out.println("Indica a continuación el nombre del producto(cerveza) que quieres insertar: ");
            String cerveza=sc.nextLine();
            System.out.println("Indica a continuación el nombre del fabricante que quieres insertar: ");
            String fabricante=sc.nextLine();
            String insertar= "insert into beer"+"(name, brewer) values"+"(?,?)";
            PreparedStatement sentencia=c.prepareStatement(insertar);
            sentencia.setString(1, cerveza );
            sentencia.setString(2, fabricante);
            sentencia.executeUpdate();
            System.out.println("Introducir registro en 'Bar': \n");
            System.out.println("Indica a continuación el nombre del bar que quieres insertar: ");
            String nombre=sc.nextLine();
            System.out.println("Indica a continuación la dirección del bar que quieres insertar: ");
            String direccion=sc.nextLine();
            String insertar2= "insert into bar"+"(name, address) values"+"(?,?)";
            PreparedStatement sentencia2=c.prepareStatement(insertar2);
            sentencia2.setString(1, nombre );
            sentencia2.setString(2, direccion);
            sentencia2.executeUpdate();
            c.commit();
            System.out.println("Imprimiendo resultados");
            Beer.select();
          
         }
         catch(SQLException excep){
            System.out.println("No se ha podido establecer la conexión");
            c.rollback(savepoint);
            excep.printStackTrace();
         }
         finally {
            c.close();
        }
            
}
}