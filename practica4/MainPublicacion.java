package practica4;

public class MainPublicacion {
     public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", 1967, "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("1984", 1949, "George Orwell", 328);
        Revista revista1 = new Revista("National Geographic", 2023, 202, "Agosto");

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        revista1.mostrarInfo();

        System.out.println("Prestando un libro: " + libro1.getTitulo());
        if (libro1.Prestar()) {
            System.out.println("Libro prestado.");            
        }
        else{
            System.out.println("Error al prestar el libro.");
        }

        System.out.println("Volviendo a prestar: " + libro1.getTitulo());
        if (!libro1.Prestar()) {
            System.out.println("Error. Libro no disponible.");
        }

        libro1.mostrarInfo();

        System.out.println("Devolviendo libro: " + libro1.getTitulo());
        libro1.Devolver();
        System.out.println("Libro devuelto.");

        libro1.mostrarInfo();
    }
}
