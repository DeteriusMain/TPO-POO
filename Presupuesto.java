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

    public Presupuesto(int id, int preciosUnitarios, LocalDate envio) {
        this.id = id;
        this.preciosUnitarios = preciosUnitarios;
        this.envio = envio;
    }
}
