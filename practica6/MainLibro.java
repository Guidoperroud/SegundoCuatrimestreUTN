package practica6;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLibro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Libro libro1= new Libro("Nuestra parte de noche", "Orwell", true);
        Libro libro2 = new Libro("Paula", "Isabella Allende", true);
        Libro libro3 = new Libro("Martin Fierro", "Hernandez", true);

        ArrayList<Libro> libros = new ArrayList<>();
        
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        Biblioteca miBiblioteca = new Biblioteca(libros);

        try {
            miBiblioteca.PrestarLibro("Paula");
            
        } catch (LibroNoencontradoException e) {
            System.out.println(e.getMessage());
        }
        catch (LibroyaPrestadoException x){
            System.out.println(x.getMessage());
        }
        try {
            miBiblioteca.DevolverLibro("Martin Fierro");
        } catch (LibroNoencontradoException e) {
            System.out.println(e.getMessage());
        }
        catch(LibroyaDisponibleException x){
            System.out.println(x.getMessage());
        }
        finally{
            System.out.println("paso lo que tenia que pasar.");
        }
        sc.close();
    }

}
