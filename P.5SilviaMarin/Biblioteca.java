
package Practica_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private int IdBiblioteca;
    private String NomBiblioteca;
    private String DirecBiblioteca;
    ArrayList<Libro> ListaLibros = new ArrayList<>();
    ArrayList<Personal> ListaPersonal = new ArrayList<>();
    private int LibrosTotales;
    private int LibrosPrestados;
    static private int NumTotal;
    static private int NumPrestados;
    static ArrayList<Biblioteca> Bibliotecas = new ArrayList<>();
    static ArrayList<Personal> PersonalGlobal = new ArrayList<>();
        
 
    public Biblioteca (){
    }


    public Biblioteca (final Biblioteca copia){
        IdBiblioteca = copia.IdBiblioteca;
        NomBiblioteca = copia.NomBiblioteca;
        DirecBiblioteca = copia.DirecBiblioteca;
        ListaLibros = copia.ListaLibros;
        ListaPersonal = copia.ListaPersonal;
        LibrosTotales = copia.LibrosTotales;
        LibrosPrestados = copia.LibrosPrestados;
    }
     

    public int getIdBiblioteca() {
        return IdBiblioteca;
    }

    public String getNomBiblioteca() {
        return NomBiblioteca;
    }

    public String getDirecBiblioteca() {
        return DirecBiblioteca;
    }

    public ArrayList<Libro> getListaLibros() {
        return this.ListaLibros;
    }

    public ArrayList<Personal> getListaPersonal() {
        return ListaPersonal;
    }

    public static int getNumTotal() {
        return NumTotal;
    }

    public static int getNumPrestados() {
        return NumPrestados;
    }

    public static ArrayList<Biblioteca> getLibros() {
        return Bibliotecas;
    }

    public int getLibrosTotales() {
        return LibrosTotales;
    }

    public int getLibrosPrestados() {
        return LibrosPrestados;
    }

    public static ArrayList<Biblioteca> getBibliotecas() {
        return Bibliotecas;
    }

    public static ArrayList<Personal> getPersonalGlobal() {
        return PersonalGlobal;
    }     

    public void setIdBiblioteca(int IdBiblioteca) {
        this.IdBiblioteca = IdBiblioteca;
    }

    public void setNomBiblioteca(String NomBiblioteca) {
        this.NomBiblioteca = NomBiblioteca;
    }

    public void setDirecBiblioteca(String DirecBiblioteca) {
        this.DirecBiblioteca = DirecBiblioteca;
    }

    public void setListaLibros(ArrayList<Libro> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    public void setListaPersonal(ArrayList<Personal> ListaPersonal) {
        this.ListaPersonal = ListaPersonal;
    }

    public static void setNumTotal(int NumTotal) {
        Biblioteca.NumTotal = NumTotal;
    }

    public static void setNumPrestados(int NumPrestados) {
        Biblioteca.NumPrestados = NumPrestados;
    }

    public static void setLibros(ArrayList<Biblioteca> libros) {
        Biblioteca.Bibliotecas = libros;
    }

    public void setLibrosTotales(int LibrosTotales) {
        this.LibrosTotales = LibrosTotales;
    }

    public void setLibrosPrestados(int LibrosPrestados) {
        this.LibrosPrestados = LibrosPrestados;
    }

    public static void setBibliotecas(ArrayList<Biblioteca> Bibliotecas) {
        Biblioteca.Bibliotecas = Bibliotecas;
    }

    public static void setPersonalGlobal(ArrayList<Personal> PersonalGlobal) {
        Biblioteca.PersonalGlobal = PersonalGlobal;
    }   
    
    public void addLibro (Libro libro){
        ListaLibros.add(libro);
    }
    
    public void addPersonal (Personal personal){
        ListaPersonal.add(personal);
    }
        
    public void addBiblioteca (Biblioteca biblioteca){
        Bibliotecas.add(biblioteca);
    }
    
    public void addPersonalGlobal(Personal personal){
        PersonalGlobal.add(personal);
    }
    
    
    public void AñadirBiblioteca(){
    	System.out.print("=================");
    	System.out.print("AÑADIR BIBLIOTECA");
    	System.out.print("=================");
        Scanner dar = new Scanner (System.in);
        System.out.println("");
        System.out.print("Nombre: ");
        String NomBiblioteca = dar.nextLine();     
        this.NomBiblioteca = NomBiblioteca;       
        System.out.print("Dirección: ");
        String DirecBiblioteca = dar.nextLine();     
        this.DirecBiblioteca = DirecBiblioteca; 
        System.out.print("ID: ");
        int  IdBiblioteca = dar.nextInt();     
        this.IdBiblioteca = IdBiblioteca;
        Biblioteca.Bibliotecas.add(this);
        System.out.println("");
        System.out.println("¿Quieres introducir un libro?");
        Scanner intUsu = new Scanner (System.in);
        String preguntaLibroNuevo = intUsu.nextLine();
        while (preguntaLibroNuevo.equals("si")){
            System.out.println("");
            Libro libro_nuevo = new Libro();
            libro_nuevo.añadir_libro();
            this.ListaLibros.add(libro_nuevo);
            Biblioteca.NumTotal += libro_nuevo.getEjem_libro();
            Biblioteca.NumPrestados += libro_nuevo.getEjem_prestado();
            this.LibrosTotales += libro_nuevo.getEjem_libro();
            this.LibrosPrestados += libro_nuevo.getEjem_prestado();
            System.out.println("");
            System.out.println("¿Quieres introducir otro libro?");
            preguntaLibroNuevo = intUsu.nextLine();
        }
        System.out.println("");
        System.out.println("¿Quieres introducir un nuevo Empleado?");
        Scanner intPer = new Scanner (System.in);
        String preguntaPersonalNuevo = intPer.nextLine();
        while (preguntaPersonalNuevo.equals("si")){
            System.out.println("");
            Personal Personal_nuevo = new Personal();
            Personal_nuevo.añadirPersonal();
            this.ListaPersonal.add(Personal_nuevo);
            System.out.println("");
            System.out.println("¿Quieres introducir un nuevo Empleado?");
            preguntaPersonalNuevo = intPer.nextLine();
            Biblioteca.PersonalGlobal.add(Personal_nuevo);
        }
        System.out.println("");
        System.out.println("Libros: ");
        for(int i = 0;i<this.getListaLibros().size();i++){
            this.getListaLibros().get(i).imprimirLibro();
        }
        System.out.println("");
        System.out.println("Personal: "); 
        for(int i = 0;i<this.getListaPersonal().size();i++){
            this.getListaPersonal().get(i).imprimirPersonal();
        }
        System.out.println("");
    }
    
    
    public void altaLibro(){
        Scanner nuevoLibro =new Scanner (System.in);
        int id = 0;
        System.out.print("¿En qué biblioteca deseas dar de alta o baja el libro? (escribe la ID): ");
        id = nuevoLibro.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                for(int i = 0;i<biblioteca.getListaLibros().size();i++){
                    biblioteca.getListaLibros().get(i).imprimirLibro();
                }
                System.out.println("");
                Scanner altaBaja = new Scanner (System.in);
                System.out.print("¿Que deseas dar de alta o de baja un libro? ");
                String preguntaAltaBaja = altaBaja.nextLine();
                if(preguntaAltaBaja.equals("alta")){
                    System.out.print("¿Quieres seguro dar de alta libros en esta biblioteca? ");
                    Scanner cont = new Scanner (System.in);
                    String continuar = cont.nextLine();
                    while (continuar.equals("si")){
                        System.out.println("Introduce la informacion del libro que deseas añadir: ");
                        System.out.println("");
                        Libro libro_nuevo_alta = new Libro();
                        libro_nuevo_alta.añadir_libro();
                        biblioteca.ListaLibros.add(libro_nuevo_alta);
                        Biblioteca.NumTotal += libro_nuevo_alta.getEjem_libro();
                        Biblioteca.NumPrestados += libro_nuevo_alta.getEjem_prestado();
                        this.LibrosTotales += libro_nuevo_alta.getEjem_libro();
                        this.LibrosPrestados += libro_nuevo_alta.getEjem_prestado();
                        System.out.println("");
                        for(int i = 0;i<biblioteca.getListaLibros().size();i++){
                            biblioteca.getListaLibros().get(i).imprimirLibro();
                        }
                        System.out.println("");
                        System.out.print("Quieres introducir más libros: ");
                        continuar = cont.nextLine();                          
                    }                   
                }else if(preguntaAltaBaja.equals("baja")){
                    System.out.print("¿Quieres seguro dar de baja libros en esta Biblioteca? ");
                    Scanner cont = new Scanner (System.in);
                    String continuar = cont.nextLine();
                    while (continuar.equals("si")){
                        System.out.print("¿Cual es el ISBN del libro que deseas dar de baja? ");
                        int isbnCorrecto = cont.nextInt();
                        for(Libro libroActual : biblioteca.getListaLibros() ){
                             if (isbnCorrecto == (libroActual.getIsbn())){
                                Biblioteca.NumTotal -= libroActual.getEjem_libro();
                                Biblioteca.NumPrestados -= libroActual.getEjem_prestado();
                                this.LibrosTotales -= libroActual.getEjem_libro();
                                this.LibrosPrestados -= libroActual.getEjem_prestado();
                                biblioteca.getListaLibros().remove(libroActual);
                                System.out.println("EL libro a sido eliminado con exito.");     
                                for(int i = 0;i<biblioteca.getListaLibros().size();i++){
                                    biblioteca.getListaLibros().get(i).imprimirLibro();
                                }
                             }else{
                                 System.out.println("");
                                 System.out.println("EL libro no se ha encontrado.");
                             }                               
                        }                  
                        System.out.print("¿Quieres dar de baja más libros? ");
                        System.out.println("");
                        continuar = cont.nextLine();                          
                    }                                    
                }        
            }else{
                System.out.println("");
                System.out.println("No existe una biblioteca con esa ID");
            }
        }                           
    }
    
    
    public void altaPersonal(){
        Scanner nuevoLibro =new Scanner (System.in);
        int id = 0;
        System.out.print("¿En qué biblioteca deseas dar de alta o baja al personal? (escribe la ID) ");
        id = nuevoLibro.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                for(int i = 0;i<biblioteca.getListaPersonal().size();i++){
                    biblioteca.getListaPersonal().get(i).imprimirPersonal();
                }
                System.out.println("");
                Scanner altaBaja = new Scanner (System.in);
                System.out.print("¿Prefieres dar de alta o de baja? ");
                String preguntaAltaBaja = altaBaja.nextLine();
                if(preguntaAltaBaja.equals("alta")){
                    System.out.print("¿Estás seguro?");
                    Scanner cont = new Scanner (System.in);
                    String continuar = cont.nextLine();
                    while (continuar.equals("si")){
                        System.out.println("Introduce la información correspondiente: ");
                        System.out.println("");
                        Personal persona_nuevo_alta = new Personal();
                        persona_nuevo_alta.añadirPersonal();
                        biblioteca.ListaPersonal.add(persona_nuevo_alta);
                        System.out.println("");
                        for(int i = 0;i<biblioteca.getListaPersonal().size();i++){
                            biblioteca.getListaPersonal().get(i).imprimirPersonal();
                        }
                        System.out.println("");
                        System.out.print("¿Quieres introducir más personal? ");
                        continuar = cont.nextLine();                          
                    }                   
                }else if(preguntaAltaBaja.equals("baja")){
                    System.out.print("¿Quieres seguro dar de baja a una persona en esta biblioteca? ");
                    Scanner cont = new Scanner (System.in);
                    String continuar = cont.nextLine();
                    while (continuar.equals("sí")){
                        System.out.print("¿Cuál es el Nombre de la persona que deseas dar de baja? ");
                        String nombreCorrecto = cont.nextLine();
                        for(Personal personaActual : biblioteca.getListaPersonal() ){
                             if (nombreCorrecto.equals(personaActual.getNombre())){                                
                                 biblioteca.getListaPersonal().remove(personaActual);
                                 PersonalGlobal.remove(personaActual);
                                 System.out.println("La persona a sido eliminado con exito.");     
                                 System.out.println("Personal: "+biblioteca.getListaPersonal());
                                 for(int i = 0;i<biblioteca.getListaPersonal().size();i++){
                                     biblioteca.getListaPersonal().get(i).imprimirPersonal();
                                 }
                             }else{
                                 System.out.println("");
                                 System.out.println("No se ha encontrado a la persona.");
                             }                               
                        }                  
                        System.out.print("¿Quieres dar de baja más personas? ");
                        System.out.println("");
                        continuar = cont.nextLine();                          
                    }                                    
                }        
            }else{
                System.out.println("");
                System.out.println("No existe una biblioteca con esa ID");
            }
        }                           
    }
    
    
    public void estadisticas(){
        Scanner nuevoLibro =new Scanner (System.in);
        int id = 0;
        System.out.print("En qué biblioteca deseas dar de alta o baja el libro (escribe la ID): ");
        id = nuevoLibro.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                System.out.println("");
                System.out.println("======== DATOS BIBLIOTECA =======");
                for(int i = 0;i<biblioteca.getListaLibros().size();i++){
                    biblioteca.getListaLibros().get(i).imprimirLibro();
                }
                System.out.println("");
                System.out.println("Libros totales: "+this.getLibrosTotales());
                System.out.println("Libros totales prestados: "+this.getLibrosPrestados());
                for(int i = 0;i<biblioteca.getListaPersonal().size();i++){
                    biblioteca.getListaPersonal().get(i).imprimirPersonal();
                }
                
            }
            else{
                System.out.println("");
                System.out.println("No existe una biblioteca con esa ID");
            }
        }                           
    }
    
    
    public void estadisticasRed(){
        System.out.println("======== DATOS RED BIBLIOTECAS ==========");
        System.out.println("Libros totales: "+getNumTotal());
        System.out.println("Libros totales prestados: "+getNumPrestados());
        System.out.println("Personal: "+PersonalGlobal);
        System.out.println("=========================================");
    }
    
    
    public void consultarLibroBiblioteca(){
        Scanner consultarLibroBiblio =new Scanner (System.in);
        int id = 0;
        System.out.print("¿En qué biblioteca deseas consultar el libro? (escribe la ID) ");
        id = consultarLibroBiblio.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                System.out.print("¿Cuál es el ISBN del libro? ");
                int isbnCorrecto = consultarLibroBiblio.nextInt();
                for(Libro libroActual : biblioteca.getListaLibros() ){
                if (isbnCorrecto == (libroActual.getIsbn())){
                    System.out.println("");
                    System.out.println("========== DATOS LIBRO ==========");
                    System.out.println("Título: "+libroActual.getTitulo());
                    System.out.println("Autor: "+libroActual.getAutor());
                    System.out.println("ISBN: "+libroActual.getIsbn());
                    System.out.println("Ejemplares totales: "+libroActual.getEjem_libro());    
                    System.out.println("Ejemplares prestados: "+libroActual.getEjem_prestado());   
                    System.out.println("=================================");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("El libro no se ha encontrado.");
                }                               
                }                                           
            }                                    
        }        
        
    }
    
    public void reservarLibro(){
    Scanner reservarLi =new Scanner (System.in);
        int id = 0;
        System.out.print("¿En qué biblioteca deseas reservar el libro? (escribe la ID) ");
        id = reservarLi.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                System.out.print("¿Cuál es el ISBN del libro? ");
                int isbnCorrecto = reservarLi.nextInt();
                for(Libro libroActual : biblioteca.getListaLibros() ){
                if (isbnCorrecto == (libroActual.getIsbn())){
                    System.out.println("¿Cuántos ejemplares deseas reservar? ");
                    int reservar = reservarLi.nextInt();
                        if (reservar < (libroActual.getEjem_libro())){
                            libroActual.setEjem_libro(libroActual.getEjem_libro() - reservar);
                            libroActual.setEjem_prestado(libroActual.getEjem_prestado() + reservar);
                            Biblioteca.NumTotal -= reservar;
                            Biblioteca.NumPrestados += reservar;
                            this.LibrosTotales -= reservar;
                            this.LibrosPrestados += reservar;
                            System.out.println("");
                            System.out.println("Libros totales: "+libroActual.getEjem_libro());
                            System.out.println("Libros prestados: "+libroActual.getEjem_prestado());
                        }else{
                            System.out.println("No existen tantos ejemplares disponibles, lo sentimos.");
                        }                                           
                    }else{
                        System.out.println("");
                        System.out.println("EL libro no se ha encontrado.");
                    }                               
                }                                           
            }                                    
        }        
        
    }       

    
    public void devolverLibro(){
    Scanner devolverLi =new Scanner (System.in);
        int id = 0;
        System.out.print("¿En qué biblioteca deseas devolver el libro? (escribe la ID) ");
        id = devolverLi.nextInt();
        for(Biblioteca biblioteca : Bibliotecas){
            if (id == (biblioteca.getIdBiblioteca())){
                System.out.print("¿Cuál es el ISBN del libro? ");
                int isbnCorrecto = devolverLi.nextInt();
                for(Libro libroActual : biblioteca.getListaLibros() ){
                if (isbnCorrecto == (libroActual.getIsbn())){
                    System.out.println("¿Cuántos ejemplares deseas devolver? ");
                    int devolver = devolverLi.nextInt();
                        if (devolver < (libroActual.getEjem_prestado())){
                            libroActual.setEjem_libro(libroActual.getEjem_libro() + devolver);
                            libroActual.setEjem_prestado(libroActual.getEjem_prestado() - devolver);
                            Biblioteca.NumTotal += devolver;
                            Biblioteca.NumPrestados -= devolver;
                            this.LibrosTotales += devolver;
                            this.LibrosPrestados -= devolver;
                            System.out.println("");
                            System.out.println("Libros totales: "+libroActual.getEjem_libro());
                            System.out.println("Libros prestados: "+libroActual.getEjem_prestado());
                        }else{
                            System.out.println("No existen tantos ejemplares para devolver.");
                        }                                                               
                    
                }else{
                    System.out.println("");
                    System.out.println("EL libro no se ha encontrado.");
                }                               
                }                                           
            }                                    
        }        
        
    }               
    
    
}
