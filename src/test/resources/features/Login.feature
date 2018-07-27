@login
Feature: Login

  @loginUsuarioIncorrecto
  Scenario Outline: Inicio de sesión con datos inválidos, usuario incorrecto
    Given Ingresar en el Portal SGPI
    When Ingresar Usuario "<Usuario>"
    And Ingresar Password "<Contrasena>"
    And Presionar Ingresar
    Then El sistema muestra el mensaje "<Mensaje>"

    Examples: loginUsuarioIncorrecto
      | Usuario             | Contrasena | Mensaje                                 |
      | iromannnasdadsasdad | 123        | Usuario o contraseña no valido          |
      | iroman              | sda2ddsa   | Usuario o contraseña no valido          |
      |                     |            | Por favor ingresa los datos solicitados |