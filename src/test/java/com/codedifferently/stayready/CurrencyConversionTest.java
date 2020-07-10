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
        double USD = 150.0;
        double expected = 14800.0;
        //When
        double actual = conv.fromUSD(USD, "EUR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


    @Test
    public void EURtoUSDTest(){
        //Given
        CurrencyConversion conv = new CurrencyConversion();
        double EUR = 150.0;
        double expected = 159.57;
        //When
        double actual = conv.fromUSD(EUR, "USD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void EURtoGBPTest(){
        //Given
        CurrencyConversion conv = new CurrencyConversion();
        double EUR = 150.0;
        double expected = 130.85;
        //When
        double actual = conv.fromUSD(EUR, "GBP");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }
    

    @Test
    public void GBPtoINRTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double GBP = 150.0;
        double expected = 12497.56;
        //When
        double actual = conv.fromUSD(GBP, "INR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void INRtoCADTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double INR = 150.0;
        double expected = 2.89;
        //When
        double actual = conv.fromUSD(INR, "CAD");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CADtoSGDTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double CAD = 150.0;
        double expected = 162.5;
        //When
        double actual = conv.fromUSD(CAD, "SGB");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void SGDtoCHFTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double SGB = 150.0;
        double expected = 105.94;
        //When
        double actual = conv.fromUSD(SGB, "CHF");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void CHFtoMYRTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double CHF = 150.0;
        double expected = 663.86;
        //When
        double actual = conv.fromUSD(CHF, "MYR");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void MYRtoJPYTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double MYR = 150.0;
        double expected = 3887.24;
        //When
        double actual = conv.fromUSD(MYR, "JPY");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void JPYtoRMBTest(){
        CurrencyConversion conv = new CurrencyConversion();
        double JPY = 150.0;
        double expected = 8.96;
        //When
        double actual = conv.fromUSD(JPY, "RMB");
        //Then
        Assert.assertEquals(expected, actual, 0.0);
    }


}
