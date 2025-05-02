Feature: Calcular precio con IVA

  Scenario: Calcular el precio total con un IVA del 21%
    Given el precio base del componente es 100.0
    When calculo el precio con IVA
    Then el precio total debe ser 121.0
