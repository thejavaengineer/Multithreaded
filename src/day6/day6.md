6. Fixing Memory Consistency Using volatile
   Why learn:
   Using volatile ensures changes made to a variable in one thread are always visible to others.

Real-world use:

Status updates: Service signals shutdown, all worker threads react immediately.

Task coordination: Flags or signals between threads for when to start or stop processing.

Critical skill:
It’s a lightweight tool for safe communication—far more efficient than locking when you just need to signal between threads.