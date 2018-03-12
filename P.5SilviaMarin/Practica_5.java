
package Practica_5;

import static Practica_5.Biblioteca.Bibliotecas;
import java.util.ArrayList;
import java.util.Scanner;

public class Practica_5 {
   
    public static void main(String[]args){
        Scanner principal = new Scanner (System.in);
        Biblioteca lista = new Biblioteca();
            int opcion = 0;
            do{
                System.out.println("");
                System.out.println("================================");
                System.out.println("=   1. Gestión administrativa  =");
                System.out.println("=   2. Utilidades usuarios     =");
                System.out.println("=   3. Salir                   =");
                System.out.println("================================");
                System.out.println("Selecciona una opción: "); 
                opcion = principal.nextInt();
                System.out.println("");
                
                switch (opcion){
                    case 1://
                        Scanner gestion = new Scanner (System.in);
                        String usuario = "Miguel";
                        String contraseña = "123";
                        System.out.print("Usuario: ");
                        String preguntaUsuario = gestion.nextLine();
                        while (!preguntaUsuario.equals(usuario)){
                            System.out.println("El usuario no existe,vuelve a escribirlo.");
                            System.out.print("Usuario: ");
                            preguntaUsuario = gestion.nextLine();
                        }
                        System.out.print("Contraseña: ");
                        String preguntaContraseña = gestion.nextLine();
                            while (!preguntaContraseña.equals(contraseña)){
                                System.out.println("La contraseña no es la correcta,vuelve a escribirla.");
                                System.out.print("Contraseña: ");
                                preguntaContraseña = gestion.nextLine();
                            }
                        int opcionMenu1 = 0;
                        Scanner menu1 = new Scanner(System.in);
                        do{
                            System.out.println("");
                            System.out.println("=======================================");
                            System.out.println("=        -Gestión administrativa-     =");
                            System.out.println("=======================================");
                            System.out.println("=    1. Dar dea alta biblioteca        =");
                            System.out.println("=    2. Dar de alta/baja libro        =");
                            System.out.println("=    3. Dar de alta/baja personal     =");
                            System.out.println("=    4. Estadísticas biblioteca       =");
                            System.out.println("=    5. Estadísticas red bibliotecas  =");
                            System.out.println("=    6. Salir                         =");
                            System.out.println("=======================================");
                            System.out.print("Selecciona una opción: "); 
                            opcionMenu1 = menu1.nextInt();
                            System.out.println("");

                            switch (opcionMenu1){
                                case 1://DAR DE ALTA BIBLIOTECA
                                    Scanner añadirBiblio =new Scanner (System.in);
                                    Biblioteca BibliotecaNueva = new Biblioteca();
                                    System.out.println("Introduce los datos de la biblioteca que deseas dar de alta: ");
                                    BibliotecaNueva.AñadirBiblioteca();
                                    break;
                                    
                                case 2://DAR DE ALTA O BAJA UN LIBRO
                                    lista.altaLibro();
                                    break;
                                    
                                case 3://DAR DE ALTA O BAJA AL PERSONAL
                                    lista.altaPersonal();
                                    break;
                                    
                                case 4://ESTADISTICAS DE LA BIBLIOTECA   
                                    lista.estadisticas();
                                    break;
                                    
                                case 5://ESTADISTICA RED BIBLIOTECAS     
                                    lista.estadisticasRed();
                                    break;
                                                                    
                                default:
                                    System.out.println("Volver Atras.");
                                }                                
                            }while (opcionMenu1 < 6);
                        break;
                        
                    case 2://
                        int opcionMenu2 = 0;
                        Scanner menu2 = new Scanner(System.in);
                        do{
                            System.out.println("");
                            System.out.println("====================================="); 
                            System.out.println("=        -Utilidades usuarios-      =");
                            System.out.println("=====================================");                           
                            System.out.println("=    1. Consultar libro             =");
                            System.out.println("=    2. Consultar libro biblioteca  =");
                            System.out.println("=    3. Reservar libro              =");
                            System.out.println("=    4. Consultar Libro             =");
                            System.out.println("=    5. Salir                       =");
                            System.out.println("=====================================");
                            System.out.println("Selecciona una opción: "); 
                            opcionMenu2 = menu2.nextInt();
                            System.out.println("");

                            switch (opcionMenu2){
                                case 1://CONSULTAR LIBRO
                                    Scanner consultarLibro =new Scanner (System.in);
                                    System.out.print("¿Cual es el ISBN del libro que deseas consultar? ");
                                    int isbnCorrecto = consultarLibro.nextInt();
                                    System.out.println("");
                                    for(int i=0;i<Bibliotecas.size();i++){
                                        for (int j=0;j<Bibliotecas.get(i).ListaLibros.size();j++){
                                            if (isbnCorrecto==Bibliotecas.get(i).ListaLibros.get(j).getIsbn()){        
                                                System.out.println("El libro esta en biblioteca "+Bibliotecas.get(i).getNomBiblioteca());
                                            }else{
                                                System.out.println("EL libro no esta disponible en la biblioteca "+Bibliotecas.get(i).getNomBiblioteca());
                                            }
                                        }
                                    }
                                    break;

                                case 2://CONSULTAR LIBRO BIBLIOTECA
                                    lista.consultarLibroBiblioteca();
                                    break;

                                case 3://RESERVAR LIBRO
                                    lista.reservarLibro();
                                    break;
                                
                                case 4://DEVOLVER LIBRO
                                    lista.devolverLibro();
                                    break;
                                    
                                default:
                            }
                        }while (opcionMenu2 < 5);
                                    break;                       
                    default:
                        System.out.println("Hasta la vista");
                }
            }while (opcion < 3); 
    }
}
