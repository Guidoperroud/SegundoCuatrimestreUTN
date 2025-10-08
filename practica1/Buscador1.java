package practica1;
import java.util.Scanner;
public class Buscador1 {
     public void cargararray(int[] numeros, Scanner scanner){
        System.out.println("Ingrese 6 numeros: ");
        for( int i = 0; i < numeros.length; i++){
            System.out.print("Numero: "+ (i+1)+":");
            numeros[i]=scanner.nextInt();
        }
     }
    
    public void mostrararray(int[] numeros){
        System.out.print("Contenido del arreglo: ");
        for( int num : numeros){
            System.out.print(num + " ");
        }
        System.out.println();
    } 

    public int buscarelemento(int[] numeros, int objetivo){
        for (int i=0; i< numeros.length; i++){
            if (numeros[i]== objetivo) {
               return i; 
            }
        }
        return -1;
    }

}
