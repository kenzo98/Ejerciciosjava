
package práctica4;

import java.util.ArrayList;
import java.util.Scanner;
public class Práctica4 {   
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        ArrayList<Libro> lista_libros = new ArrayList<Libro>();
        ArrayList<Libro> lista_titulos = new ArrayList<Libro>();
        while (!salir) {
            System.out.println("=======================");
            System.out.println("|1. Crear libro       |");
            System.out.println("|2. Colección libros  |");
            System.out.println("|3. Libros disponibles|");
            System.out.println("|4. Alquilar libro    |");
            System.out.println("|5. Devolver libro    |");
            System.out.println("|6. Salir             |");
            System.out.println("=======================");

            System.out.println("Escribe una de las opciones");
            
           opcion = sn.nextInt();
                
            switch (opcion) {
                case 1:                                        
                    lista_libros.add(Libro.crear_libro());                                        
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("Títulos de la colección: ");
                    System.out.println("------------------------");
                    Libro.mostrarColeccion (lista_libros);
                    break;
                case 3:
                    Libro.libros_disponibles(lista_libros);
                    break;
                case 4:
                    //Libro.alquilar_libro(lista_libros);
                    Libro.alquilar_libro(lista_libros);
                    break;
                case 5:
                    Libro.entregar_libro(lista_libros);
                    break;
                case 6:
                    System.out.println("Gracias. Vuelva pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 6");
            }
        }
            
        }
    }

    




