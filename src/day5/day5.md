5. Memory Consistency Problem
   Why learn:
   Shows that just sharing a variable doesn’t mean all threads “see” changes immediately. This is a surprising and subtle source of bugs.

Real-world use:

Alerts: One thread flags a warning, but the monitoring thread never sees it.

Multiplayer games: Player actions not visible to others.

Critical skill:
Mastering this concept saves hours of “invisible” troubleshooting—where code logic is correct, but inter-thread communication fails.