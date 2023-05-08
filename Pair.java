public class Pair {
    private final double base;
    private final double diff;

    public Pair(double base, double  diff) {
        this.base = base;
        this.diff = Math.abs(diff);
    }

    public double getBase() {
        return base;
    }

    public double getDiff() {
        return diff;
    }

    public double getNum1() {
        return base - diff;
    }

    public double getNum2() {
        return base + diff;
    }
}
