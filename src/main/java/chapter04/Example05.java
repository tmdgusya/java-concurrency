package chapter04;

import annotation.ThreadSafe;

@ThreadSafe
public class Example05 {
    private int lec;
    private int roc;

    private Condition condition = (let, roc) -> { return let > 0 && roc < 0; };

    public Example05(int lec, int roc) {
        this.lec = lec;
        this.roc = roc;
        if (!condition.isValid(lec, roc)) throw new IllegalArgumentException(lec + " and " + roc + " is invalid values");
    }

    public synchronized void setLecAndRoc(int lec, int roc) {
        this.lec = lec;
        this.roc = roc;
        if (!condition.isValid(lec, roc)) throw new IllegalArgumentException(lec + " and " + roc + " is invalid values");
    }

    private interface Condition {
        public boolean isValid(int let, int roc);
    }

    public static void main(String[] args) {
        var a = new Example05(10, -10);
    }
}
