# Assignment 3 - Bridge Pattern
Name: Yerzhan Aitimov
Group: SE-2526
Topic: D (Remote controls)
Repository URL: https://github.com/TwoThousand07/SDP_Assignment3

Base Commit Hash: 5f5c343231f6a7ba0772b74b543aa685c3ec7a98

## Role Map
| Role | Class | Path |
| --- | --- | --- |
| Abstraction | Remote | src/Remote.java |
| A1 | BasicRemote | src/BasicRemote.java |
| A2 | QuietRemote | src/QuietRemote.java |
| Implementor | Device | src/Device.java |
| I1 | TvDevice | src/TvDevice.java |
| I2 | RadioDevice | src/RadioDevice.java |
| I3 | ProjectorDevice | src/ProjectorDevice.java |
| Client | Main | src/Main.java |

- The bridge field `device` is located in `Remote.java`.
- `execute()` and `setImplementation()` are in `Remote.java`.
- Runtime switch (T5) is checked in `Main.java` using `setImplementation`.

## Commands to Run
```bash
javac --release 17 -encoding UTF-8 -d out "@sources.txt"
java -cp out Main --demo