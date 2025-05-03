package com.pcgestion;

import java.util.Date;

/**
 * Representa un pedido realizado por un cliente.
 */
public class Pedido {
    private int id;
    private Date fecha;
    private String estado;

    /**
     * Confirma el pedido.
     */
    public void confirmar() {
        this.estado = "Confirmado";
    }

    /**
     * Cancela el pedido.
     */
    public void cancelar() {
        this.estado = "Cancelado";
    }
}
