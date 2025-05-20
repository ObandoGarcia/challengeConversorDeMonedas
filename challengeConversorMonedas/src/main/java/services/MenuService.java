package services;

public class MenuService {

    public String getApplicationMenu(){
        return """
                
                ***************************************************
                
                Bienvenido a la App de conversion de monedas.
                
                Selecciona una opcion de la lista:
                
                1 - Dolar ==> Peso argentino
                2 - Peso argentino ==> Dolar
                3 - Dolar ==> Real brasileño
                4 - Real brasileño ==> Dolar
                5 - Dolar ==> Peso colombiano
                6 - Peso colombiano ==> Dolar
                7 - Salir
                
                Por favor seleccione una opcion valida:
                
                ***************************************************
                """;
    }
}
