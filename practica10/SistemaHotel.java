import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class SistemaHotel {
    HashMap<String, Reserva> Reservas = new HashMap<>();
    HashMap<Integer, String> Habitaciones_ocupadas = new HashMap<>();
    

    private static final int TOTAL_HABITACIONES = 50;
       


    public SistemaHotel(){};


    public void AgregarReserva(String codigoreserva, String nombrehuesped, int numerohabitaciones, int cantidadnoches, EstadoReserva estado, LocalDate fechaingreso){  //reviso que no haya una habitacion con el mismo numero ocupada, si no cambio los valores
        Reserva reserva1 = new Reserva(codigoreserva,nombrehuesped, numerohabitaciones, cantidadnoches, estado, fechaingreso);
        if (Habitaciones_ocupadas.containsKey(reserva1.getNumeroHab())) {
            throw new IllegalStateException("La habitacion " + reserva1.getNumeroHab() + " ya esta ocupada:");
            
        }
            
            Reservas.put(reserva1.getCodigoReserva().trim(), reserva1);
            Habitaciones_ocupadas.put(reserva1.getNumeroHab(), reserva1.getCodigoReserva());


   } 

   public void confirmarReseva(String codigoReserva) throws ReservaNoEncontradaException{ //busco la clave en reserva, si esta la confirmo

    Reserva nuevareserva = new Reserva();
    if(!Reservas.containsKey(codigoReserva)){
        throw new ReservaNoEncontradaException("Error no se puedo encontrar su reserva.");   
    }
        Habitaciones_ocupadas.put(nuevareserva.getNumeroHab(), nuevareserva.getCodigoReserva());
        nuevareserva.setEstado(EstadoReserva.CONFIRMADA); 
   }

   public void hacerCheckIn(String codigoReserva) throws ReservaNoEncontradaException{ //hago el checkin
    if (!Reservas.containsKey(codigoReserva)) {
        throw new ReservaNoEncontradaException("Error no se puedo encontrar su reserva.");   

    }
       Reserva nuevareserva = new Reserva();
       nuevareserva.setEstado(EstadoReserva.CHECK_IN);
   }

   public void hacerCheckOut(String codigoReserva) throws ReservaNoEncontradaException{ // hago el checkout y remuevo del hashmap
    if (!Reservas.containsKey(codigoReserva)) {
        throw new ReservaNoEncontradaException("Error no se puedo encontrar su reserva.");  
    } 
    Reserva nuevareserva = new Reserva();
    nuevareserva.setEstado(EstadoReserva.CHECK_OUT);
    Habitaciones_ocupadas.remove(nuevareserva.getNumeroHab());
   }

   public void cancelarReserva(String codigoReserva) throws ReservaNoEncontradaException{ //busco la reserva por codigo y la cancelo
    if (!Reservas.containsKey(codigoReserva)) {
        throw new ReservaNoEncontradaException("Error no se puedo encontrar su reserva.");  
    } 
    Reserva nuevareserva = new Reserva();
    nuevareserva.setEstado(EstadoReserva.CANCELADA);
    Habitaciones_ocupadas.remove(nuevareserva.getNumeroHab());
   }

   public void buscarReservaPorCodigo(String codigoReserva) throws ReservaNoEncontradaException{ //buscadof de reservas por codigos
    if (!Reservas.containsKey(codigoReserva)) {
        throw new ReservaNoEncontradaException("Error no se puedo encontrar su reserva.");  
    } 

    
    if (Reservas.containsKey(codigoReserva)) {
        System.out.println(Reservas.values());  
    }
   }

   public void ObtenerReservaPorEstado(EstadoReserva estado){  //filtra las reservas por estado
    ArrayList <Reserva> reservaestado = new ArrayList<>();
    for (Reserva reserva1 : Reservas.values()) {
        if (reserva1.getEstado() == estado) {
          reservaestado.add(reserva1);
        }
    }
    System.out.println("Reservas en estado: " + estado + ":");
    for (Reserva reserva : reservaestado) {
        System.out.println(reserva.toString());
    }
   }

   public String generarReporteOcupacion(){
    return "Total reservas: " + Reservas.size() + "\n Habitaciones ocupadas: " + Habitaciones_ocupadas.size() + "\n Ocupacion: " + Habitaciones_ocupadas.size()/TOTAL_HABITACIONES + "%";

   }
   }

