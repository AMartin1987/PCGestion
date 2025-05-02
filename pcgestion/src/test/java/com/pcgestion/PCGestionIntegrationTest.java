package com.pcgestion;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PCGestionIntegrationTest {

    @Test
    public void testFlujoDeReparacionClienteTecnico() {
        // Crear cliente real
        Cliente cliente = new Cliente("Ana Torres", "ana@correo.com", "Av. Siempre Viva 742");

        // Usar un mock de Reparacion
        Reparacion reparacionMock = mock(Reparacion.class);
        when(reparacionMock.getDescripcion()).thenReturn("Pantalla rota");

        // Simular contratación de reparación
        cliente.contratarReparacion(reparacionMock);

        // Verificar que se llamó al método getDescripcion()
        verify(reparacionMock).getDescripcion();

        // Crear técnico real
        Tecnico tecnico = new Tecnico("Pedro Gómez", "pedro@correo.com", "Zona Norte");

        // Simular aceptación de reparación
        tecnico.aceptarTarea(reparacionMock);
        tecnico.informarEstado(reparacionMock);

        // Verificar que se llamó a setEstado("Aceptada") en la reparación
        verify(reparacionMock).setEstado("Aceptada");

        // Verificar que se llamó a getEstado() al informar estado
        verify(reparacionMock).getEstado();
    }
}

