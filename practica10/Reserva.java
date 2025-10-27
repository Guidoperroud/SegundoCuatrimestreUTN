import java.time.LocalDate;

public class Reserva {
    String codigoreserva;
    String nombrehuesped;
    int numerohabitaciones;
    int cantidadnoches;
    EstadoReserva estado; 
    LocalDate fechaingreso;

    public Reserva (){};
    public Reserva(String codigoreserva, String nombrehuesped, int numerohabitaciones, int cantidadnoches, EstadoReserva estado, LocalDate fechaingreso){
      this.nombrehuesped = nombrehuesped;
      this.codigoreserva = codigoreserva;
      this.numerohabitaciones = numerohabitaciones;
      this.cantidadnoches = cantidadnoches;
      this.estado = EstadoReserva.PENDIENTE;
      this.fechaingreso = LocalDate.now();
    }


    public void setEstado(EstadoReserva estado){ //getters y setters
        this.estado = estado;
    }

    public String getCodigoReserva(){
        return codigoreserva;
    }

    public String getNombreHuesped(){
        return nombrehuesped;
    }

    public int getNumeroHab(){
        return numerohabitaciones;
    }

    public int getCantnoches(){
        return cantidadnoches;
    }

    public EstadoReserva getEstado(){
        return estado;
    }

    public LocalDate getFechaing(){
        return fechaingreso;
    }

    public String toString(){ // to string
        return "Codigo: " + codigoreserva + " | Huesped: " + nombrehuesped + " | Habitacion: " + numerohabitaciones + " | Noches: " + cantidadnoches + " | Estado: " + estado;
    }


}
