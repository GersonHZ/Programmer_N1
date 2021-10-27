package entidades;

public class persona {
    private Integer ncod; //dni
    private String cnombre;
    private String capellido;
    private String ccorreo;

    public persona() {
    }

    public persona(Integer ncod, String cnombre, String capellido, String ccorreo) {
        this.ncod = ncod;
        this.cnombre = cnombre;
        this.capellido = capellido;
        this.ccorreo = ccorreo;
    }

    public Integer getNcod() {
        return ncod;
    }

    public void setNcod(Integer ncod) {
        this.ncod = ncod;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getCapellido() {
        return capellido;
    }

    public void setCapellido(String capellido) {
        this.capellido = capellido;
    }

    public String getCcorreo() {
        return ccorreo;
    }

    public void setCcorreo(String ccorreo) {
        this.ccorreo = ccorreo;
    }
}
