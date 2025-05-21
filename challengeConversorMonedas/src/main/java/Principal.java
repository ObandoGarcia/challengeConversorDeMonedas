import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.CurrencyData;
import services.ConnectionService;
import services.ConvertCurrencyService;
import services.MenuService;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Instance of Scanner
        Scanner scanner = new Scanner(System.in);

        //Instance of MenuService
        MenuService menuService = new MenuService();

        //Displaying menu
        System.out.println(menuService.getApplicationMenu());

        //Get user data
        while (true){
            System.out.println("Ingrese la opcion que desea operar:");
            int opt = scanner.nextInt();

            if (opt == 7){
                System.out.println("Ejecucion finalizada!");
                break;
            }

            String fromCurrency = "";
            String toCurrency = "";

            switch (opt) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 2:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 4:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "COP";
                    break;
                case 6:
                    fromCurrency = "COP";
                    toCurrency = "USD";
                    break;
                default:
                    System.out.println("Seleccion no valida! Intente de nuevo.");
                    continue;
            }

            System.out.println("Ingrese el monto a convertir");
            double amount = scanner.nextDouble();

            ConvertCurrencyService convertCurrencyService = new ConvertCurrencyService();

            System.out.println("Informacion de la conversion:");
            System.out.println("Resultado: " +
                    "Convertido de: " + fromCurrency +
                    " a: " + toCurrency +
                    ", Resultado: " + convertCurrencyService.convert(fromCurrency, toCurrency, amount) + " " + toCurrency);
            System.out.println();

        }
    }
}
