@MesasDeTrabajoDetalle
Feature: Mesas de trabajo detalle

  # TEST Mesas de Trabajo detalle Primer Nivel
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
    
    Examples: ingresarMenuMesasDetallePrimerNivel
      | Usuario    | Contrasena | Rol                                               |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura                          |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas                          |
      | msilva     | sodimac123 | Subgerencia Remodelacion y Réplicas               |
      | ayevenes   | sodimac123 | Subgerencia Lic. y Compras                        |
      | rurrutia   | sodimac123 | Subgerencia Obras Nuevas                          |
      | wwettlin   | sodimac123 | Subgerencia Obras Nuevas                          |


  # TEST Mesas de Trabajo detalle Segundo Nivel
  @ingresarMenuMesasDetalleSegundoNivel
  Scenario Outline: Mesas de Trabajo detalle Segundo Nivel
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And Ir a Menu "Mesas de Trabajo" y submenu "Ver M.T"
    When Hacer Clik en el nombre de la subgerencia area "<Area>"
    Then Se visualizan los tipos de Mesas de Trabajo que tiene el area "<Area>"
    And Se visualiza el numero de Solicitudes para el area "<Area>" sub area "<SubArea>"
    And Se visualiza el numero de Mesas para el area "<Area>" sub area "<SubArea>"
    And Se visualiza para el numero de Tiendas para el area "<Area>" sub area "<SubArea>"
    And Se visualiza KPI de Avance por mesa para el area "<Area>" sub area "<SubArea>"
    And Se visualiza KPI de cumplimiento por mesa para el area "<Area>" sub area "<SubArea>"
    
   Examples: ingresarMenuMesasDetalleSegundoNivel
      | Usuario    | Contrasena | Rol                                               | Area                     | SubArea      |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos | Subgerencia Arquitectura | Construccion |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura                          | Subgerencia Arquitectura | Construccion |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas                          | Subgerencia Arquitectura | Construccion |
      | wwettlin   | sodimac123 | Subgerencia Obras Nuevas                          | Subgerencia Arquitectura | Construccion |
      
  @ingresarMenuMesasDetalleSegundoNivelNombreMesa
  Scenario Outline: Posicionarse en cada nombre de las Mesas de Trabajo que poseen los Tipos de Mesa
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And Ir a Menu "Mesas de Trabajo" y submenu "Ver M.T"
    When Hacer Clik en el nombre de la subgerencia area "<Area>"
    Then Se visualizan los tipos de Mesas de Trabajo que tiene el area "<Area>"
    And Se visualiza el numero de Solicitudes para el area "<Area>" sub area "<SubArea>"
    And Validar el texto "Ver Detalle" en negro para nombre de mesa en el area "<Area>" sub area "<SubArea>"
    
   Examples: ingresarMenuMesasDetalleSegundoNivelNombreMesa
      | Usuario    | Contrasena | Rol                                               | Area                     | SubArea      |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos | Subgerencia Arquitectura | Construccion |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura                          | Subgerencia Arquitectura | Construccion |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas                          | Subgerencia Arquitectura | Construccion |

  @ingresarMenuMesasDetalleTercerNivel
  Scenario Outline: Hacer click en los Nombres de cada una de las mesas de Trabajos que componen una subgerencia en  el sistema 
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And Ir a Menu "Mesas de Trabajo" y submenu "Ver M.T"
    When Hacer Clik en el nombre de la subgerencia area "<Area>"
    Then Se visualizan los tipos de Mesas de Trabajo que tiene el area "<Area>"
    And Se visualiza el numero de Solicitudes para el area "<Area>" sub area "<SubArea>"
    When Presionar sobre el nombre de la primera mesa para el area "<Area>" sub area "<SubArea>"
    Then Se despliega formulario Detalle Mesa
    And Validar seccion superior Nombre Mesa, Area, Tipo
    And Validar seccion superior derecha Num de Solicitudes, KPI Avance, KPI Cumplimiento en Plazo
    And Validar titulo "Integrantes de la Mesa" en la seccion central para integrantes de la mesa
    And Validar contenido seccion central para integreantes de la mesa columnas Nombre, Area, Rol, Avance, Capacidad
	And Validar titulo "Tiendas" en la seccion inferior para las Tiendas Asociadas a la Mesa
	And Validar contenido seccion inferior para las Tiendas Asociadas a la Mesa, columnas Nombre, Solicitudes , Capacidad
	And Validar titulo "Solicitudes Asociadas a la Mesa" en la seccion central derecha para las solicitudes asociadas a la mesa
    And Validar contenido seccion central derecha para las solicitudes asociadas a la mesa, columnas Solicitud , la Sucursal, Solicitante y Estado

   Examples: ingresarMenuMesasDetalleTercerNivel
      | Usuario    | Contrasena | Rol                                               | Area                     | SubArea      |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos | Subgerencia Arquitectura | Construccion |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura                          | Subgerencia Arquitectura | Construccion |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas                          | Subgerencia Arquitectura | Construccion |

  @editarSolicitudesDesdeDetalleTercerNivel
  Scenario Outline: Editar solicitudes desde el Detalle del Tercer Nivel
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And Ir a Menu "Mesas de Trabajo" y submenu "Ver M.T"
    When Hacer Clik en el nombre de la subgerencia area "<Area>"
    Then Se visualizan los tipos de Mesas de Trabajo que tiene el area "<Area>"
    And Se visualiza el numero de Solicitudes para el area "<Area>" sub area "<SubArea>"
    When Presionar sobre el nombre de la primera mesa para el area "<Area>" sub area "<SubArea>"
    Then Se despliega formulario Detalle Mesa
    And Validar titulo "Solicitudes Asociadas a la Mesa" en la seccion central derecha para las solicitudes asociadas a la mesa
    When Presionar sobre la primera solicitud disponible asociada a la mesa
	Then Se despliega la pagina Detalle Proyecto
	
   Examples: ingresarMenuMesasDetalleSegundoNivel
      | Usuario    | Contrasena | Rol                                               | Area                     | SubArea      |
      | iroman     | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos | Subgerencia Arquitectura | Construccion |
      