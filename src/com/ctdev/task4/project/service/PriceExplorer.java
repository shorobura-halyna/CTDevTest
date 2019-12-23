package com.ctdev.task4.project.service;

import com.ctdev.task4.project.model.ProductPrice;

import java.util.List;
import java.util.Map;

public class PriceExplorer {
    private Map<String, List<ProductPrice>> map;

    private PriceExplorer() {}

    public static class PriceExplorerBuilder {
        public static PriceExplorer getPriceExplorer(Map<String, List<ProductPrice>> map) {
            PriceExplorer priceExplorer = new PriceExplorer();
            priceExplorer.map = map;
            return priceExplorer;
        }
    }

    public String getPrice(String month, String product) {
        String number = "";
        List<ProductPrice> monthNumbers = map.get(product);
        for (ProductPrice monthNumber : monthNumbers) {
            if (monthNumber.getMonth().equals(month)) {
                number = monthNumber.getPrice();
            }
        }
        return number;
    }
}
