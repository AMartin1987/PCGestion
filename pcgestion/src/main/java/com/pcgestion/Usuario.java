package com.pcgestion;

/**
 * Clase base para representar un usuario del sistema.
 * Puede ser un Cliente, Técnico o Administrador.
 */

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getEmail()
    {
        return email;
    }

    /**
     * Inicia sesión del usuario.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    public boolean iniciarSesion() {
        return false;
    }

    /**
     * Cierra la sesión del usuario.
     */
    public void cerrarSesion() {
    }
}


