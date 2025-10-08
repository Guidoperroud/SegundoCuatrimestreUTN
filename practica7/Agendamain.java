package practica7;

import java.util.Scanner;

public class Agendamain {
    public static void main(String[] args) {
        Agenda agendatelefonica = new Agenda();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la agenda!!");
        System.out.println("Que desea hacer:");
        System.out.println("Opcion 1: agregar un contacto nuevo.");
        System.out.println("Opcion 2: buscar un telefono.");
        System.out.println("Opcion 3: eliminar un contacto.");
        System.out.println("Opcion 4: mostrar los contactos.");
        int opcion;
        do {
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                        System.out.println("Ingrese el nombre:");
                        String nombre = scanner.nextLine();
                        System.out.println("Ingrese el telefono:");
                        String telefono = scanner.nextLine();
                    try {
                        agendatelefonica.agregarContacto(nombre, telefono);
                    } catch (AgendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    
                        System.out.println("Ingrese el nombre del contacto a buscar:");
                        nombre = scanner.nextLine();
                    try {
                        agendatelefonica.buscarTelefono(nombre);
                    } catch (AgendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    
                        System.out.println("Ingrese el nombre del contacto a eliminar:");
                        nombre = scanner.nextLine();
                    try {  
                        agendatelefonica.eliminarContacto(nombre);
                    } catch (AgendaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    agendatelefonica.mostrarTodosLosContactos();
                    break;
                default:
                    break;
            }
            
        } while (  opcion!= 5);
        scanner.close();
    }
}
