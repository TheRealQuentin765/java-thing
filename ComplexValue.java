public class ComplexValue {
    private final double real;
    private final double imaginary;

    public ComplexValue(double real) {
        this(real,0);
    }

    public ComplexValue(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public boolean equals(double val) {
        return imaginary == 0 && real == val;
    }

    public boolean equals(ComplexValue obj) {
        return (real == obj.real && imaginary == obj.imaginary);
    }

    public ComplexValue add(ComplexValue obj) {
        return new ComplexValue(real+obj.real, imaginary+ obj.imaginary);
    }

    public ComplexValue multiply(ComplexValue obj) {
        return new ComplexValue(
                real*obj.real - imaginary*obj.imaginary,
                real* obj.imaginary + imaginary*obj.real
        );
    }

    public ComplexValue multiply(double num) {
        return new ComplexValue(real*num,imaginary*num);
    }

    public ComplexValue negative() {
        return new ComplexValue(-real, -imaginary);
    }

    public ComplexValue inverse() { // the formula comes from the internet
        double d = Math.pow(real,2)+Math.pow(imaginary,2);
        return new ComplexValue(real/d,-imaginary/d);
    }

    public ComplexValue divide(double num) {
        return multiply(1/num);
    }

    public ComplexValue divide(ComplexValue obj) {
        return multiply(obj.inverse());
    }

    public ComplexValue subtract(ComplexValue obj) {
        return add(obj.negative());
    }

    public double radius() {
        return Math.sqrt(radiusSqr());
    }

    public double radiusSqr() {
        return Math.pow(real,2)+Math.pow(imaginary,2);
    }

    public ComplexValue squareRoot() { // this formula also comes from the internet
        double r = radius();
        int imaginarySign = (int)Math.signum(imaginary);
        if (imaginarySign == 0) imaginarySign = 1;
        return new ComplexValue(
                Math.sqrt((r+real)/2),
                imaginarySign * Math.sqrt((r-real)/2)
        );
    }

    public double argument() {
        return Math.atan2(imaginary,real);
    }

    public ComplexValue pow(ComplexValue obj) { // math from https://mathworld.wolfram.com/ComplexExponentiation.html
        double r2 = radiusSqr();
        double arg = argument();
        double newR = Math.pow(r2,obj.real/2);
        double newArg = obj.real*arg + obj.imaginary*Math.log(r2)/2;
        return new ComplexValue(
                newR*Math.cos(newArg),
                newR*Math.sin(newArg)
        );
    }

    public ComplexValue abs() {
        int sign = -(int)Math.signum(real);
        if (sign == 0) return new ComplexValue(0, Math.abs(imaginary));
        return new ComplexValue(sign*real,sign*imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
