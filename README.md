<h1>Conversor de monedas</h1>
<h2>Consumo de API ExchangeRate-API usando java</h2>
<hr>

<h3>¿En qué consiste el proyecto?</h3>
<p>Mediante una interfaz de consola se muestra al usuario opciones de conversion de monedas cada una indica por un numero.
Luego el usuario ingresa por teclado la opcion que quiere operar. Continua y el programa solicita el monto a convetir se debe ingresar un numero.
Como resultado final muestra un texto donde indica desde que moneda se convirtio y hacia que maneda se hizo la conversion.
Finalizando con el valor de la conversion.
</p>

<h3>¿Que es lo que maneja internamente?</h3>
<p>La creacion de clases y separacion de responsabilidades, contiene una clase modelo llamada "CurrencyData" que contiene la propiedades basicas con las que responde la API.
En la parte de servicios estan la clase de conexion con la API "ConnectionService". Esta actua instanciando y haciendo uso de clases de Java como HttpClient y HttpRequest para  poder conectarse con la API. Para obtener la respuesta se utiliza HttpResponse.</p>

<h3>¿Que pasa con la data obtenida?</h3>
<p>Luego de que la clase "ConnectionService" procese la informacion debuelve informacion en formato JSON haciendo uso de GSON de Google se utiliza para darle formato.
Una vez obtneido el resultado el metodo convert de la clase "ConvertCurrencyService" resaliza la operacion de conversion de la moneda seleccionada y lo retorna como un numero.
</p>
  
<h3>Tecnologias usadas</h3>
<ul>
  <li>Java</li>
  <li>Libreria Gson</li>
  <li>Postman</li>
</ul>


