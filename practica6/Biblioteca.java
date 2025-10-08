package practica6;

import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros){
        this.libros=libros;
    }

    public ArrayList<Libro> getLibros(ArrayList<Libro> libros){
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros){
        this.libros=libros;
    }

    public void PrestarLibro(String titulo) throws LibroNoencontradoException{
        for (Libro libro : libros) {
            if (libro.getTitulo(titulo).equalsIgnoreCase(titulo)) {

                if (libro.getDisponible(true)) {
                    libro.setDisponible(false);
                    System.out.println("Libro: " + libro.getTitulo(titulo) + "prestado.");
                    return;
                } else {
                    throw new LibroyaPrestadoException(libro.getTitulo(titulo) + "Libro no disponible.");
                }
                
            }
        }
        throw new LibroNoencontradoException(titulo + " no existe en esta biblioteca.");
    }

    public void DevolverLibro(String titulo) throws LibroNoencontradoException{
            for (Libro libro : libros) {
            if (libro.getTitulo(titulo).equalsIgnoreCase(titulo)) {

            if (!libro.getDisponible(true)) {
                    libro.setDisponible(true);
                    System.out.println("Libro: " + libro.getTitulo(titulo) + "devuelto.");
                    return;
                } else {
                    throw new LibroyaDisponibleException(libro.getTitulo(titulo) + "Libro ya esta disponible.");
                }
                
            }
        }
        throw new LibroNoencontradoException(titulo + " no existe en esta biblioteca.");
    }


}
