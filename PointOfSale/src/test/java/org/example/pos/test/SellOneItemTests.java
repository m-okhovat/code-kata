package org.example.pos.test;

import org.example.main.Display;
import org.example.main.Sale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SellOneItemTests {
    @Test
    void sell_one_item() {
        Display display = new Display();
        Sale sale = new Sale(display);

        sale.onBarcode("1433");

        Assertions.assertEquals("$343", display.getText());
    }


    @Disabled("refactoring ...")
    @Test
    void sell_another_item() {

        Display display = new Display();
        Sale sale = new Sale(display);

        sale.onBarcode("4545");

        Assertions.assertEquals("$45656", display.getText());
    }
}
