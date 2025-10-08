package practica8.ListaComprasAvanzada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Listacomprasavanzada {
    public static void main(String[] args) {
        String ArchivoEntrada = "productos.csv";
        String ArchivoSalida = "resumen_compra.txt";

        ArrayList<Productos> productos = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(ArchivoEntrada))) {
            String linea;
            lector.readLine();
            String nombreaux;
            categoria aux;
            Double precioaux;
            Integer cantidadaux;

            while ((linea=lector.readLine())!=null) {  //Transformo la linea del csv en un array, guardo en variables y despues paso al arraylist
                String[] lineaaux=linea.split(",");
                linea.trim();
                nombreaux=lineaaux[0];
                aux=categoria.valueOf(lineaaux[1]);//busca el string en el enum
                precioaux=Double.parseDouble(lineaaux[2]);//pasa un string a double
                cantidadaux=Integer.parseInt(lineaaux[3]);//pasa un string a int
                Productos producto = new Productos(nombreaux, aux, precioaux, cantidadaux);
                productos.add(producto);
            }
            //agrupando productos por categoria
            //calcular totales
            ArrayList <Productos> Lacteos = new ArrayList<>();
            ArrayList <Productos> frutas = new ArrayList<>();
            ArrayList <Productos> granos = new ArrayList<>();
            ArrayList <Productos> carne = new ArrayList<>();
            ArrayList <Productos> panaderia = new ArrayList<>();
            ArrayList <Productos> verduras = new ArrayList<>();

            for (Productos productos2 : productos) {
                
                
            }


        } catch (IOException e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
        }
    }

}
