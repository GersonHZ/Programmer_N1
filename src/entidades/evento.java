package entidades;

import java.util.Date;

public class evento {
    private Integer id;
    private String ctitulo;
    private Double nduracion;
    private Integer idExp; //id expositor
    private String dhoraing;
    private String dhorasal;
    private Double ntemp;
    private Integer idEmp; //id empresa

    private static Integer ncount = 0;

    public evento(Integer id, String ctitulo, Double nduracion, Integer idExp, String dhoraing, String dhorasal, Double ntemp, Integer idEmp) {
        setId(this.ncount++);
        this.ctitulo = ctitulo;
        this.nduracion = nduracion;
        this.idExp = idExp;
        this.dhoraing = dhoraing;
        this.dhorasal = dhorasal;
        this.ntemp = ntemp;
        this.idEmp = idEmp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCtitulo() {
        return ctitulo;
    }

    public void setCtitulo(String ctitulo) {
        this.ctitulo = ctitulo;
    }

    public Double getNduracion() {
        return nduracion;
    }

    public void setNduracion(Double nduracion) {
        this.nduracion = nduracion;
    }

    public Integer getIdExp() {
        return idExp;
    }

    public void setIdExp(Integer idExp) {
        this.idExp = idExp;
    }

    public String getDhoraing() {
        return dhoraing;
    }

    public void setDhoraing(String dhoraing) {
        this.dhoraing = dhoraing;
    }

    public String getDhorasal() {
        return dhorasal;
    }

    public void setDhorasal(String dhorasal) {
        this.dhorasal = dhorasal;
    }

    public Double getNtemp() {
        return ntemp;
    }

    public void setNtemp(Double ntemp) {
        this.ntemp = ntemp;
    }

    public Integer getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Integer idEmp) {
        this.idEmp = idEmp;
    }
}
