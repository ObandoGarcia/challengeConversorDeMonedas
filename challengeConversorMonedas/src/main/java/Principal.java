import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.CurrencyData;
import services.ConnectionService;
import services.MenuService;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Instance of Scanner
        Scanner scanner = new Scanner(System.in);

        //Instance of Gson
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        //Instance of MenuService
        MenuService menuService = new MenuService();

        //Instance of connectionService
        ConnectionService connectionService = new ConnectionService();

        //Displaying menu
        System.out.println(menuService.getApplicationMenu());

        //Get user data
        while(true){
            System.out.println("Ingrese la opcion que desea operar:");
            int opt = scanner.nextInt();

            if(opt == 7){
                break;
            }
        }
    }
}
