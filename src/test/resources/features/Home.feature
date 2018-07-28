@Home
Feature: Home

  @loginGerentePlanificacionDesarrolloProyectos
  Scenario Outline: Inicio de sesión con usuario Rol Gerente de Planificacion, Desarrollo y Proyectos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Dashboard" en el Menu del lado izquierdo de la pantalla
	And El usuario ve la opcion "Sol.Desarrollo Inmobiliario" en el Menu del lado izquierdo de la pantalla
	And En la opcion "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg. General de Solicitudes"
	And En la opcion "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg.Detalle de Solicitudes"
 	And El usuario ve la opcion "Sol.Arriendo de Espacios" en el Menu del lado izquierdo de la pantalla
 	And En la opcion "Sol.Arriendo de Espacios" se ve el submenu "Seguimiento Sol. Enviadas"
 	And El usuario ve la opcion "Sol.Proyectos Chile" en el Menu del lado izquierdo de la pantalla
 	And En la opcion "Sol.Proyectos Chile" se ve el submenu "Ingreso de Solicitudes"
 	And En la opcion "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Recibidas"
 	And En la opcion "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Enviadas"
 	And El usuario ve la opcion "Administrar" en el Menu del lado izquierdo de la pantalla
 	And En la opcion "Administrar" se ve el submenu "Usuarios"
 	And En la opcion "Administrar" se ve el submenu "Roles"
 	And En la opcion "Administrar" se ve el submenu "Perfiles"
 	And En la opcion "Administrar" se ve el submenu "Mantenedor Tipo Solicitudes"
 	And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
 	And En la opcion "Mesas de Trabajo" se ve el submenu "Ver M.T"
 	And En la opcion "Mesas de Trabajo" se ve el submenu "Crear M.T"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Reportes" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
 	
    Examples: loginGerentePlanificacionDesarrolloProyectos
      | Usuario | Contrasena | Rol                                               | 
      | iroman  | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |
