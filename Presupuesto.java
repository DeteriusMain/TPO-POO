import java.time.LocalDate;

public class Presupuesto {
    int id;
    // Proveedor proveedor;
    int preciosUnitarios;
    LocalDate envio;


    public void aceptar() {
    }
    public void rechazar() {
    }
    public double calcularTotal() {
        return 0;
    }

    // Constructor
    public Presupuesto(int id, int preciosUnitarios, LocalDate envio) {
        this.id = id;
        this.preciosUnitarios = preciosUnitarios;
        this.envio = envio;
    }

    // Getters y setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPreciosUnitarios() {
        return preciosUnitarios;
    }
    public void setPreciosUnitarios(int preciosUnitarios) {
        this.preciosUnitarios = preciosUnitarios;
    }
    public LocalDate getEnvio() {
        return envio;
    }
    public void setEnvio(LocalDate envio) {
        this.envio = envio;
    }
}
