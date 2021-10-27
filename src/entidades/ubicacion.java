package entidades;

public class ubicacion {
    private Integer id;
    private String ccod;
    private String cdesc;
    private Double ncosto;

    public ubicacion(Integer id, String ccod, String cdesc, Double ncosto) {
        this.id = id;
        this.ccod = ccod;
        this.cdesc = cdesc;
        this.ncosto = ncosto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCcod() {
        return ccod;
    }

    public void setCcod(String ccod) {
        this.ccod = ccod;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public Double getNcosto() {
        return ncosto;
    }

    public void setNcosto(Double ncosto) {
        this.ncosto = ncosto;
    }
}
