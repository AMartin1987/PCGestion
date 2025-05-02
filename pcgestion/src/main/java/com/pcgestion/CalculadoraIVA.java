package com.pcgestion;

public class CalculadoraIVA {
    private static final double IVA = 0.21;

    public double calcularPrecioConIVA(double base) {
        return base * (1 + IVA);
    }
}
