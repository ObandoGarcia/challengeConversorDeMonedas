package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.CurrencyData;

import java.io.IOException;
import java.util.Map;

public class ConvertCurrencyService {

    //Instance of Gson
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public double convert(String fromCurrency, String toCurrency, Double amount) throws IOException, InterruptedException {

        ConnectionService connectionService = new ConnectionService(fromCurrency, toCurrency);

        CurrencyData currencyData = gson.fromJson(connectionService.getJsonFromAPI(), CurrencyData.class);

        return currencyData.getConversionRate() * amount;
    }

}
