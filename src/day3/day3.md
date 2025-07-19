3. Data Integrity Issue: Multiple Waiters Incrementing Dishes Served
   Why learn:
   Unprotected access to shared data can cause corruption—one of the most common, devastating bugs in multithreaded code.

Real-world use:

Online banking: Several ATMs updating a single bank account.

Social networks: Multiple notifications or messages being added at once.

Sensor networks: Devices posting data at the same time.

Critical skill:
If you don’t understand this, your programs may lose data, show wrong numbers, or cause financial loss—no matter how perfect the code looks in single-threaded tests.