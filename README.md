# Automatizacion_ceiba


# Alcance
Se probaran Login , Adicionar producto Y Comprar producto de la página Saucedemo.com, centradas en pruebas funcionales 


# Estrategia de pruebas

La estrategia de pruebas incluirá lo siguiente:

Pruebas funcionales: se realizarán pruebas para asegurarse de que todas las funcionalidades del software funcionen correctamente según los requisitos especificados.


# Matriz de riesgos


| Riesgo| Probabilidad | Impacto |Severidad |
| ------------ | ------------ | ------------ |------------ |
| Retraso en entrega del software| Alta| Medio|Alta|
| Defectos críticos no detectados| Media| Alto|Alto|
| Defectos importantes no detectados| Media| Medio|Alta|
| Defectos menores no detectados| Baja| Bajo|Medio|
| Recursos de prueba insuficientes| Bajo| Bajo|Bajo|
| Requisitos no cubiertos en pruebas| Media| Medio|Medio|
| Ambiente de pruebas inestable| Bajo| Bajo|Bajo|
| Pruebas manuales no cubren suficiente funcionalidad| Media| Medio|Medio|




# Ejecucion

Al momento de ejecutar el proyecto y obtener el reporte debemos ubicarnos en la carpeta del proyecto y abrir el CMD para ejecutar el siguiente comando

    gradle clean test aggregate
Este comando ejecutara todos los escenarios implementados en el proyecto

    6 actionable tasks: 6 executed
Al finalizar debemos ingresar y abrir el archivo index.html que se encuentra en la siguiente ruta

    <ProyectoName>\target\site\serenity\index.html





# Anotacion

Se anexa el archivo Bugs encontrados en donde se encuentran documentados  los errores encontrados en la pagina saucedemo.com
