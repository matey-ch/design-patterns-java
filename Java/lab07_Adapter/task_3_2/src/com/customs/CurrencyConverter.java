package com.customs;

public class CurrencyConverter {
    private static float usdInUah = 38.56f;
    public static float usdToUah(float usd){
        return usd*usdInUah;
    }
}
