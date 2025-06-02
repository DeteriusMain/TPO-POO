public class Categoria {
    // Clases de Categoria
    public int id;
    public String nombre;
    public String descripcion;

    // Constructors
    public Categoria(String descripcion, int id, String nombre) {
        this.descripcion = descripcion;
        this.id = id;
        this.nombre = nombre;
    }

    // Getters and Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public boolean validarCategoria() {
        return false;
    }
}
