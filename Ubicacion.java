public class Ubicacion {
    // Clases de Ubicacion
    public int id;
    public String zona;

    // Constructors
    public Ubicacion(int id, String zona) {
        this.id = id;
        this.zona = zona;
    }

    // Getters and Setters
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Metodos
    public String toString() {
        return "";
    };
}
