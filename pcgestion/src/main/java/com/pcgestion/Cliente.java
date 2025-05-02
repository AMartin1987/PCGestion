package com.pcgestion;

/**
 * La clase {@code Cliente} representa a un cliente de la aplicación PCGestión,
 * el cual hereda de {@link Usuario} y tiene funcionalidades específicas como
 * solicitar devoluciones y contratar reparaciones.
 *
 * <p>Además de los atributos heredados (nombre y email), un cliente tiene una
 * dirección de entrega o contacto.</p>
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * Cliente cliente = new Cliente("Ana", "ana@mail.com", "Calle Falsa 123");
 * cliente.solicitarDevolucion(new Producto("Mouse"));
 * }</pre>
 *
 * @author Alejandra Martin
 * @version 1.0
 */
public class Cliente extends Usuario {

    /**
     * Dirección del cliente. Puede ser utilizada para envíos, contacto o facturación.
     */
    private String direccion;

    /**
     * Crea una nueva instancia de {@code Cliente} con los datos proporcionados.
     *
     * @param nombre el nombre del cliente
     * @param email el correo electrónico del cliente
     * @param direccion la dirección del cliente
     */
    public Cliente(String nombre, String email, String direccion) {
        super(nombre, email);
        this.direccion = direccion;
    }

    /**
     * Obtiene la dirección actual del cliente.
     *
     * @return la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece una nueva dirección para el cliente.
     *
     * @param direccion la nueva dirección del cliente
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Solicita la devolución de un producto.
     *
     * @param producto el producto que se desea devolver
     */
    public void solicitarDevolucion(Producto producto) {
        System.out.println("Devolución solicitada para el producto: " + producto.getNombre());
    }

    /**
     * Contrata una reparación.
     *
     * @param reparacion la reparación que se desea contratar
     */
    public void contratarReparacion(Reparacion reparacion) {
        System.out.println("Reparación contratada: " + reparacion.getDescripcion());
    }
}
