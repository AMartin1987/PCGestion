package com.pcgestion;

/**
 * Representa a un técnico encargado de realizar reparaciones.
 * Hereda de Usuario.
 */
public class Tecnico extends Usuario {
    private String zona;

    // Constructor que recibe nombre, email y zona
    public Tecnico(String nombre, String email, String zona) {
        super(nombre, email);
        this.zona = zona;
    }

    // Método para aceptar una reparación
    public void aceptarTarea(Reparacion reparacion) {
        reparacion.setEstado("Aceptada");
    }

    // Método para informar el estado de una reparación
    public void informarEstado(Reparacion reparacion) {
        System.out.println("Estado actual de la reparación: " + reparacion.getEstado());
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}


