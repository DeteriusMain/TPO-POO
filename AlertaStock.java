import java.util.List;

public class AlertaStock {
    // Atributos de la clase AlertaStock
    public Producto producto;
    public int limiteMin;
    public List<Notificador> notificaciones;

    // Constructors
    public AlertaStock(int limiteMin, List<Notificador> notificaciones, Producto producto) {
        this.limiteMin = limiteMin;
        this.notificaciones = notificaciones;
        this.producto = producto;
    }

    // Getters and Setters

    public int getLimiteMin() {
        return limiteMin;
    }

    public void setLimiteMin(int limiteMin) {
        this.limiteMin = limiteMin;
    }

    public List<Notificador> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificador> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // Metodos
    public void comprobarYNotificar() {
    }
}