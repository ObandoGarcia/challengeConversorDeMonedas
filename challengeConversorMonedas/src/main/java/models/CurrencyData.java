package models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class CurrencyData {
    private String result;

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("target_code")
    private String targetCode;

    @SerializedName("conversion_rate")
    private Double conversionRate;

    public CurrencyData() {
    }

    public CurrencyData(String result, String baseCode, String targetCode, Double conversionRate) {
        this.result = result;
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.conversionRate = conversionRate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    @Override
    public String toString() {
        return "Datos de la conversion: " +
                "estado = " + result +
                ", convertir de: " + baseCode +
                ", a: " + targetCode +
                ", a una taza de conversion de:" + conversionRate;
    }
}
