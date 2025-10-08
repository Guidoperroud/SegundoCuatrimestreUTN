import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestorarchivos {
    public String rutaArchivo;

    public Gestorarchivos(String rutaArchivo){
        this.rutaArchivo=rutaArchivo;
        this.crearArchivosinoexiste();
    }

    private void crearArchivosinoexiste(){
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo))){
                escritor.write("NOMBRE,APELLIDO,FECHA");
                escritor.newLine();
                System.out.println("Archivo creado");

            } catch (IOException e) {
                System.out.println("Error al crear archivo: " + e.getMessage());
            }
        }
    } List<Persona> personas = new ArrayList<>();
        public List<Persona> leerpersonas(){
            try(BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
                boolean PrimeraLinea=true;
                String linea;

                while ((linea = lector.readLine()) != null) {
                    if (PrimeraLinea) {
                        PrimeraLinea=false;
                        continue;
                    }
                    String [] partes = linea.split(",");
                    if (partes.length!=3) {
                        System.out.println("Linea mal formateada: " + linea);
                        continue;
                    }
                    try {
                        String nombre = partes[0];
                        String apellido = partes [1];
                        LocalDate fecha = LocalDate.parse(partes[2]);
                        personas.add(nombre, apellido, fecha);
                }
                     catch (Exception e) {
                        System.out.println("Error en formato fecha: " + e.getMessage());
                    }
                }              
            } catch (IOException e) {
                System.out.println("Error al leer archivo: " + e.getMessage());
            }
            return personas;
        }
    public void agregarPersonas(Persona p){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            escritor.write(p.toStringCSV);
            escritor.newLine();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }



}
