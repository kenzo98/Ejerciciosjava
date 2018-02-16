
package práctica4;
import java.util.Scanner;
import java.util.ArrayList;
import static práctica4.Libro.libros_disponibles;
public class Libro {

    private static int num_ejem_pres_glob;
    public String titulo;
    
    private String autor;
    private String isbn;
    private int num_ejem_pres;
    private int num_ejem_tot;
    public static int num_ejem_pres_glo;
    public static int num_ejem_tot_glo;
// CONSTRUCTOR VACIO
    public Libro() {

    }
// CONSTRUCTOR CON PARAMETROS
    public Libro(String titulo,String autor,String isbm,int ejempres,int ejemtot,int ejempresglo,int ejemtotglo) {
    this.titulo=titulo;
    this.autor=autor;
    this.isbn=isbn;
    this.num_ejem_pres=ejempres;
    this.num_ejem_tot=ejemtot;
    this.num_ejem_pres_glo=ejempresglo;
    this.num_ejem_tot_glo=ejemtotglo;
}
    //CONSTRUCTOR COPIA
    public Libro (final Libro copia){
        titulo = copia.titulo;
        autor = copia.autor;
        isbn = copia.isbn;
        num_ejem_pres = copia.num_ejem_pres;
        num_ejem_pres_glo = 0;
        num_ejem_tot = copia.num_ejem_tot;   
        num_ejem_tot_glo = copia.num_ejem_tot_glo;
    }
// GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNum_ejem_pres() {
        return num_ejem_pres;
    }

    public void setNum_ejem_pres(int num_ejem_pres) {
        this.num_ejem_pres = num_ejem_pres;
    }

    public int getNum_ejem_tot() {
        return num_ejem_tot;
    }

    public void setNum_ejem_tot(int num_ejem_tot) {
        this.num_ejem_tot = num_ejem_tot;
    }

    public static int getNum_ejem_pres_glo() {
        return num_ejem_pres_glo;
    }

    public static void setNum_ejem_pres_glo(int num_ejem_pres_glo) {
        Libro.num_ejem_pres_glo = num_ejem_pres_glo;
    }

    public static int getNum_ejem_tot_glo() {
        return num_ejem_tot_glo;
    }

    public static void setNum_ejem_tot_glo(int num_ejem_tot_glo) {
        Libro.num_ejem_tot_glo = num_ejem_tot_glo;
    }
// METODO CREAR LIBRO
public static Libro crear_libro(){
    Scanner sc= new Scanner (System.in);
    Libro nuevoLibro= new Libro();
    System.out.println("===============AÑADIR NUEVO LIBRO====================");
    System.out.println("Introduce el título del libro: ");
    nuevoLibro.setTitulo(sc.nextLine());    
    System.out.println("Introduce el autor del libro: ");
    nuevoLibro.setAutor(sc.nextLine());
    System.out.println("Introduce el número de ISBN: ");
    nuevoLibro.setIsbn(sc.nextLine());
    System.out.println("Introduce el número de unidades: ");
    nuevoLibro.setNum_ejem_tot(sc.nextInt());
    System.out.println("====================================================");
    nuevoLibro.setNum_ejem_pres(0);
    return nuevoLibro;    
}

// MÉTODO PARA MOSTRARNOS LA LISTA DE LIBROS DE LA COLECCIÓN
public static void mostrarColeccion (ArrayList<Libro>lista_libros ){
    for (Libro i: lista_libros) {
        System.out.println("·"+i.titulo+", "+i.autor+". ISBN: "+i.isbn);
    } 
    
}

