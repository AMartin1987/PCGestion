package com.pcgestion;

/**
 * La clase {@code Producto} representa un producto dentro del sistema de gestión PCGestión.
 *
 * <p>Incluye información básica como identificador, nombre, descripción, precio y stock.
 * Permite actualizar el stock disponible del producto.</p>
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * Producto producto = new Producto(1, "Teclado", "Teclado mecánico", 45.99f, 10);
 * producto.actualizarStock(-2);
 * System.out.println(producto.getNombre());
 * }</pre>
 *
 * @author Alejandra Martin
 * @version 1.0
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;

    /**
     * Constructor por defecto. Permite crear un producto sin parámetros.
     */
    public Producto() {
        // Constructor vacío para instanciación flexible
    }

    /**
     * Constructor completo que inicializa todos los atributos del producto.
     *
     * @param id el identificador del producto
     * @param nombre el nombre del producto
     * @param descripcion la descripción del producto
     * @param precio el precio del producto
     * @param stock la cantidad disponible en stock
     */
    public Producto(int id, String nombre, String descripcion, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre el nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Actualiza la cantidad de stock del producto. Si el stock resultante es negativo, se ajusta a 0.
     *
     * @param cantidad la cantidad a sumar (puede ser negativa para restar stock)
     */
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        if (this.stock < 0) {
            this.stock = 0;
        }
    }
}

