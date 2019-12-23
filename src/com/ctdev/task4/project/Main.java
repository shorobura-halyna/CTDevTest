package com.ctdev.task4.project;

import com.ctdev.task4.project.model.ProductPrice;
import com.ctdev.task4.project.service.PriceExplorer;

import java.util.List;
import java.util.Map;

import static com.ctdev.task4.project.util.InitUtil.init;

public class Main {

    public static void main(String[] args) {
        Map<String, List<ProductPrice>> monthByProductsTable = init();

        PriceExplorer ps = PriceExplorer.PriceExplorerBuilder
                .getPriceExplorer(monthByProductsTable);

        String result = ps.getPrice("Jan", "prod1");
        System.out.println("result = " + result);
    }

}
