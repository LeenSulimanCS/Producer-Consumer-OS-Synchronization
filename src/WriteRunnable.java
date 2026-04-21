
class WriteRunnable implements Runnable {

    private static final int DELAY = 500; //(Write Jobs)with 1/2second delay.
    private Buffer printBuffer;

    public WriteRunnable(Buffer buffer) {
        printBuffer = buffer;
    }
    
    public void run() {
        
        try {
            
            printBuffer.writeJob(); // Write a job to the buffer
            Thread.sleep(DELAY);
            
        } catch (InterruptedException e) {
           System.out.println("Write Job interrupted.");
        }
    }
}
