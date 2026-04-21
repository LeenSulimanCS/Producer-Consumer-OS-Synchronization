
public class Buffer{

    private int numOfJobs;
    private final int capacity;
    
   public Buffer(int c) {
        numOfJobs = 0; //initially the Buffer is empty.
        capacity = c;
    }
    
    // Deal with race conditions. using lock Object (synchronized)
    public synchronized void writeJob() {
        
        //Avoid deadlocks.
        try {
            // Prevent writing when buffer is full
            while (numOfJobs >= capacity) {
                wait();
        }   } catch (Exception e) {}
            
            numOfJobs++; // Add a job to the buffer
            System.out.println("Write-request,   jobs in buffer: " + numOfJobs);
            notifyAll();//Avoid deadlocks.
    }
    
    // Deal with race conditions. using lock Object (synchronized)
    public synchronized void readJob() {
        
        //Avoid deadlocks.
        try {
            // Prevent writing when buffer is full
            while (numOfJobs <= 0) {
                wait();
        }   } catch (Exception e) {}
            
        numOfJobs--; // Remove a job from the buffer
        System.out.println("Read-request,    jobs in buffer: " + numOfJobs);
        notifyAll(); //Avoid deadlocks.
    
        
    }
    
    public double numOfRegisteredJobs() {
    return numOfJobs;
}

}
