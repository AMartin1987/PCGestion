package com.pcgestion;

/**
 * Representa una solicitud de devolución de producto.
 */
public class Devolucion {
    private String motivo;
    private String estado;

    /**
     * Solicita la devolución.
     */
    public void solicitar() {
        this.estado = "Solicitada";
    }

    /**
     * Procesa la devolución.
     */
    public void procesar() {
        this.estado = "Procesada";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
