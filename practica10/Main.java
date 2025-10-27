import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Reserva> Reservas = new HashMap<>();
    static SistemaHotel hotel = new SistemaHotel();
    static Reserva reserva = new Reserva();
    public static void main(String[] args) throws ReservaNoEncontradaException {
    int opcion=0;
        do {
            opcion= MostrarMenu(); // el menu aparte para una mejor lectura
            switch (opcion) {
                case 1:
                    MenuAgregarReserva();
                    break;
                case 2:
                    MenuConfirmarReserva();
                    break;
                case 3:
                    MenuHacerCheckIn();                    
                    break;
                case 4:
                    MenuBuscarReserva();
                    reserva.toString();
                    break;                    
                case 5:
                    MenuHacerCheckOut();                   
                    break;
                case 6:
                    MenuCancelarReserva();                   
                    break;
                case 7:
                    MenuBuscarPorEstado();
                    break;
                case 8:
                    hotel.generarReporteOcupacion();
                    break;
                
                default:
                    break;
            } 
        } while (opcion!=9);
        sc.close();
    }

    public static Integer MostrarMenu(){ //muestro el menu y checkeo que la opcion sea un numero del 1 al 9
    while (true) {
        System.out.println("=== SISTEMA DE RESERVAS HOTEL ==="); 
        System.out.println("\n1: Agregar reservas.");
        System.out.println("\n2: Confirmar reservas.");
        System.out.println("\n3: Hacer el check in.");
        System.out.println("\n4: Buscar una reserva.");
        System.out.println("\n5: Hacer el check out.");
        System.out.println("\n6: Cancelar una reserva.");
        System.out.println("\n7: Filtrar las reservas por estado.");
        System.out.println("\n8: Mostrar la ocupacion del hotel.");
        System.out.println("\n9: Salir.");
        System.out.println("\nElija un numero del 1 al 8 para continuar:");
        String op = sc.nextLine().trim();
        if (op.isEmpty()) {
            System.out.println("Error: Opcion vacia. Debe ingresar un numero entre del 1 y 9.");
            continue;
        }
        try {
            int opcion= Integer.parseInt(op);
            if (opcion < 1 || 9 <  opcion) {
                System.out.println("Error: Debe ingresar un numero entre 1 y 9.");
                continue; 
        }
        return opcion;
        } catch (Exception e) {
            System.out.println("Error: Opcion incorrecta. Debe ingresar un numero entre 1 y 9.");
        }        
        }
    }

    public static void MenuAgregarReserva(){ //pido los datos y los paso para agregar una reserva
        String reserva1str;
        int reservahab = 0;    
        while (true) { // la reserva como string primero para comprobar que no esta vacia
        System.out.println("Ingrese el numero de habitacion entre 1 y 50 que desea reservar: ");
        reserva1str = sc.nextLine().trim();
        if (reserva1str.isEmpty()) {
            System.out.println("Error: Debe ingresar el numero de habitacion que desea reservar.");
            continue;
        }

        try {
            reservahab = Integer.parseInt(reserva1str); // que el numero de habitacion sea entre 1 y 50
            if (reservahab < 1 || reservahab > 50) {
                System.out.println("Error: Debe ingresar un numero entre 1 y 50.");
                continue;
            }
        } catch (Exception e) {
           System.out.println("Error: Debe ingresar un numero de habitacion entre 1 y 50.");
        } break;
}        
        String nombre;
        while (true) { // validamos el nombre
            System.out.println("Ingrese el nombre del huesped.");
            nombre = sc.nextLine().trim();
            if (nombre.isEmpty() || nombre == null) {
                System.out.println("Error: el nombre no puede estar vacio.");
                continue;
        } break;
        }
        int nuevocodigoint;
        if(Reservas.size() == 0 ){
            nuevocodigoint = 1;
        } else { // BUsca el codigo de reserva mas alto Actual y a ese le suma uno
            nuevocodigoint = Reservas.keySet().stream()  //usando las claves del hashmap y crea un stream para procesar las claves
            .mapToInt(Integer :: parseInt) // transformo los string en int
            .max() // busco el maximo 
            .orElse(0) + 1; // si no hay maximo devuelve un 0 
        }

        
        String nuevocodigo= String.valueOf(nuevocodigoint);  // pasamos el string a int 

        String cantidadnochesstr;
        int cantidadnoches;

        while (true) {
            System.out.println("Ingrese la cantidad de noches que desea reservar la habitacion.");
            cantidadnochesstr = sc.nextLine().trim();
            if (cantidadnochesstr.isEmpty() || cantidadnochesstr == null) {
                System.out.println("Error: Debe ingresar la cantidad de noches que desea reservar.");
                continue;
            }
            cantidadnoches = Integer.parseInt(cantidadnochesstr);
            break;
        }

        
        LocalDate fechaingreso = LocalDate.now();
        EstadoReserva estado = EstadoReserva.PENDIENTE; // inicializamos el estado en pendiente siempre al principio


        hotel.AgregarReserva(nuevocodigo,nombre, reservahab, cantidadnoches, estado, fechaingreso);
        System.out.println("Reserva R00" + nuevocodigo + " agregada exitosamente.");    
    }
    
    static void MenuConfirmarReserva() throws ReservaNoEncontradaException{ 
        String codigoreserva;
        while (true) {
        System.out.println("Ingrese el codigo de la reserva que usted desea confirmar. ");
        codigoreserva = sc.nextLine().trim();
        if (codigoreserva.isEmpty() || codigoreserva == null) {
            System.out.println("Error: el codigo de la reserva no puede estar vacio.");
            continue;
        }break;            
        }
        hotel.confirmarReseva(codigoreserva);
        System.out.println("Reserva R00" + codigoreserva + " confirmada exitosamente.");
    }

    static void MenuHacerCheckIn() throws ReservaNoEncontradaException{
        String codigoreserva;
        while (true) {
            System.out.println("Ingrese el codigo de la reserva que va a realizar el check in.");
            codigoreserva = sc.nextLine().trim();
            if (codigoreserva.isEmpty() || codigoreserva == null) {
                System.out.println("Error: el codigo de la reserva no puede estar vacio.");
                continue;
            }break;
        }
        hotel.hacerCheckIn(codigoreserva);
        System.out.println("Check in realizado para R00" + codigoreserva);
    }

    static void MenuHacerCheckOut() throws ReservaNoEncontradaException{
        String codigoreserva;
        while (true) {
            System.out.println("Ingrese el codigo de la reserva que va a realizar el check out.");
            codigoreserva = sc.nextLine().trim();
            if (codigoreserva.isEmpty() || codigoreserva == null) {
                System.out.println("Error: el codigo de la reserva no puede estar vacio.");
                continue;
            }break;
        }
        hotel.hacerCheckOut(codigoreserva);
        System.out.println("Check out realizado para R00" + codigoreserva);
    }

    static void MenuBuscarReserva() throws ReservaNoEncontradaException{
        String codigoreserva;
        while (true) {
            System.out.println("Ingrese el codigo de la reserva que desea buscar.");
            codigoreserva = sc.nextLine().trim();
            if (codigoreserva.isEmpty() || codigoreserva == null) {
                System.out.println("Error: el codigo de la reserva no puede estar vacio.");
                continue;
            }break;
        }
        hotel.buscarReservaPorCodigo(codigoreserva);
    }

    static void MenuCancelarReserva() throws ReservaNoEncontradaException{
        String codigoreserva;
        while (true) {
            System.out.println("Ingrese el codigo de la reserva que desea cancelar.");
            codigoreserva = sc.nextLine().trim();
            if (codigoreserva.isEmpty() || codigoreserva == null) {
                System.out.println("Error: el codigo de la reserva no puede estar vacio.");
                continue;
            }break;
        }
        hotel.cancelarReserva(codigoreserva);
        System.out.println("Reserva R00" + codigoreserva + " cancelada exitosamente.");
    }

    static void MenuBuscarPorEstado() throws ReservaNoEncontradaException{
        String opstr;
        int op;
        EstadoReserva estado = null;
        while (true) {
            System.out.println("Ingrese el estado por el cual desea filtrar:");
            System.out.println("1: Pendiente.");
            System.out.println("2: Confirmada.");
            System.out.println("3: Check in.");
            System.out.println("4: Check out.");
            System.out.println("5: Cancelada.");
            opstr = sc.nextLine().trim();
            if (opstr.isEmpty() || opstr == null) {
                System.out.println("Error: Debe ingresar una opcion.");
                continue;
            }
            op = Integer.parseInt(opstr);
            if (op > 5 || op < 1) {
                System.out.println("Error: Debe elegir un numero entre el 1 y el 5.");
                continue;
            }
            switch (op) {
                case 1:
                    estado = EstadoReserva.PENDIENTE;
                    break;
                case 2:
                    estado = EstadoReserva.CONFIRMADA;
                    break;
                case 3:
                    estado = EstadoReserva.CHECK_IN;
                    break;
                case 4:
                    estado = EstadoReserva.CHECK_OUT;
                    break;
                case 5:
                    estado = EstadoReserva.CANCELADA;
                    break;
                default:
                    break;
            }
            if (estado == null) {
              System.out.println("Error: debe elegir una opcion entre 1 y 5.");  
              continue;
            }
            break;
        }
        hotel.ObtenerReservaPorEstado(estado);
    }
 
    }


    




