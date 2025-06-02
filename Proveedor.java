import java.util.List;

public class Proveedor {

    String nombre;
    int id;
    List<Presupuesto> presupuestoOfrecido;
    List<OrdenDeCompra> ordenRecibida;


    public static class solicitarReabastecimiento(Producto producto, int cantidad) {

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
