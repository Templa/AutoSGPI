@Login
Feature: Login

  @loginUsuarioIncorrecto
  Scenario Outline: Inicio de sesión con datos inválidos, usuario incorrecto
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    Then El sistema muestra el mensaje "<Mensaje>"

    Examples: loginUsuarioIncorrecto
      | Usuario  | Contrasena  | Mensaje                        |
      | iromann  | sodimac123; | Usuario o contraseña no valido |
      | ecuetos  | sodimac123; | Usuario o contraseña no valido |
      | mdelrios | sodimac123  | Usuario o contraseña no valido |

  @loginPassIncorrecta
  Scenario Outline: Inicio de sesión con datos inválidos, contraseña incorrecta
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    Then El sistema muestra el mensaje "<Mensaje>"

    Examples: loginPassIncorrecta
      | Usuario | Contrasena   | Mensaje                        |
      | iroman  | sodimac1234; | Usuario o contraseña no valido |
      | ecueto  | sodimac1234; | Usuario o contraseña no valido |
      | mdelrio | sodimac1234  | Usuario o contraseña no valido |

  @loginSinDatos
  Scenario Outline: Inicio de sesión con datos vacíos
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    Then El sistema muestra el mensaje "<Mensaje>"

    Examples: loginSinDatos
      | Usuario | Contrasena | Mensaje                                 |
      |         |            | Por favor ingresa los datos solicitados |

  @loginSoloUsuario
  Scenario Outline: Inicio de sesión ingresando solo el usuario
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    Then El ingreso al sistema es exitoso
    And El usuario ve el dashboard del portal

    Examples: loginSoloUsuario
      | Usuario | Contrasena | Mensaje                                 |
      | iroman  | ;          | Por favor ingresa los datos solicitados |
      | ecueto  | ;          | Por favor ingresa los datos solicitados |
      | mdelrio |            | Por favor ingresa los datos solicitados |

  @loginSoloPass
  Scenario Outline: Inicio de sesión ingresando solo el password
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar

    Examples: loginSoloPass
      | Usuario | Contrasena   | Mensaje                                 |
      |         | sodimac1234; | Por favor ingresa los datos solicitados |
      |         | sodimac1234; | Por favor ingresa los datos solicitados |
      |         | sodimac1234  | Por favor ingresa los datos solicitados |

  @loginCuentaInactiva
  Scenario Outline:Inicio de sesión con cuenta inactiva
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar

    Examples: loginCuentaInactiva
      | Usuario | Contrasena | Mensaje          |
      | ptapia  | 123        | Usuario Inactivo |
