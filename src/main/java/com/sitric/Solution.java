package com.sitric;

import java.math.BigDecimal;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Objects.hash(new BigDecimal(10.1));
        System.out.println("Hi from parent module");
    }
}
