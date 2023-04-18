#language: es
#autor: joankmr07@gmail.com

  Característica:Confirmar Comprar de un producto en la pagina saucedemo.com


      Esquema del escenario: confirmar compra exitosa en saucedemo.com
        Dado que me encuentro en la pagina de "https://www.saucedemo.com/"
        Y inicio sesion con las credenciales "standard_user" y "secret_sauce"
        Cuando adiciono un producto  al carro de compras
        Y completo la compra del producto
          | nombre   | apellido   | codigo_postal   |
          | <nombre> | <apellido> | <codigo_postal> |

        Entonces valido que se presente el mensaje de confirmacion "<mensaje>"

        Ejemplos:
          | nombre | apellido | codigo_postal | mensaje|
          | Kevin  | mosquera | 12345         | Thank you for your order!|