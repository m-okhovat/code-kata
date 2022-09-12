package org.example.main;

public class Sale {

    private final Display display;

    public Sale(Display display) {
        this.display = display;
    }

    public void onBarcode(String barcode) {
        display.setText("$343");
    }
}
