7. Synchronization of Order Pad
   Why learn:
   Control access to more complex shared structures (like lists), not just counters or booleans.

Real-world use:

Shopping carts: Multiple actions updating the same cart.

Logging systems: Maintaining event order without missing or mixing up logs.

Shared caches: Updating a data cache so all users see consistent data.

Critical skill:
If two threads add to a list or map at once without coordination, the structure can break, crash, or show bad data.