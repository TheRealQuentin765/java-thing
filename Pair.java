public class Pair {
    private final int base;
    private final int diff;

    public Pair(int base, int  diff) {
        this.base = base;
        this.diff = Math.abs(diff);
    }

    public int getBase() {
        return base;
    }

    public int getDiff() {
        return diff;
    }

    public int getNum1() {
        return base - diff;
    }

    public int getNum2() {
        return base + diff;
    }
}
