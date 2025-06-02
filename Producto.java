public class Producto {
    public String nombre;
    public int id;
    public categoria Categoria;
    public int cantidadAcumulada;
    public int cantidadMinima;

    public Producto(String nombre, int id, categoria categoria, int cantidadAcumulada, int cantidadMinima) {
        this.nombre = nombre;
        this.id = id;
        Categoria = categoria;
        this.cantidadAcumulada = cantidadAcumulada;
        this.cantidadMinima = cantidadMinima;
    }

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

    public categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(categoria categoria) {
        Categoria = categoria;
    }

    public int getCantidadAcumulada() {
        return cantidadAcumulada;
    }

    public void setCantidadAcumulada(int cantidadAcumulada) {
        this.cantidadAcumulada = cantidadAcumulada;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public void DisminuirStock(int cantidad) {
        cantidadActual -= cantidad;
        if (cantidadActual < 0) {
            cantidadActual = 0;
        }
    }

    public void AumentarStock(int cantidad) {
        cantidadActual += cantidad;
    }

    public boolean BajoStock() {
        return cantidadActual <= cantidadMinima;
    }
}
