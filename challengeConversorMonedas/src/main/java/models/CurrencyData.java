package models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CurrencyData {
    private String result;

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("conversion_rates")
    private Map<String, Double> conversionRates;

    public CurrencyData() {
    }

    public CurrencyData(String result, String baseCode) {
        this.result = result;
        this.baseCode = baseCode;
    }

    @Override
    public String toString() {
        return "Data: " +
                "result=" + result +
                ", baseCode=" + baseCode +
                ", conversionRates= " + conversionRates;
    }
}
