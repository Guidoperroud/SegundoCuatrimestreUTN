package practica1;
import java.util.Scanner;
public class MainBusc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        Buscador1 buscador1 = new Buscador1();

        buscador1.cargararray(numeros, scanner);

        buscador1.mostrararray(numeros);

        System.out.print ("Ingrese el numero que desea buscar:");
        int objetivo = scanner.nextInt();

        int posicion = buscador1.buscarelemento(numeros, objetivo);

        if ( posicion != -1) {

            System.out.println("Numero encontrado en la posicion: " + posicion);
        } else {
            System.out.println("El numero no se encuentra en el array.");
        }
        scanner.close();
    }

}
