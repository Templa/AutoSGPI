@MesasDeTrabajoDetalle
Feature: Mesas de trabajo detalle

  # TEST Mesas de Trabajo detalle   Primer Nivel
  @ingresarMenuMesasDetallePrimerNivel
  Scenario Outline: Mesas de Trabajo detalle Primer Nivel
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    Then Ir a Menu "Mesas de Trabajo" y submenu "Ver M.T"
    And Ver todas las areas que tienen parametrizada algun tipo de mesa de trabajo
      | Subgerencia Arquitectura            |
      | Subgerencia Lic. y Compras          |
      | Subgerencia Obras Nuevas            |
      | Subgerencia Remodelacion y Réplicas |
    And Ver numero de solicitud
    And Ver numero de mesas que tiene el area
    And Ver KPI avance
    And Ver KPI cumplimiento
    And Posicionarse sobre la mesa y ver popup "Ver Mesas"
    
    Examples: ingresarMenuMesasTrabajoRolGerente
      | Usuario    | Contrasena | Rol                                               |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura                          |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas                          |
      | msilva     | sodimac123 | Subgerencia Remodelacion y Réplicas               |
      | ayevenes   | sodimac123 | Subgerencia Lic. y Compras                        |
      | rurrutia   | sodimac123 | Subgerencia Obras Nuevas                          |
      | wwettlin   | sodimac123 | Subgerencia Obras Nuevas                          |
