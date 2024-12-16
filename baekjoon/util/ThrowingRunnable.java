package util;

@FunctionalInterface
public interface ThrowingRunnable {
    static void runUnchecked(ThrowingRunnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void run() throws Exception;
}
