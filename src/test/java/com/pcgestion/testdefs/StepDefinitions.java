package com.pcgestion.testdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class StepDefinitions {

    private double precioBase;
    private double precioConIVA;

    @Given("el precio base del componente es {double}")
    public void el_precio_base_del_componente_es(Double base) {
        precioBase = base;
    }

    @When("calculo el precio con IVA")
    public void calculo_el_precio_con_iva() {
        precioConIVA = precioBase * 1.21;
    }

    @Then("el precio total debe ser {double}")
    public void el_precio_total_debe_ser(Double esperado) {
        assertEquals(esperado, precioConIVA, 0.01);
    }
}

