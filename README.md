# Escuela Colombiana de Ingeniería Julio Garavito - Arquitecturas Empresarial AREP - Primer Parcial 
# AREP-WEATHER-API
## REQUERIMIENTOS
Su compañía lo ha seleccionado para construir un simple webservice desplegada en Heroku para uno de los clientes más importantes.

Así, han decidido que usted debe construir un webservice  para consultar el estado del clima en lugares específicos de la tierra.  El servicio web recibirá en un campo la descripción de una ciudad, por ejemplo “London” para Londres   y deberá mostrar la información del clima para esa ciudad. Para esto utilice el API gratuito de https://openweathermap.org/ (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un caché que permita evitar hacer consultas repetidas al API externo. La petición debe pasar por su servicio web desplegado en Heroku, es decir desde su servicio en Heroku se debe invocar el servicio web de clima. El usuario no sabrá qué servicio está usted invocando por detrás. Utilice el servicio "Current Weather Data".

## Diseño

  Diseño de la aplicación
  
  ![Diseño1](https://github.com/nicolasOL/AREP-WEATHER-API/blob/main/images/Diagram.png)

Debe usar spark o sockets.

## Cuenta con 
* [Heroku](https://heroku.com) - Despliegue web [![Deploy](https://www.herokucdn.com/deploy/button.png)](https://arep-clima-api.herokuapp.com/clima)
* [Circle CI]() - Integración Continua ![CircleCI](https://circleci.com/gh/nicolasOL/AREP-WEATHER-API.svg?style=svg&circle-token=f14c9a5d0829681765658bf32d4b536ab671ba9b)
  ### Requisitos
  
  Si deseas usarlo en tu maquina local, es necesario tener:
  
  * Maven 
  * Java 
  * Git
  * Spark  
  

 ### Como usarlo?
  ## Localmente:
  En primer lugar vamos a descargar el repositorio en nuestra máquina local, y en la carpeta de 
nuestra preferencia. En consola vamos a digitar el siguiente comando para clonar el repositorio.

```
git clone https://github.com/nicolasOL/AREP-WEATHER-API
```

Entremos a el directorio del proyecto

```
cd clima
```

Debemos compilar el proyecto, que contiene las clases necesarias para poder correr la app. Por medio de maven vamos a crear todos los compilables **.class**. Desde consola, y ubicados en la carpeta donde se encuentra nuestra configuración de maven.

```
mvn compile
```

Ahora que nuestras clases etan compiladas vamos a ejecutar la clase principal para
ver el código en acción :

```
mvn exec:java -Dexec.mainClass="edu.escuelaing.arem.clima.main"
```
Los datos del programa se reciben por entrada en el despliegue separados por espacios.
   
## Pruebas   
Para ejecutar las pruebas es necesario ejecutar:
```
mvn test
```     

El proyecto cuenta con 5 pruebas unitarias que se ejecutan correctamente:

 ![TEST](https://github.com/nicolasOL/AREP-WEATHER-API/blob/main/images/Test.JPG)
 
Ademas se puede probar con el despliegue en Heroku de la siguiente manera:
https://arep-clima-api.herokuapp.com/clima?lugar=XXXXX
Donde las XXXX representan la ciudad que quieras buscar
Retornando un Json exactamente igual al que retorna el servicio de openweathermap denominado "Current Weather Data". Asegurese que el tipo de retorno sea Json.

## Documentacion
  
Para encontrar toda la documentación relacionada puedes hacer click [aqui](https://github.com/nicolasOL/Interpretes-canales-de-comunicacion-y-memoria/tree/master/docs)
  
  ## Author
  
  Nicolas Ortega Limas
  
  ## License
  
  This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](https://github.com/nicolasOL/AREP-WEATHER-API/blob/main/LICENSE.txt)
