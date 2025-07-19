### Multi-Threading Sequence Diagram in Mermaid
```mermaid
sequenceDiagram
    participant Main as Main Thread (Driver)
    participant Chef as Chef Thread
    participant Waiter as Waiter Thread

    Main->>Chef: Create & Start Thread
    activate Chef
    Main->>Waiter: Create & Start Thread
    activate Waiter

    par Concurrent Execution
        Chef->>Chef: Prepare soup 1<br>sleep(1000)
        Chef->>Chef: Prepare soup 2<br>sleep(1000)
        Chef->>Chef: Prepare soup 3<br>sleep(1000)
        Chef->>Chef: Prepare soup 4<br>sleep(1000)
        Chef->>Chef: Prepare soup 5<br>sleep(1000)
    and
        Waiter->>Waiter: Serve soup 1<br>sleep(1000)
        Waiter->>Waiter: Serve soup 2<br>sleep(1000)
        Waiter->>Waiter: Serve soup 3<br>sleep(1000)
        Waiter->>Waiter: Serve soup 4<br>sleep(1000)
        Waiter->>Waiter: Serve soup 5<br>sleep(1000)
    end

    Main->>Chef: join() - Wait for completion
    deactivate Chef
    Main->>Waiter: join() - Wait for completion
    deactivate Waiter

    Main->>Main: Print "Manager is done"
```

### Explanation
- **Participants**: Main (Driver), Chef, and Waiter threads.
- **Flow**:
    - Main starts both threads.
    - The `par` block shows parallel (concurrent) execution of the loops in Chef and Waiter, with each step simulating work via `sleep(1000)`.
    - Main waits for both to finish using `join()`.
    - Finally, Main prints the completion message.
- This diagram highlights the concurrency: Chef and Waiter run simultaneously, unlike a single-threaded sequential flow.

### Note
- Kyun Order Change Hota Hai? 
- Thread Scheduling: Java (ya Python, jaisa maine simulate kiya) mein threads ko OS (operating system) manage karta hai. Scheduler decide karta hai ki kis thread ko kab CPU time mile. Yeh non-deterministic hota hai, matlab har run mein order alag ho sakta hai. 
- No Synchronization: Is code mein Chef aur Waiter ke loops independent hain—koi lock, wait, ya signal nahi hai jo ensure kare ki prepare hone ke baad hi serve ho. Toh, outputs interleave ho sakte hain jaise bhi scheduler chahe. 
- Sleep(1000): Yeh sirf simulate karne ke liye hai, lekin real mein bhi, agar ek thread thoda slow ho (jaise system load ki wajah se), dusra aage nikal sakta hai.