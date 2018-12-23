package com.sitric;

import com.google.gson.Gson;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Currency currency = new Currency(150, "EUR");
        solution.currencyToJson(currency);

    }

    private void currencyToJson (Currency currency) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(currency));
    }
}
