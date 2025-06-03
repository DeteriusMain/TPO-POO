public class Producto {
    public String nombre;
    public int id;
    public Categoria categoria;
    public int cantidadAcumulada;
    public int cantidadMinima;

    public Producto(String nombre, int id, Categoria categoria, int cantidadAcumulada, int cantidadMinima) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        cantidadAcumulada -= cantidad;
        if (cantidadAcumulada < 0) {
            cantidadAcumulada = 0;
        }
    }

    public void AumentarStock(int cantidad) {
        cantidadAcumulada += cantidad;
    }

    public boolean BajoStock() {
        return cantidadAcumulada <= cantidadMinima;
    }
}