// MÉTODO PARA MOSTRARNOS LOS LIBROS QUE ESTÁN DISPONIBLES EN LA BIBLIOTECA
public static void libros_disponibles (ArrayList<Libro>lista_libros ){
    
    System.out.println(" -----------------------------------");
    System.out.println(" Estos son los títulos disponibles: ");
    System.out.println(" -----------------------------------");
    boolean disponibles= false;
    for (Libro libro: lista_libros) {       
        if (libro.getNum_ejem_tot() > 0){
            System.out.println("·"+libro.titulo+", "+libro.autor+". ISBN: "+libro.isbn);
            disponibles=true;
        }
        else {
            System.out.println("Actualmente no hay más ejemplares disponibles. ");
            disponibles=false;
        }
    }
}
public boolean prestar_Libro() {
        if (this.num_ejem_tot>this.num_ejem_pres){
            this.num_ejem_pres++;
            this.num_ejem_pres_glob++;
            this.num_ejem_tot--;
            return true;
        }
        else return false;
}
//MÉTODO PARA ALQUILAR EL LIBRO POR ISBN
public static void alquilar_libro (ArrayList<Libro>lista_libros) {
    Scanner sc= new Scanner (System.in);
    System.out.println("\nALQUILA AQUÍ TU LIBRO");
    System.out.println("\n=====================");
    System.out.println("\nIntroduce el código ISBN del libro que quieres alquilar: ");   
    String codigo=sc.nextLine();
    int i = 0;
    boolean encontrado= false;
    while (encontrado==false && i<lista_libros.size()){        
            if (lista_libros.get(i).getIsbn().equals(codigo)) {
                if (lista_libros.get(i).getNum_ejem_tot() > 0) {
                    lista_libros.get(i).prestar_Libro();
                    System.out.print ("\nEjemplar disponible.\nAquí tienes tu libro.\n");
                }
                else {
                    System.out.println("\nLo sentimos, no hay ejemplares diponibles. \n\n");
                }
            encontrado = true;
            }
            i++;
    }
    if (encontrado=false) {           
                System.out.println("\nEl ejemplar es erróneo o no existe en la colección.\n");               
            }            
    }


/*public static void alquilar (ArrayList<Libro>lista_libros) {
    Scanner sc= new Scanner (System.in);
    System.out.println("\nIntroduce el código ISBN del libro que quieres alquilar: ");   
    //int i = 0;
    boolean encontrado= false;
    for (Libro libro: lista_libros) {
        while (encontrado==false){
            String codigo=sc.nextLine();
            if (libro.getIsbn().equals(codigo)){
               if (libro.getNum_ejem_tot() > 0) {
                    libro.prestar_Libro();
                    System.out.print ("\nEjemplar disponible.\nAquí tienes tu libro.\n");
                }
               else if (libro.getNum_ejem_tot() <= 0){
                   System.out.println("\nLo sentimos, no hay ejemplares diponibles. \n\n");
               }
            encontrado = true;
            }
            else {
              System.out.println("\nEl ejemplar es erróneo o no existe en la colección.\n"); 
            encontrado = false;
            break;
            }
        }
    }
}
*/
public boolean devolver_libro() {
        if (this.num_ejem_pres>0){
            this.num_ejem_pres--;
            Libro.num_ejem_pres_glob--;             
            return true;
        }
        else return false;
    } 

// MÉTODO PARA DEVOLVERLO
public static void entregar_libro (ArrayList<Libro>lista_libros) {
 Scanner sc= new Scanner (System.in);
    System.out.println("\nDEVUELVE AQUÍ TU LIBRO");
    System.out.println("\n======================");
    System.out.println("\nIntroduce el código ISBN del libro que quieres devolver: ");
    String codigo=sc.nextLine();
    int i = 0;
    boolean encontrado = false;
    for (i=0; i< lista_libros.size(); i ++) { 
       if (lista_libros.get(i).getIsbn().equals(codigo)) { 
                lista_libros.get(i).devolver_libro();
                System.out.print ("\nLibro devuelto. Muchas gracias.\n");
                encontrado = true;
            }
            else {            
                System.out.println("\nEl ISBN introducido no es correcto, no se ha prestado o no pertenece a nuestro sistema.\n\n");
                encontrado = false;
            }   
        }
    }
}



   
        




    
    
  
    
    
    
 



