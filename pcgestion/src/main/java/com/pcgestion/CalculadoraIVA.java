package com.pcgestion;

/**
 * La clase {@code CalculadoraIVA} proporciona una funcionalidad básica para calcular
 * el precio final de un producto incluyendo el IVA (Impuesto al Valor Agregado).
 *
 * <p>Actualmente, el valor del IVA está fijado en 21%.</p>
 *
 * <p>Ejemplo de uso:</p>
 * <pre>{@code
 * CalculadoraIVA calculadora = new CalculadoraIVA();
 * double precioFinal = calculadora.calcularPrecioConIVA(100.0); // Devuelve 121.0
 * }</pre>
 *
 * @author Alejandra Martin
 * @version 1.0
 */
public class CalculadoraIVA {

    /**
     * Porcentaje de IVA aplicado, representado como un valor decimal.
     * En este caso, 21% es equivalente a 0.21.
     */
    private static final double IVA = 0.21;

    /**
     * Calcula el precio total de un producto sumándole el IVA al precio base.
     *
     * @param base el precio base del producto (sin impuestos)
     * @return el precio total incluyendo el IVA
     */
    public double calcularPrecioConIVA(double base) {
        return base * (1 + IVA);
    }
}

