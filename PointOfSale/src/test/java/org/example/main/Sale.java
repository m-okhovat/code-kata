package org.example.main;

import java.util.HashMap;
import java.util.Map;

public class Sale {

    private final Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void onBarcode(String barcode) {
        if (barcode == "")
            display.setText("error: invalid barcode!");
        else {

            Map<String, String> pricesByBarcodes = new HashMap<String, String>(){{
                put("1433", "$343");
                put("4545", "$45656");
            }};
            if (barcode == "1433")
                display.setText(pricesByBarcodes.get("1433"));
            else if (barcode == "4545")
                display.setText(pricesByBarcodes.get("4545"));
            else
                display.setText("product not found.");
        }
    }
}
