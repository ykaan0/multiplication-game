# Multiplication Game (Çarpım Oyunu)

A console-based multiplication quiz game built with Java.

## About

The game presents random multiplication questions with three answer choices (one correct, two fake). Players must select the correct answer to earn points.

### Rules
- **3 mistakes** → Game Over
- Each correct answer: **+1 point**
- Each wrong answer: **-1 point** (minimum 0)
- After game over, you can restart or quit

## Tech Stack
- **Java 21**
- **Maven** (Build tool)

## How to Run

### Using Maven
```bash
mvn compile exec:java -Dexec.mainClass="org.versed.Main"
```

### Using IDE
Open the project in IntelliJ IDEA or any Java IDE and run `Main.java`.

## Project Structure
```
src/main/java/org/versed/
├── Main.java        # Entry point
├── User.java        # Player data (name, score)
└── GameSystem.java  # Game logic & flow
```

## License
This project is open source.
