public class Pair {
    private final ComplexValue first;
    private final ComplexValue second;

    public Pair(double base, double  diff, boolean offsetMode) {
        if (!offsetMode) {
            this.first = new ComplexValue(base);
            this.second = new ComplexValue(diff);
            return;
        }
        double abs = Math.abs(diff);
        this.first = new ComplexValue(base-abs);
        this.second = new ComplexValue(base+abs);
    }

    public Pair(ComplexValue base, ComplexValue  diff, boolean offsetMode) {
//        System.out.println(diff);
        if (!offsetMode) {
            this.first = base;
            this.second = diff;
            return;
        }
        ComplexValue abs = diff.abs();
        this.first = base.subtract(abs);
        this.second = base.add(abs);
    }

    public Pair(ComplexValue first, ComplexValue second) {
        this.first = first;
        this.second = second;
    }

    public Pair(double first, double second) {
        this.first = new ComplexValue(first);
        this.second = new ComplexValue(second);
    }

    public ComplexValue getNum1() {
        return first;
    }

    public ComplexValue getNum2() {
        return second;
    }

    @Override
    public String toString() {
        return first.toString() + " and " + second.toString();
    }
}
