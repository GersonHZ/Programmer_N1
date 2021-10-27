package entidades;

import util.MisConstantes;

public class entrada {
    private Integer id;
    private Double costo;
    private evento idEvento;
    private ubicacion idUbicacion;

    public entrada(Integer id, Double costo, evento idEvento, ubicacion idUbicacion) {
        this.id = id;
        this.idEvento = idEvento;
        this.costo = costo;
        this.idUbicacion = idUbicacion;
        calcularCosto();
        calcularDescuento();
    }

    /**
     * Calcula el costo inicial en base al igv
     */
    public void calcularCosto() {
        this.costo = costo + costo * MisConstantes.igv;
    }

    /**
     * Genera descuento en base a la cantidad de entradas generadas, asi se indentifica si es temporada alta o baja
     */
    public void calcularDescuento() {
        if (this.id > 1000) {
            this.costo = costo * 0.95;
        } else {
            this.costo = costo * 0.90;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(evento idEvento) {
        this.idEvento = idEvento;
    }

    public ubicacion getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(ubicacion idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
