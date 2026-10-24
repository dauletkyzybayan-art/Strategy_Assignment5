# Calculator — Strategy Pattern

A Java 17 console application demonstrating the Strategy design pattern.

## Project structure

- `OperationStrategy` — common interface for mathematical operations.
- `AddStrategy` — adds two numbers.
- `SubtractStrategy` — subtracts the second number from the first.
- `MultiplyStrategy` — multiplies two numbers.
- `Calculator` — stores the current strategy and delegates calculations.
- `Main` — creates the calculator and changes its strategy at runtime.

The UML class diagram is available in [UML.md](UML.md).

## Requirements

- JDK 17
- No external libraries

## Run in IntelliJ IDEA

1. Open the project.
2. Select JDK 17 as the project SDK and runtime.
3. Run the main method in `src/Main.java`.

## Compile and run from the terminal

Run these commands from the project root with JDK 17:

```bash
javac -d out src/*.java
java -cp out Main
```

## Expected output

```text
Addition: 10 + 5 = 15.0
Subtraction: 10 - 5 = 5.0
Multiplication: 10 * 5 = 50.0

Additional checks:
-4 + 2 = -2.0
2.5 - 0.5 = 2.0
7 * 0 = 0.0
```

## Add a new strategy

1. Create a new class implementing `OperationStrategy`.
2. Implement `public double execute(double a, double b)`.
3. Create the new strategy in the client and pass it to
   `calculator.setStrategy(...)`.
4. Call `calculator.calculate(...)`.

The `Calculator`, interface and existing strategy classes do not need
to change. The client selects the new strategy.