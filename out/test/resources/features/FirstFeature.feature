Feature: Verificar Google home

  Scenario: Verificar si el campo Busqueda esta visible
    Given Google page is loaded
    And browser maximized
    Then the "Search" field is visible

    Scenario: Verificar que el boton "Buscar" esta visible

    Scenario: Verificar resultados de busqueda