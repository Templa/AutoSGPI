@login
Feature: Login

  @loginUsuarioIncorrecto
  Scenario Outline: Inicio de sesión con datos inválidos, usuario incorrecto
    Given Ingresar en el Portal SGPI
	When Ingresar Usuario "<Usuario>"
	And Ingresar Password "<Contrasena>"
	And Presionar Ingresar
	Then El sistema indicará "<Mensaje>"

    Examples: loginUsuarioIncorrecto
      | Usuario   | Contrasena | Mensaje           |
      | iromannn  | sodimac123 | usuario no valido | 