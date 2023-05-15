public class QuadraticCalculator {

    // Does some math!
    public static Pair calculate(double a, double b, double c) {
        return new Pair(-b/a/2, Math.sqrt(Math.pow(b,2) - 4*a*c)/a/2);
    }
}