package chapter04;

public class PrivateLock {
    private final Object myLock = new Object();
    Long value;

    void someMethod(Long _value) {
        synchronized (myLock) {
            value = _value;
        }
    }
}
