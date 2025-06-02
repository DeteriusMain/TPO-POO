import java.util.List;

public class Proveedor {

    String nombre;
    int id;
    List<Presupuesto> presupuestoOfrecido;
    List<OrdenDeCompra> ordenRecibida;


    public static class solicitarReabastecimiento(Producto producto, int cantidad) {

    }

    public Proveedor(String nombre, int id, List<Presupuesto> presupuestoOfrecido, List<OrdenDeCompra> ordenRecibida) {
        this.nombre = nombre;
        this.id = id;
        this.presupuestoOfrecido = presupuestoOfrecido;
        this.ordenRecibida = ordenRecibida;
    }
}
