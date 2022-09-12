package org.example.pos.test;

import org.example.main.Display;
import org.example.main.Sale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.nio.file.FileSystemAlreadyExistsException;

public class SellOneItemTests {
    @Test
    void sell_one_item() {
        Sale sale = new Sale();
        sale.onBarcode("1433");

        Display display = new Display();
        Assertions.assertEquals("$343", display.getText());
    }
}
