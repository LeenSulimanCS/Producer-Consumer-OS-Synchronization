# Producer-Consumer Problem (Thread Synchronization)

##  Project Overview
This project is a Java-based simulation of the classic **Producer-Consumer Problem**, a core concept in **Operating Systems**. It demonstrates how to manage shared resources between multiple threads while avoiding common issues like **Race Conditions** and **Deadlocks**.

##  Technical Challenge
- **The Problem:** A producer adds data to a fixed-size buffer, and a consumer removes it. If the buffer is full, the producer must wait; if it's empty, the consumer must wait.
- **The Solution:** Implemented using **Java Multi-threading** with synchronized methods and the `wait()` and `notifyAll()` mechanisms for thread communication.

## Implementation Details
The project consists of 4 main components:
1. **Buffer Class:** The shared resource that stores jobs. It uses `synchronized` blocks to ensure thread safety.
2. **Producer (WriteRunnable):** A thread that continuously generates jobs and attempts to add them to the buffer.
3. **Consumer (ReadRunnable):** A thread that retrieves and processes jobs from the buffer.
4. **Main Class:** Orchestrates the execution and initializes the threads.
The project was tested to handle edge cases like full and empty buffers, ensuring smooth data flow without system crashes.

## Key OS Concepts Covered
- **Inter-Thread Communication:** Using `wait()` to pause threads and `notifyAll()` to wake them up.
- **Race Condition Prevention:** Ensuring only one thread modifies the buffer at a time.
- **Deadlock Avoidance:** Implementing logic to ensure threads don't wait indefinitely for each other.

##  Repository Structure
- `/src`: Contains the `.java` source files.
- `OS_Project_Report.pdf`: Detailed report explaining the logic, synchronization techniques, and output analysis.

##  Learning Outcomes
- Advanced understanding of Java Multi-threading.
- Practical experience in solving synchronization problems in concurrent systems.
- Analyzing and preventing deadlocks in shared-buffer scenarios.
