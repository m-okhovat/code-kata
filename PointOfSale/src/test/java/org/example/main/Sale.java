package org.example.main;

public class Sale {

    private final Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void onBarcode(String barcode) {
        if (barcode == "1433")
        display.setText("$343");
        else if(barcode == "4545")
            display.setText("$45656");
    }
}
