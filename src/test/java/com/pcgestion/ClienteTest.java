package com.pcgestion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testConstructorYGetters() {
        Cliente cliente = new Cliente("Ana López", "ana@example.com", "Av. Siempre Viva 123");

        assertEquals("Ana López", cliente.getNombre());
        assertEquals("Av. Siempre Viva 123", cliente.getDireccion());
    }

    @Test
    public void testSetDireccion() {
        Cliente cliente = new Cliente("Juan Pérez", "juan@example.com", "Dirección vieja");
        cliente.setDireccion("Dirección nueva");

        assertEquals("Dirección nueva", cliente.getDireccion());
    }

    @Test
    public void testSolicitarDevolucion() {
        Cliente cliente = new Cliente("Pedro", "pedro@example.com", "Calle 1");
        Producto producto = new Producto(1, "Monitor", "Monitor LED", 150.0f, 10);

        cliente.solicitarDevolucion(producto); // solo verifica que se ejecuta sin error
    }

    @Test
    public void testContratarReparacion() {
        Cliente cliente = new Cliente("Laura", "laura@example.com", "Calle 2");
        Reparacion reparacion = new Reparacion("Pantalla rota", true);

        cliente.contratarReparacion(reparacion); // solo verifica que se ejecuta sin error
    }
}

