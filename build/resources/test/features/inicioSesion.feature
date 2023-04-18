#language: es
#autor: joankmr07@gmail.com


  Característica:Inicio de sesion en pagina saucedemo.com


      Esquema del escenario: <Escenario>
        Dado que me encuentro en la pagina de "https://www.saucedemo.com/"
        Cuando realizo el logueo en la pagina con las credenciales
          | usuario   | contrasena   |
          | <usuario> | <contrasena> |
        Entonces valido en pantalla el "<Mensaje>"


        Ejemplos:
          | Escenario                                      | usuario                 | contrasena   | Mensaje                                             |
          | Login exitoso                                  | standard_user           | secret_sauce | Swag Labs                                           |
          | Login con usuario bloqueado                    | locked_out_user         | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
          | login con usuario con incorrecto               | problem_user            | secret_sauce | Swag Labs                                           |
          | login con usuario con problemas de performance | performance_glitch_user | secret_sauce | Swag Labs                                           |


