# Course Work Repository

This repository contains my coursework for various courses, including **UC Berkeley CS61B (Spring 2026)**.

## CS61B Setup

### Required Library

CS61B uses the `edu.princeton.cs.algs4` package, which is not part of standard Java.

**Setup Steps:**

1. Navigate to the `cs61b` folder:

   ```bash
   cd coursework/cs61b
   ```

2. Clone the official library:
   ```bash
   git clone https://github.com/Berkeley-CS61B/library-sp26.git
   ```

### Compiling and Running

```bash
    cd coursework/cs61b/projects/proj0

    # for windows use (;) instead of (:) in file path
    # Compile
    javac -cp ".:../../library-sp26/algs4.jar" src/*.java

    # Run
    java -cp ".:../../library-sp26/algs4.jar" Particle
```

### Intellij Setup

1. Open the coursework folder (or just the cs61b folder) in IntelliJ.
2. Go to **File → Project Structure → Libraries → Add the cs61b/library-sp26** folder as a Java library.
3. Then simply run the java file.
