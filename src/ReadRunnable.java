
class ReadRunnable implements Runnable {

    private static final int DELAY = 1000; //(Read Jobs)with one second delay.

    private Buffer printBuffer;

    public ReadRunnable(Buffer buffer) {
        printBuffer = buffer;
    }

    public void run() {
        
        try {
            
            printBuffer.readJob();// Read a job from the buffer
            Thread.sleep(DELAY);
            
        } catch (InterruptedException e) {
           System.out.println("Read Job interrupted.");
        }
    }
}