public class QuadraticCalculator {

    // Does some math!
    public static Pair calculate(double a, double b, double c) {
        ComplexValue underTheRoot = new ComplexValue(Math.pow(b,2) - 4*a*c);
        return new Pair(new ComplexValue(-b/a/2), underTheRoot.squareRoot().divide(a*2), true);
    }
}