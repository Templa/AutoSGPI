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
<<<<<<< HEAD
      | Usuario   | Contrasena | Mensaje           |
      | iromannn  | sodimac123 | usuario no valido | 
=======
      | Usuario  | Contrasena | Mensaje                                 |
      | iromannn | 123        | Usuario o contrase                      |
      |          |            | Por favor ingresa los datos solicitados |
>>>>>>> 88c5a94... [ft/login] Se agrega test  de login PO y Actions
