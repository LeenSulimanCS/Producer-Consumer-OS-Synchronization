
public class PrinterDemo {

    public static void main(String[] args) {

        Buffer printBuffer = new Buffer(20); // Maximum 20 jobs in the buffer

        for (int i = 1; i <= 5; i++) {
            WriteRunnable writeJob = new WriteRunnable(printBuffer);
            ReadRunnable readJob = new ReadRunnable(printBuffer);

            Thread writeThread = new Thread(writeJob);
            Thread readThread = new Thread(readJob);

            writeThread.start();// Start writing jobs
            readThread.start();// Start reading jobs
        }
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
           System.out.println("Buffer interrupted.");
        }
        
        System.out.println("\nBuffer exiting.");
    }
    
}