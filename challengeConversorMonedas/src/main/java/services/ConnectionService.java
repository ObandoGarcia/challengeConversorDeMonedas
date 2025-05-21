package services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionService {

    private static final String API_KEY = "f026bb2d2e29236bcad8c56b";
    private String fromCurrency;
    private String toCurrency;

    public ConnectionService(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public String getJsonFromAPI() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();

        String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/"+ fromCurrency + "/" + toCurrency;
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
