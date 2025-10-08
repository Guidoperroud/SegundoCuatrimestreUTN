package practica5;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Videojuego> jueguitos = new ArrayList<>();
        System.out.println("Ingrese el nombre de 4 juegos: ");

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese nombre del juego " + (i+1) + "º:");
            String nombre = scanner.nextLine();
        
            System.out.println("Ingrese genero del juego " + (i+1) + "º:");
            String genero = scanner.nextLine();
            
            jueguitos.add(new Videojuego(genero, nombre));
            System.out.println("Juego agregado.");
        }
          
        System.out.println("Listando juegos. ");
        for (Videojuego videojuego : jueguitos) {
            System.out.println(videojuego);
        }

        for (int i = 0; i < jueguitos.size(); i++) {
            System.out.println("Nombre: " + jueguitos.get(i) + "Indice: " + i);
        }

        System.out.println("Busca un jueguito, ingrese un nombre:");
        String buscar = scanner.nextLine();
        boolean encontrado=false;

        for (int i = 0; i < jueguitos.size(); i++) {
            if (jueguitos.get(i).getNombre().equalsIgnoreCase(buscar)) {
                encontrado=true;
                System.out.println("Jueguito encontrado" + jueguitos.get(i));
                i=jueguitos.size();
            }
        }

        if (!encontrado) {
            System.out.println(encontrado + " no esta en la lista.");
        }

        System.out.println("Total de juegos: " + jueguitos.size());

        System.out.println("Borra un jueguito, ingrese un nombre:");
        String eliminar = scanner.nextLine();
        encontrado=false;

        for (int i = 0; i < jueguitos.size(); i++) {
            if (jueguitos.get(i).getNombre().equalsIgnoreCase(eliminar)) {
                encontrado=true;
                System.out.println("Jueguito eliminado" + jueguitos.get(i));
                i=jueguitos.size();
                jueguitos.remove(i);
            }
        }

        if (!encontrado) {
            System.out.println("No esta en la lista.");
        }

    for (Videojuego videojuego : jueguitos) {
        System.out.println(videojuego);
        }

    scanner.close();
    }
}