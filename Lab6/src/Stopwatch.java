public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        reset(); // TODO is this best or should we leave these uninitialized to start?
    }

    public long read() {
        // TODO revisit this and consider a more robust implementation
        stop();
        return endTime - startTime;
    }

    public void reset() {
        // TODO revisit this and consider if we need to do anything else
        startTime = endTime = 0;
    }

    public void start() {
        // TODO revisit this and consider if we need to do anything else
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        // TODO revisit this and consider if we need to do anything else
        endTime = System.currentTimeMillis();
    }

    public static void pauseFor(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exc) {
            System.err.println("This should not happen in a single-threaded program.");
        }
    }
}