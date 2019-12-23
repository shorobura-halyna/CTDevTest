package com.ctdev.task4.project.util;

import com.ctdev.task4.project.model.ProductPrice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitUtil {
    private InitUtil() {}

    public static Map<String, List<ProductPrice>> init() {
        Map<String, List<ProductPrice>> map = new HashMap<>();
        List<ProductPrice> monthNumbers1 = new ArrayList<>();
        monthNumbers1.add(new ProductPrice("Jan", "num1"));
        monthNumbers1.add(new ProductPrice("Feb", "num2"));
        monthNumbers1.add(new ProductPrice("Mar", "num3"));
        monthNumbers1.add(new ProductPrice("Apr", "num4"));
        monthNumbers1.add(new ProductPrice("May", "num5"));
        monthNumbers1.add(new ProductPrice("Jun", "num6"));
        monthNumbers1.add(new ProductPrice("Jul", "num7"));
        monthNumbers1.add(new ProductPrice("Aug", "num8"));
        monthNumbers1.add(new ProductPrice("Sep", "num9"));
        monthNumbers1.add(new ProductPrice("Oct", "num10"));
        monthNumbers1.add(new ProductPrice("Nov", "num11"));
        monthNumbers1.add(new ProductPrice("Dec", "num12"));
        map.put("prod1", monthNumbers1);

        List<ProductPrice> monthNumbers2 = new ArrayList<>();
        monthNumbers2.add(new ProductPrice("Jan", "num13"));
        monthNumbers2.add(new ProductPrice("Feb", "num14"));
        monthNumbers2.add(new ProductPrice("Mar", "num15"));
        monthNumbers2.add(new ProductPrice("Apr", "num16"));
        monthNumbers2.add(new ProductPrice("May", "num17"));
        monthNumbers2.add(new ProductPrice("Jun", "num18"));
        monthNumbers2.add(new ProductPrice("Jul", "num19"));
        monthNumbers2.add(new ProductPrice("Aug", "num20"));
        monthNumbers2.add(new ProductPrice("Sep", "num21"));
        monthNumbers2.add(new ProductPrice("Oct", "num22"));
        monthNumbers2.add(new ProductPrice("Nov", "num23"));
        monthNumbers2.add(new ProductPrice("Dec", "num24"));
        map.put("prod2", monthNumbers2);

        List<ProductPrice> monthNumbers3 = new ArrayList<>();
        monthNumbers3.add(new ProductPrice("Jan", "num25"));
        monthNumbers3.add(new ProductPrice("Feb", "num26"));
        monthNumbers3.add(new ProductPrice("Mar", "num27"));
        monthNumbers3.add(new ProductPrice("Apr", "num28"));
        monthNumbers3.add(new ProductPrice("May", "num29"));
        monthNumbers3.add(new ProductPrice("Jun", "num30"));
        monthNumbers3.add(new ProductPrice("Jul", "num31"));
        monthNumbers3.add(new ProductPrice("Aug", "num32"));
        monthNumbers3.add(new ProductPrice("Sep", "num33"));
        monthNumbers3.add(new ProductPrice("Oct", "num34"));
        monthNumbers3.add(new ProductPrice("Nov", "num35"));
        monthNumbers3.add(new ProductPrice("Dec", "num36"));
        map.put("prod3", monthNumbers3);

        return map;
    }
}
