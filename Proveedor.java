import java.util.List;
import java.time.LocalDate;

public class Proveedor {

    String nombre;
    int id;
    List<Presupuesto> presupuestoOfrecido;
    List<OrdenDeCompra> ordenRecibida;

    public static PedidoReabastecimiento solicitarReabastecimiento(Producto producto, int cantidad) {
        // Lógica para generar una solicitud de reabastecimiento
        return new PedidoReabastecimiento(cantidad, new EstadoPedido(false), LocalDate.now(), 0, producto, null);
    }

    // Constructor
    public Proveedor(String nombre, int id, List<Presupuesto> presupuestoOfrecido, List<OrdenDeCompra> ordenRecibida) {
        this.nombre = nombre;
        this.id = id;
        this.presupuestoOfrecido = presupuestoOfrecido;
        this.ordenRecibida = ordenRecibida;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Presupuesto> getPresupuestoOfrecido() {
        return presupuestoOfrecido;
    }

    public void setPresupuestoOfrecido(List<Presupuesto> presupuestoOfrecido) {
        this.presupuestoOfrecido = presupuestoOfrecido;
    }

    public List<OrdenDeCompra> getOrdenRecibida() {
        return ordenRecibida;
    }

    public void setOrdenRecibida(List<OrdenDeCompra> ordenRecibida) {
        this.ordenRecibida = ordenRecibida;
    }
}
