import java.time.LocalDate;

public class PedidoReabastecimiento {
    // Clases de Pedido
    public int id;
    public Producto producto;
    public Proveedor proveedor;
    public int cantidad;
    public LocalDate fecha;
    public EstadoPedido estado;

    // Constructors
    public PedidoReabastecimiento(int cantidad, EstadoPedido estado, LocalDate fecha, int id, Producto producto, Proveedor proveedor) {
        this.cantidad = cantidad;
        this.estado = estado;
        this.fecha = fecha;
        this.id = id;
        this.producto = producto;
        this.proveedor = proveedor;
    }

    // Getters and Setters

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Metodos
    public void actualizarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

}
