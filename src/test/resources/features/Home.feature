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
	And En "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg.General de Solicitudes"
	And En "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg.Detalle de Solicitudes"
 	And El usuario ve la opcion "Sol.Arriendo de Espacios" en el Menu del lado izquierdo de la pantalla
 	And En "Sol.Arriendo de Espacios" se ve el submenu "Seguimiento Sol.Recibidas"
 	And El usuario ve la opcion "Sol.Proyectos Chile" en el Menu del lado izquierdo de la pantalla
 	And En "Sol.Proyectos Chile" se ve el submenu "Ingreso de Solicitudes"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Recibidas"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Enviadas"
 	And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
 	And En "Mesas de Trabajo" se ve el submenu "Ver MT"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Reportes" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
 	
    Examples: loginGerentePlanificacionDesarrolloProyectos
      | Usuario | Contrasena | Rol                                               | 
      | iroman  | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |

  @loginGerenteProyectosChile
  Scenario Outline: Inicio de sesión con usuario Gerente de Proyectos Chile
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Dashboard" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Sol.Proyectos Chile" en el Menu del lado izquierdo de la pantalla
 	And En "Sol.Proyectos Chile" se ve el submenu "Ingreso de Solicitudes"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Recibidas"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol. Enviadas"
 	And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
 	And En "Mesas de Trabajo" se ve el submenu "Ver MT"
 	And En "Mesas de Trabajo" se ve el submenu "Crear MT"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Reportes" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
	
	Examples: loginGerenteProyectosChile
      | Usuario   | Contrasena | Rol                         | 
      | jvaliente | sodimac123 | Gerencia de Proyectos Chile |

  @loginSubgerenteDesarrolloPlanificacion
  Scenario Outline: Inicio de sesión con usuario Subgerente Desarrollo Y Planificacion 
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Dashboard" en el Menu del lado izquierdo de la pantalla
	And El usuario ve la opcion "Sol.Desarrollo Inmobiliario" en el Menu del lado izquierdo de la pantalla
	And En "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg.General de Solicitudes"
	And En "Sol.Desarrollo Inmobiliario" se ve el submenu "Seg.Detalle de Solicitudes"
 	And El usuario ve la opcion "Sol.Arriendo de Espacios" en el Menu del lado izquierdo de la pantalla
 	And En "Sol.Arriendo de Espacios" se ve el submenu "Seguimiento Solicitudes Recibidas"
 	And El usuario ve la opcion "Administrar" en el Menu del lado izquierdo de la pantalla
 	And En "Administrar" se ve el submenu "Usuarios"
 	And En "Administrar" se ve el submenu "Roles"
 	And En "Administrar" se ve el submenu "Perfiles"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Reportes" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
	
	Examples: loginSubgerenteDesarrolloPlanificacion
      | Usuario  | Contrasena | Rol                    | 
      | cwaidele | sodimac123 | Subgerencia Desarrollo |

  @loginJefeArea
  Scenario Outline: Inicio de sesión con usuario Jefe de Area
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Dashboard" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Sol.Proyectos Chile" en el Menu del lado izquierdo de la pantalla
 	And En "Sol.Proyectos Chile" se ve el submenu "Ingreso de Solicitudes"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol.Recibidas"
 	And En "Sol.Proyectos Chile" se ve el submenu "Seguimiento Sol.Enviadas"
 	And El usuario ve la opcion "Administrar" en el Menu del lado izquierdo de la pantalla
 	And En "Administrar" se ve el submenu "Usuarios"
 	And En "Administrar" se ve el submenu "Roles"
 	And En "Administrar" se ve el submenu "Perfiles"
 	And En "Administrar" se ve el submenu "Mantenedor Tipo Solicitudes"
 	And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
 	And En "Mesas de Trabajo" se ve el submenu "Ver MT"
 	And En "Mesas de Trabajo" se ve el submenu "Crear MT"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
	
	Examples: loginJefeArea
      | Usuario  | Contrasena | Rol                      | 
      | rurrutia | sodimac123 | Subgerencia Obras Nuevas |
 
  @loginUsuarioSolicitante
  Scenario Outline: Inicio de sesión con usuario Solicitante
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Dashboard" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Solicitudes" en el Menu del lado izquierdo de la pantalla
 	And En "Solicitudes" se ve el submenu "Ingreso de Solicitudes"
 	And En "Solicitudes" se ve el submenu "Seguimiento de Solicitudes"
 	And El usuario ve la opcion "Alertas" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Notificaciones" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Documentos" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "Skype" en el Menu del lado izquierdo de la pantalla
 	And El usuario ve la opcion "WhatsApp" en el Menu del lado izquierdo de la pantalla
	
	Examples: loginUsuarioSolicitante
      | Usuario    | Contrasena | Rol           | 
      | ycastaneda | sodimac123 | Planificación |
 
      