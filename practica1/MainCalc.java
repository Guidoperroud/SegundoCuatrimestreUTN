
import java.util.Scanner;

public class MainCalc {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero:");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.suma(num1, num2));
        System.out.println("Resta: " + calc.resta(num1, num2));
        System.out.println("Producto: " + calc.multiplicar(num1, num2));
        System.out.println("Division: " + calc.dividir(num1, num2));

        scanner.close();
     }

}
