package com.pcgestion;

/**
 * Representa una solicitud de reparación de un producto.
 */
public class Reparacion {
    private int id;
    private String descripcion;
    private String estado;
    private boolean recogidaDomicilio;

    public Reparacion(String descripcion, boolean recogidaDomicilio) {
        this.descripcion = descripcion;
        this.recogidaDomicilio = recogidaDomicilio;
        this.estado = "Pendiente"; // o el estado inicial que quieras
    }

    /**
     * Asigna un técnico a la reparación.
     */
    public void asignarTecnico() {
        this.estado = "Asignada";
    }

    /**
     * Finaliza la reparación.
     */
    public void finalizar() {
        this.estado = "Finalizada";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
