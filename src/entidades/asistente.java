package entidades;

public class asistente extends persona {
    private String ctelefono;
    private String cdireccion;
    private entrada entrada;

    public asistente() {
        super();
    }

    public asistente(Integer ncod, String cnombre, String capellido, String ccorreo, String ctelefono, String cdireccion, entidades.entrada entrada) {
        super(ncod, cnombre, capellido, ccorreo);
        this.ctelefono = ctelefono;
        this.cdireccion = cdireccion;
        this.entrada = entrada;
    }

    public String getCtelefono() {
        return ctelefono;
    }

    public void setCtelefono(String ctelefono) {
        this.ctelefono = ctelefono;
    }

    public String getCdireccion() {
        return cdireccion;
    }

    public void setCdireccion(String cdireccion) {
        this.cdireccion = cdireccion;
    }

    public entidades.entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(entidades.entrada entrada) {
        this.entrada = entrada;
    }
}
