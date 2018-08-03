@IngresoSolicitudes
Feature: Home
  
  # (datos incompletos) Cuales son los datos obligatorios ??
  @ingresarSolicitudObrasNuevasDatosIncompletos
  Scenario Outline: Inicio de sesión con usuario Rol Gerente de Planificacion, Desarrollo y Proyectos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	And El usuario ve la opcion "Solicitudes" en el Menu del lado izquierdo de la pantalla
 	And Ir a Menu "Solicitudes" y submenu "Ingreso de Solicitudes"
	Then Seleccionar en combobox Tipo Solicitud: "PROYECTOS"
	And Seleccionar en combobox Actividad: "Obras Nuevas-Tienda Nueva Obra Gruesa+ Habilitación  P2"
	And Seleccionar una Tienda en combobox "21 - CO CANTAGALLO"
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Ingresar Tipo Prototipo "1"
	And Adjuntar Archivo Mecanica de Suelo 
	And Adjuntar Archivo KMZ
	And Adjuntar Archivo Fotografia Terreno
	And Presionar Boton Enviar

    Examples: ingresarSolicitudObrasNuevas
      | Usuario   | Contrasena | Rol      | 
      | rmaturana | sodimac123 | Regional |

  @ingresarSolicitudObrasNuevas
  Scenario Outline: Inicio de sesión con usuario Rol Gerente de Planificacion, Desarrollo y Proyectos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	And El usuario ve la opcion "Solicitudes" en el Menu del lado izquierdo de la pantalla
 	And Ir a Menu "Solicitudes" y submenu "Ingreso de Solicitudes"
	Then Seleccionar en combobox Tipo Solicitud: "PROYECTOS"
	And Seleccionar en combobox Actividad: "Obras Nuevas-Tienda Nueva Obra Gruesa+ Habilitación  P2"
	And Seleccionar una Tienda en combobox "21 - CO CANTAGALLO"
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Ingresar Tipo Prototipo "1"
	And Adjuntar Archivo Mecanica de Suelo 
	And Adjuntar Archivo KMZ
	And Adjuntar Archivo Fotografia Terreno
	And Adjuntar Archivo Plano Topografico
	And Adjuntar Plano Municipal
	And Adjuntar Informes Previas
	And Presionar Boton Enviar

    Examples: ingresarSolicitudObrasNuevas
      | Usuario   | Contrasena | Rol      | 
      | rmaturana | sodimac123 | Regional |
