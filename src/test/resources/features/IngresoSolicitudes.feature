@IngresoSolicitudes
Feature: Home
  
  # (datos incompletos) Cuales son los datos obligatorios ??
  @ingresarSolicitudObrasNuevasDatosIncompletos
  Scenario Outline: Ingresar Solicitud Obras Nuevas Datos Incompletos
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
  Scenario Outline: Ingresar Solicitud Obras Nuevas
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
	And Seleccionar en combobox Actividad: "Obras Nuevas-Tienda Nueva Obra Gruesa+ Habilitación  P1"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "21 - CO CANTAGALLO"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Ingresar Tipo Prototipo "1"
	And Adjuntar Archivo Mecanica de Suelo 
	And Adjuntar Archivo KMZ
	And Adjuntar Archivo Fotografia Terreno
	And Adjuntar Archivo Plano Topografico
	And Adjuntar Plano Municipal
	And Adjuntar Informes Previas
	And Presionar Boton Enviar
	And Validar mensaje en popup "El Numero de la solicitud es"
	And Presionar boton ok en popup

    Examples: ingresarSolicitudObrasNuevas
      | Usuario   | Contrasena | Rol      | 
      | rmaturana | sodimac123 | Regional |

  @ingresarSolicitudSinDatosObligatorios
  Scenario Outline: Ingresar Solicitud Sin Datos Obligatorios Planos-Planos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	And El usuario ve la opcion "Solicitudes" en el Menu del lado izquierdo de la pantalla
 	And Ir a Menu "Solicitudes" y submenu "Ingreso de Solicitudes"
	Then Seleccionar en combobox Tipo Solicitud: "VISITAS, DOCUMENTOS & PLANOS"
	And Seleccionar en combobox Actividad: "Planos-Planos"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "60 - CO VALLENAR"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Presionar Boton Enviar

    Examples: ingresarSolicitudObrasNuevas
      | Usuario | Contrasena | Rol      | 
      | ecueto  | sodimac123 | Regional |
      
  @ingresarSolicitudPLanosPLanos
  Scenario Outline: Ingresar Solicitud PLanos PLanos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	And El usuario ve la opcion "Solicitudes" en el Menu del lado izquierdo de la pantalla
 	And Ir a Menu "Solicitudes" y submenu "Ingreso de Solicitudes"
	Then Seleccionar en combobox Tipo Solicitud: "VISITAS, DOCUMENTOS & PLANOS"
	And Seleccionar en combobox Actividad: "Planos-Planos"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "21 - CO CANTAGALLO"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Presionar Boton Enviar
	And Validar mensaje en popup "El Numero de la solicitud es"
	And Presionar boton ok en popup

    Examples: ingresarSolicitudObrasNuevas
      | Usuario   | Contrasena | Rol      | 
      | rmaturana | sodimac123 | Regional |
      
  @ingresarSolicitudRemodelacionesConCambioSup
  Scenario Outline: Ingresar Solicitud Remodelaciones-Remodelacion con cambio de Superficie  
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
	And Seleccionar en combobox Actividad: "Remodelaciones-Remodelación Con Cambio de Superficie"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "21 - CO CANTAGALLO"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Adjuntar Archivo Mecanica de Suelo 
	And Adjuntar Archivo KMZ
	And Adjuntar Archivo Fotografia Terreno
	And Adjuntar Archivo Plano Topografico
	And Adjuntar Plano Municipal
	And Adjuntar Informes Previas
	And Presionar Boton Enviar
	And Validar mensaje en popup "El Numero de la solicitud es"
	And Presionar boton ok en popup

    Examples: ingresarSolicitudObrasNuevas
      | Usuario   | Contrasena | Rol      | 
      | rmaturana | sodimac123 | Regional |
     # | ycastaneda | sodimac123 | Planificación |
     
  @ingresarSolicitudInstalaciones
  Scenario Outline: Ingresar Solicitud Instalaciones-Instalaciones Sanitarias Mesas de Jardin
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
	And Seleccionar en combobox Actividad: "Instalaciones-Instalaciones Sanitarias Mesas de Jardin"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "74 - SHC EL BOSQUE"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	# FALTA EL INGRESO UBICACION
	# FALTA EL INGRESO TERRENO
	And Presionar Boton Enviar
	And Validar mensaje en popup "El Numero de la solicitud es"
	And Presionar boton ok en popup

    Examples: ingresarSolicitudObrasNuevas
      | Usuario  | Contrasena | Rol      | 
      | mgajardo | sodimac123 | Regional |

      
  @ingresarSolicitudRemodelacionesObrasCiviles
  Scenario Outline: Ingresar Solicitud Remodelaciones-Obras Civiles Mayores 500m2
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
	And Seleccionar en combobox Actividad: "Instalaciones-Instalaciones Sanitarias Mesas de Jardin"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "730 - SHC CORONEL"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	# FALTA 10.- Adjuntar Foto
	# FALTA 12.- Detallar Necesidad
	# FALTA 13 .- Descripcion Detallada
	And Presionar Boton Enviar
	And Validar mensaje en popup "El Numero de la solicitud es"
	And Presionar boton ok en popup

    Examples: ingresarSolicitudObrasNuevas
      | Usuario | Contrasena | Rol      | 
      | mruiz   | sodimac123 | Regional |

  @ingresarSolicitudReduccions
  Scenario Outline: Ingresar Solicitud de Reduccion
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	# PENDIENTE TODO EL CASO

    Examples: ingresarSolicitudObrasNuevas
      | Usuario  | Contrasena | Rol                    | 
      | cwaidele | sodimac123 | Subgerencia Desarrollo |
 
   @ingresarSolicitudEmergencia
  Scenario Outline: Ingresar Solicitud de Emergencia con usuario Gerente
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    When Presionar icono Hamburguesa
    Then El usuario ve su rol "<Rol>"
 	And El usuario ve la opcion "Sol.Proyectos Chile" en el Menu del lado izquierdo de la pantalla
 	And Ir a Menu "Sol.Proyectos Chile" y submenu "Ingreso de Solicitudes"
	Then Seleccionar en combobox Tipo Solicitud: "Emergencia"
	And Seleccionar en combobox Actividad: "Emergencia"
	And Validar formulario de Actividades
	And Validar que el campo empresa por defecto tenga el valor "Sodimac"
	And Seleccionar una Tienda en combobox "Sucursal Renca"
	And Validar campo Centro de Costo
	And Ingresar Descripcion de la Solicitud "Descripcion de la solicitud"
	And Presionar Boton Enviar

    Examples: ingresarSolicitudObrasNuevas
      | Usuario | Contrasena | Rol      | 
      | iroman  | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |