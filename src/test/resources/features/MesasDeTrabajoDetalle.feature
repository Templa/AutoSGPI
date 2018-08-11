@MesasDeTrabajoDetalle
Feature: Mesas de trabajo detalle

  @ingresarMenuMesasTrabajoRolGerente
  Scenario Outline: Ingresar al menu Mesas de Trabajo con Rol Gerente
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
    And Ver numero de solicitud
    And Ver numero de mesas que tiene el area
    And Ver KPI avance
    And Ver KPI cumplimiento
    And Posicionarse sobre la mesa y ver popup "Ver Mesas"
    
    Examples: ingresarMenuMesasTrabajoRolGerente
      | Usuario | Contrasena | Rol                                               |
      | iroman  | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |
