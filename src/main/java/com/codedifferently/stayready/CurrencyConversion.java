package com.codedifferently.stayready;
import java.util.HashMap;

public class CurrencyConversion {

    //Hashmap is a dictionary..made up of a key and value... 
    HashMap<String, Double> convRates = new HashMap();

    //spits out converted amount
    //We should be able to use convert currency like this:
    // fromUSD(toUSD(amount,curr1), curr2) -> fromUSD(toUSD(150,GBP), INR)

    public double toUSD(double originalAmount, String curr1){
        return originalAmount/convRates.get(curr1);
    }

    public double fromUSD(double toUSDAmount, String curr2){
        return toUSDAmount * convRates.get(curr2);
    }


    public void initRateMap(){
        convRates.put("USD", 1.00);
        convRates.put("EUR", 0.94 );
        convRates.put("GBP", 0.82);
        convRates.put("INR", 68.32);
        convRates.put("AUD", 1.35);
        convRates.put("CAD", 1.32);
        convRates.put("SGD", 1.43);
        convRates.put("CHF", 1.01);
        convRates.put("MYR", 4.47);
        convRates.put("JPY", 115.84);
        convRates.put("RMB", 6.92);
    }
}