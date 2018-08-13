@MesasDeTrabajo
Feature: Mesas de trabajo

  @validarMesasTrabajoRolGerente
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Gerente
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"
    And En "Mesas de Trabajo" se ve el submenu "Crear M.T"

    Examples: validarMesasTrabajoRolGerente
      | Usuario | Contrasena | Rol                                               |
      | iroman  | sodimac123 | Gerencia de Planificacion, Desarrollo y Proyectos |

  @validarMesasTrabajoRolSubGerencia
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Subgerencia
    con Rol Subgerente Arquitectura/Licitacion y Compras/Obras Nuevas/Remodelacion y Replica
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"
    And En "Mesas de Trabajo" se ve el submenu "Crear M.T"

    Examples: validarMesasTrabajoRolSubGerencia
      | Usuario    | Contrasena | Rol                                 |
      | mdelrio    | sodimac123 | Subgerencia Arquitectura            |
      | ayevenes   | sodimac123 | Subgerencia Lic. y Compras          |
      | msilva     | sodimac123 | Subgerencia Remodelacion y Réplicas |
      | cinostroza | sodimac123 | Subgerencia Obras Nuevas            |

  @validarMesasTrabajoRolJefeArea
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Jefe de Area
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"
    And En "Mesas de Trabajo" se ve el submenu "Crear M.T"

    Examples: validarMesasTrabajoRolJefeArea
      | Usuario  | Contrasena | Rol                      |
      | rurrutia | sodimac123 | Subgerencia Obras Nuevas |

  @validarMesasTrabajoRolJefeProyecto
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Jefe de proyecto
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"

    Examples: validarMesasTrabajoRolJefeProyecto
      | Usuario | Contrasena | Rol                      |
      | cloader | sodimac123 | Subgerencia Arquitectura |

  @validarNoExistaMesasTrabajoRolSolicitante
  Scenario Outline: Validar que NO exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Solicitante
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario no ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla

    Examples: validarNoExistaMesasTrabajoRolSolicitante
      | Usuario | Contrasena | Rol      |
      | ecueto  | sodimac123 | Regional |

  @validarMesasTrabajoRolArquitecto
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Arquitecto
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"

    Examples: validarMesasTrabajoRolArquitecto
      | Usuario | Contrasena | Rol                      |
      | nvalero | sodimac123 | Subgerencia Arquitectura |

  @validarMesasTrabajoRolLayout
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Layout
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"

    Examples: validarMesasTrabajoRolLayout
      | Usuario  | Contrasena | Rol    |
      | gsanchez | sodimac123 | Layout |

  @validarMesasTrabajoRolComprador
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Comprador
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"

    Examples: validarMesasTrabajoRolComprador
      | Usuario   | Contrasena | Rol                        |
      | cfigueroa | sodimac123 | Subgerencia Lic. y Compras |

  @validarMesasTrabajoRolImplementador
  Scenario Outline: Validar que exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Implementador de Replicas
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla
    And En "Mesas de Trabajo" se ve el submenu "Ver M.T"

    Examples: validarMesasTrabajoRolImplementador
      | Usuario | Contrasena | Rol                      |
      | mvidal  | sodimac123 | Implementación & Réplica |

  @validarNoExistaMesasTrabajoRolVisualComercial
  Scenario Outline: Validar que NO exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Visual Comercial
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario no ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla

    Examples: validarNoExistaMesasTrabajoRolVisualComercial
      | Usuario  | Contrasena | Rol              |
      | cdelapaz | sodimac123 | Visual-Comercial |

  @validarNoExistaMesasTrabajoRolSubgerenteDesarrollo
  Scenario Outline: Validar que NO exista Menu Mesas de Trabajo al ingresar al Sistema SGPI con Rol Subgerente Desarrollo
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    And El usuario ve la pagina de Dashboard
    Then Presionar icono Hamburguesa
    And El usuario ve su rol "<Rol>"
    And El usuario no ve la opcion "Mesas de Trabajo" en el Menu del lado izquierdo de la pantalla

    Examples: validarNoExistaMesasTrabajoRolSubgerenteDesarrollo
      | Usuario  | Contrasena | Rol                    |
      | cwaidele | sodimac123 | Subgerencia Desarrollo |
