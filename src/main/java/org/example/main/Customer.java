package org.example.main;

public class Customer   {

    private boolean promoted = false;
    public double getDiscount() {
        if (promoted)
            return 0.5;
        return 0;
    }

    public void Promote() {
        promoted = true;

    }
}
