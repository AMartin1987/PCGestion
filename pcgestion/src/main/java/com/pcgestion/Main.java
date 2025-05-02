package com.pcgestion;

/**
 * La clase {@code Main} actúa como punto de entrada de la aplicación PCGestión.
 *
 * <p>Simula un flujo básico de uso de la aplicación: creación de un cliente,
 * un producto y una reparación, con interacción entre cliente y técnico.</p>
 *
 * <p>Ejecuta los siguientes pasos:</p>
 * <ul>
 *   <li>Creación de un cliente</li>
 *   <li>Creación de un producto</li>
 *   <li>Creación de una reparación</li>
 *   <li>El cliente contrata una reparación</li>
 *   <li>Un técnico acepta la tarea e informa el estado</li>
 *   <li>Se finaliza la reparación</li>
 *   <li>Se imprime el estado final de la reparación</li>
 * </ul>
 *
 * <p>Este ejemplo permite verificar la interacción entre objetos de distintas clases.</p>
 *
 * @author Alejandra Martin
 * @version 1.0
 */
public class Main {
    /**
     * Método principal de la aplicación. Ejecuta una simulación de uso de PCGestión.
     *
     * @param args argumentos pasados por consola (no se utilizan)
     */
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@example.com", "Calle Falsa 123");

        // Crear un producto con datos
        Producto producto = new Producto(1, "Teléfono móvil", "Smartphone de última generación", 299.99f, 10);

        // Crear una reparación
        Reparacion reparacion = new Reparacion("Pantalla rota", true);

        // Cliente contrata la reparación
        cliente.contratarReparacion(reparacion);

        // Crear un técnico con datos
        Tecnico tecnico = new Tecnico("María", "maria@tecnicos.com", "Carolinas Altas");

        // Técnico acepta la tarea e informa estado
        tecnico.aceptarTarea(reparacion);
        tecnico.informarEstado(reparacion);

        // Finalizar la reparación
        reparacion.finalizar();
        tecnico.informarEstado(reparacion);

        // Mostrar resultado final
        System.out.println("Reparación: " + reparacion.getDescripcion());
        System.out.println("Estado final de la reparación: " + reparacion.getEstado());
    }
}
