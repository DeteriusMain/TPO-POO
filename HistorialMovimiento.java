import java.LocalDateTime;

public class HistorialMovimiento {
    // Atributos de la clase Historial Movimiento
    public int id;
    public Producto producto;
    public int cantidad;
    public LocalDateTime fecha;
    public String realizaPor;

    // Contructors
    public HistorialMovimiento(int id, Producto producto, int cantidad, LocalDateTime fecha, String realizaPor) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.realizaPor = realizaPor;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getRealizaPor() {
        return realizaPor;
    }

    public void setRealizaPor(String realizaPor) {
        this.realizaPor = realizaPor;
    }


    // Metodo de la clase
    public String resumen(){
        return "Resumen";
    }
}
