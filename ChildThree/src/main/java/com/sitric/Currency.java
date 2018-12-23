package com.sitric;

public class Currency {
    private Integer valueCurrency;
    private String typeCurrency;


    public Currency(Integer valueCurrency, String typeCurrency) {
        this.valueCurrency = valueCurrency;
        this.typeCurrency = typeCurrency;
    }

    public Integer getValueCurrency() {
        return valueCurrency;
    }

    public void setValueCurrency(Integer valueCurrency) {
        this.valueCurrency = valueCurrency;
    }

    public String getTypeCurrency() {
        return typeCurrency;
    }

    public void setTypeCurrency(String typeCurrency) {
        this.typeCurrency = typeCurrency;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "valueCurrency=" + valueCurrency +
                ", typeCurrency='" + typeCurrency + '\'' +
                '}';
    }
}
