package com.pcgestion;

public class Main {
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
