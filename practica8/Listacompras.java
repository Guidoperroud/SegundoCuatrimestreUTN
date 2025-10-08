package practica8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Listacompras {
    public static void main(String[] args) {
        String ArchivoEntrada = "lista_compras.txt";
        String ArchivoSalida = "resumen_compras.txt";

        ArrayList<String> productos = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(ArchivoEntrada))) {
            String linea;
            while ((linea = lector.readLine())!=null) {
                if (!linea.trim().isEmpty()) {
                    productos.add(linea.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i+1 +"-" + productos.get(i));
        }
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ArchivoSalida, true))){
            escritor.newLine();
            escritor.write("RESUMEN");
            escritor.newLine();

            escritor.write("Total de productos: " + productos.size());
        for (int i = 0; i < productos.size(); i++) {
            escritor.write(i+1 +"-" + productos.get(i));
        }  

        escritor.write("Primer producto: " + productos.get(0));
        escritor.newLine();
        escritor.write("Ultimo producto: " + productos.get(productos.size() - 1));
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
      
    }
    

}
