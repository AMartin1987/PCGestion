package com.pcgestion;

public class Cliente extends Usuario {
    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        super(nombre, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void solicitarDevolucion(Producto producto) {
        System.out.println("Devolución solicitada para el producto: " + producto.getNombre());
    }

    public void contratarReparacion(Reparacion reparacion) {
        System.out.println("Reparación contratada: " + reparacion.getDescripcion());
    }


}