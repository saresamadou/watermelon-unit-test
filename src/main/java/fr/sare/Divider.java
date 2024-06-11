package fr.sare;

public class Divider {

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new DivideByZeroException("Denominator cannot be zero");
        }

        return (double) numerator / denominator;
    }
}
