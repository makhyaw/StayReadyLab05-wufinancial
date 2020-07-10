package com.codedifferently.stayready;

import org.junit.Test;
import org.junit.Assert;

public class CurrencyConversionTest{

    /* 100 USD -> EUR.... convertCurrency(150, getRate(USD,EUR)) -> 94.00

    We have three pieces of informations, we got the amount...
    the start currency (curr1), and the currency we want to change it to (curr2)*/
    
    // double Amount - when thinking about our program, we just 
    //gonna have to find somewhere for this amount to go into

    // String curr1 - These two strings will help us find the conversion rate
    // String curr2
    
    @Test
    public void USDToEURTest(){
        //Given
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double USD = 150.0;
        double expected = 141.0;
        //When
        double actual = conv.fromUSD(USD, "EUR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


    @Test
    public void EURtoUSDTest(){
        //Given
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double EUR = 141.0;
        double expected = 150;
        //When
        double actual = conv.toUSD(EUR, "EUR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void EURtoGBPTest(){
        //Given
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double EUR = 141.0;
        double USD = 150;
        double expected = 122.99999999999999;
        //When
        double actual = conv.fromUSD(USD, "GBP");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    

    @Test
    public void GBPtoINRTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double GBP = 122.99999999999999;
        double USD = 150;
        double expected = 10247.999999999998;
        //When
        double actual = conv.fromUSD(USD, "INR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void INRtoCADTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double INR = 10247.999999999998;
        double USD = 150;
        double expected = 198;
        //When
        double actual = conv.fromUSD(USD, "CAD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CADtoSGDTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double CAD = 198;
        double USD = 150;
        double expected = 214.5;
        //When
        double actual = conv.fromUSD(USD, "SGD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SGDtoCHFTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double SGB = 214.5;
        double USD = 150;
        double expected = 151.5;
        //When
        double actual = conv.fromUSD(USD, "CHF");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CHFtoMYRTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double CHF = 151.5;
        double USD = 150;
        double expected = 670.5;
        //When
        double actual = conv.fromUSD(USD, "MYR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void MYRtoJPYTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double MYR = 670.5;
        double USD = 150;
        double expected = 17376;
        //When
        double actual = conv.fromUSD(USD, "JPY");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void JPYtoRMBTest(){
        CurrencyConversion conv = new CurrencyConversion();
        conv.initRateMap();
        double JPY = 17376;
        double USD = 150;
        double expected = 1038;
        //When
        double actual = conv.fromUSD(USD, "RMB");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


}
