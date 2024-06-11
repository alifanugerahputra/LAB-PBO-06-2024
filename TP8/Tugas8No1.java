import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Tugas8No1 {

    static final int DATA_SOURCES = 4;
    private static final int THREAD_POOL_SIZE = 3;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        UiThread uiThread = new UiThread();
        uiThread.start();

        int successfulLoads = 0;
        int failedLoads = 0;

        for (int i = 0; i < DATA_SOURCES; i++) {
            executorService.submit(new BackgroundThread(uiThread));
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        uiThread.interrupt();
    }
}

class UiThread extends Thread {
    private int dataLoaded = 0;
    private int dataFailed = 0;
    private long startTime;

    public UiThread() {
        this.startTime = System.currentTimeMillis();
        System.out.println("Start load " + Tugas8No1.DATA_SOURCES + " Data.");
    }

    public synchronized void dataLoaded() {
        dataLoaded++;
        if (dataLoaded + dataFailed == Tugas8No1.DATA_SOURCES) {
            printFinalStatus();
        }
    }

    public synchronized void dataFailed() {
        dataFailed++;
        if (dataLoaded + dataFailed == Tugas8No1.DATA_SOURCES) {
            printFinalStatus();
        }
    }

    private void printFinalStatus() {
        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime) / 1000;
        System.out.println("Task Finish.");
        System.out.println("Time Execution: " + executionTime + "s");
        System.out.println(dataLoaded + " Data Successfully Loaded & " + dataFailed + " Data failed to load.");
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
                System.out.println("Loading... (" + (System.currentTimeMillis() - startTime) / 1000 + "s)");
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

class BackgroundThread extends Thread {
    private final UiThread uiThread;

    public BackgroundThread(UiThread uiThread) {
        this.uiThread = uiThread;
    }

    @Override
    public void run() {
        int executionTime = TaskTimeHelper.getRandomExecutionTime();
        try {
            Thread.sleep(executionTime * 1000);
            if (executionTime > 4) {
                System.out.println("Request Timeout");
                uiThread.dataFailed();
            } else {
                uiThread.dataLoaded();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class TaskTimeHelper {
    private static final Random RANDOM = new Random();

    public static int getRandomExecutionTime() {
        return RANDOM.nextInt(6) + 1;
    }
}