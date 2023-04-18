#language: es
#autor: joankmr07@gmail.com

  Característica: Adicion de productos al carrito de compras de la pagina saucedemo.com

    Escenario: adicionar un producto al carrito de compras
      Dado que me encuentro en la pagina de "https://www.saucedemo.com/"
      Y inicio sesion con las credenciales "standard_user" y "secret_sauce"
      Cuando adiciono un producto  al carro de compras
      Entonces valido que el producto sea "Sauce Labs Fleece Jacket"