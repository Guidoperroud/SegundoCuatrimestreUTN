import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCumples {
    public static void main(String[] args) {
        int opcion;
        Gestorarchivos gestorarchivos = new Gestorarchivos("personasfechas.cvs");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Sistema cumples");
            System.out.println("1- agregar personas");
            System.out.println("2- Ver todas las personas");
            System.out.println("3- ver cumples por mes");
            System.out.println("4- salir");

            sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    String nombre;
                    System.out.println("Ingrese nombre :  ");
                    nombre = sc.nextLine();

                    System.out.println("Ingrese apellido: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese fecha de nacimiento con formato yyyy/mm/dd");
                    String fechatexto = sc.nextLine();

                    try {
                        LocalDate fechanacimiento = LocalDate.parse(fechatexto);

                        Persona nueva = new Persona (nombre, apellido, fechanacimiento);
                        gestorarchivos.agregarPersonas(nueva);
                        System.out.println("Persona agregada correctamente.");
                    } catch (Exception e) {
                        System.out.println("fecha mal formateada.");
                    }
                    
                    break;
                case 2:
                    LIst <Persona> personas = gestorarchivos.leerpersonas();
                    if (personas.isEmpty()) {
                        System.out.println("No hay nadie en el archivo.");
                        break;
                    }
                    System.out.println("Persona en el archivo.");
                    for (Persona persona : personas) {
                        System.out.println("-" + persona.retornarpersonaconedad());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese un mes del 1-12");

                    int mes=sc.nextInt();
                    sc.nextLine();
                    LIst <Persona> personaspormes = gestorarchivos.leerpersonas();
                    if (personas.isEmpty()) {
                        System.out.println("No hay nadie en el archivo.");
                        break;
                    }
                    boolean haycumples=false;
                    for (Persona p : personaspormes) {
                        if (p.getFechanacimiento().getMonthValue() == mes) {
                            System.out.println(p.retornarpersonaconedad());
                            haycumples= true;
                        }
                    }
                    if (!haycumples) {
                        System.out.println("Nadie cumple en " + mes);
                    }
                    break;
                case 4:
                    System.out.println("Opcion invalida.");
                    break;            
            
                default:
                System.out.println("Opcion invalida.");
                    break;
            }


        } while (opcion=4);
    sc.close();    
    }
}
