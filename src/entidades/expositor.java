package entidades;

public class expositor extends persona{
    private Integer nsueldo;

    public expositor(Integer nsueldo) {
        this.nsueldo = nsueldo;
    }

    public expositor(Integer ncod, String cnombre, String capellido, String ccorreo, Integer nsueldo) {
        super(ncod, cnombre, capellido, ccorreo);
        this.nsueldo = nsueldo;
    }

    public Integer getNsueldo() {
        return nsueldo;
    }

    public void setNsueldo(Integer nsueldo) {
        this.nsueldo = nsueldo;
    }
}
