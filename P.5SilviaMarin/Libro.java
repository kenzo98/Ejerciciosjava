
package Practica_5;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int isbn;
    private int ejem_libro;
    private int ejem_prestado;
    
    public Libro(){
    }
    
   
    public Libro (final Libro copia){
        titulo = copia.titulo;
        autor = copia.autor;
        isbn = copia.isbn;
        ejem_libro = copia.ejem_libro;
        ejem_prestado = copia.ejem_prestado;   
    }
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setEjem_libro(int ejem_libro) {
        this.ejem_libro = ejem_libro;
    }

    public void setEjem_prestado(int ejem_prestado) {
        this.ejem_prestado = ejem_prestado;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getEjem_libro() {
        return ejem_libro;
    }

    public int getEjem_prestado() {
        return ejem_prestado;
    }
      
    //METODOS
    
   
    public void añadir_libro(){
    	System.out.print("==================");
    	System.out.print("AÑADIR NUEVO LIBRO");
    	System.out.print("==================");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el titulo: ");
        String titulo=entrada.nextLine();
        this.titulo=titulo;
        System.out.print("Introduce el nombre del autor: ");
        String autor=entrada.nextLine();
        this.autor=autor;
        System.out.print("Introduce el ISBN: ");
        int isbn=entrada.nextInt();
        this.isbn=isbn;
        System.out.print("Introduce el Nº de ejemplares: ");
        int ejem_libro=entrada.nextInt();
        this.ejem_libro=ejem_libro;
        System.out.print("Introduce el Nº de ejemplares prestados: ");
        int ejem_prestado=entrada.nextInt();
        this.ejem_prestado=ejem_prestado;
    }      
    
    
    public void imprimirLibro(){
            System.out.print(this.getTitulo()+",");
    }

}
