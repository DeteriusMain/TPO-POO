import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class OrdenDeCompra {
    // Clases de OrdenDeCompra
    public int id;
    public Proveedor proveedor;
    public List<Producto> productos;
    public LocalDate fechaEmision;
    public boolean aprobada;


    // Constructors
    public OrdenDeCompra(int id, List<Producto> productos, Proveedor proveedor) {
        this.id = id;
        this.productos = productos;
        this.proveedor = proveedor;
        this.fechaEmision = LocalDate.now();
        this.aprobada = false;
    }

    // Getters and Setters
    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Metodos
    public void agregarProducto(Prodcuto prodcutos, int cantidad){
        productos.add(producto);
    }
    public void aprobar() {
        this.aprobada = true;
    }
    public void rechazar(){
        this.aprobada = false;
    }
    public String resumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrdenDeCompra ID: ").append(id).append("\n");
        sb.append("Proveedor: ").append(proveedor.getNombre()).append("\n");
        sb.append("Fecha Emisión: ").append(fechaEmision).append("\n");
        sb.append("Productos:\n");
        for (Producto p : productos) {
            sb.append("- ").append(p.getNombre()).append("\n");
        }
        sb.append("Aprobada: ").append(aprobada ? "Sí" : "No").append("\n");
        return sb.toString();
    }

}

