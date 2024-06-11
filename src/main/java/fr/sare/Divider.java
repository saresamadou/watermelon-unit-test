package fr.sare;

public class Divider {

    public static double divide(int numerator, double denominator) {
        if (denominator == 0) {
            throw new DivideByZeroException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }
}
