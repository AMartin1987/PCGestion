package com.pcgestion;

/**
 * Representa a un administrador del sistema.
 * Tiene la capacidad de autorizar devoluciones.
 */
public class Administrador extends Usuario {

    public Administrador(String nombre, String email) {
        super(nombre, email);
    }

    /**
     * Autoriza una solicitud de devolución.
     * @param devolucion La devolución a autorizar.
     * @return true si se autoriza, false en caso contrario.
     */
    public boolean autorizarDevolucion(Devolucion devolucion) {
        devolucion.setEstado("Autorizada");
        return true;
    }
}

