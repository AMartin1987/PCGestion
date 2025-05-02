package com.pcgestion;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;

    // Constructor con nombre y precio opcional
    public Producto() {
        // Constructor vacío para poder instanciar sin parámetros
    }

    // Constructor completo, si lo necesitas en algún momento
    public Producto(int id, String nombre, String descripcion, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para actualizar el stock
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }
}
