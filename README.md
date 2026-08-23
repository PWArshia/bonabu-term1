# Programming Exercises — Python & Java

This repository contains solutions to a collection of programming exercises implemented in both **Python** and **Java**.

The exercises are based on the *Computer Programming Exercise Collection* prepared for the Computer Engineering Department of **Bonab University**.

The main goal of this repository is to practice programming concepts, improve problem-solving skills, and compare the implementation of the same algorithms in Python and Java.

## 📚 Topics

The exercises are organized into several sections:

* Conditional statements (`if`)
* Loops (`for`, `while`)
* Mathematical and numerical problems
* Prime numbers and divisors
* Fibonacci sequence
* Number manipulation
* One-dimensional arrays
* Searching and sorting algorithms
* Strings and string manipulation
* Two-dimensional arrays and matrices
* Methods / Functions
* Large number calculations
* Numerical methods
* Final programming projects

## 🛠 Languages

Solutions are implemented using:

* 🐍 **Python**
* ☕ **Java**

## 📁 Repository Structure

```text
programming-exercises/
│
├── python/
│   ├── section-01-if-for-while/
│   ├── section-02-arrays/
│   ├── section-03-strings/
│   ├── section-04-matrices/
│   ├── section-05-methods/
│   └── projects/
│
├── java/
│   ├── section-01-if-for-while/
│   ├── section-02-arrays/
│   ├── section-03-strings/
│   ├── section-04-matrices/
│   ├── section-05-methods/
│   └── projects/
│
└── README.md
```

Each exercise will have the same or a similar number in both language folders.

For example:

```text
python/
└── section-01-if-for-while/
    └── problem-024-prime-number.py

java/
└── section-01-if-for-while/
    └── Problem024PrimeNumber.java
```

## 🎯 Objectives

This repository is intended to help with:

* Practicing programming fundamentals
* Improving algorithmic thinking
* Learning different approaches to solving programming problems
* Comparing Python and Java syntax
* Practicing data structures and basic algorithms
* Building a strong foundation for more advanced topics such as Data Structures and Algorithms

## 🚀 Running the Solutions

### Python

Make sure Python is installed:

```bash
python --version
```

Run a solution using:

```bash
python problem_name.py
```

Example:

```bash
python problem-024-prime-number.py
```

### Java

Make sure the JDK is installed:

```bash
java --version
javac --version
```

Compile the program:

```bash
javac Problem024PrimeNumber.java
```

Then run it:

```bash
java Problem024PrimeNumber
```

## 🧩 Example Exercise

### Problem

Write a program that receives an integer and prints:

```text
Yes
```

if the number is prime, otherwise prints:

```text
No
```

### Python

```python
n = int(input())

is_prime = n >= 2

for i in range(2, int(n ** 0.5) + 1):
    if n % i == 0:
        is_prime = False
        break

print("Yes" if is_prime else "No")
```

### Java

```java
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean isPrime = n >= 2;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Yes" : "No");
    }
}
```

## 📈 Difficulty

The exercises gradually increase in difficulty.

```text
Beginner
   ↓
Basic Programming
   ↓
Problem Solving
   ↓
Algorithms
   ↓
Advanced Programming Problems
```

Some of the later exercises may require significantly more time and algorithmic thinking than the earlier ones.

## ✅ Progress

Solutions will be added gradually.

| Section                | Python | Java |
| ---------------------- | :----: | :--: |
| If / For / While       |   🚧   |  🚧  |
| One-Dimensional Arrays |   🚧   |  🚧  |
| Strings                |   🚧   |  🚧  |
| Two-Dimensional Arrays |   🚧   |  🚧  |
| Methods / Functions    |   🚧   |  🚧  |
| Projects               |   🚧   |  🚧  |

Legend:

```text
✅ Completed
🚧 In Progress
⬜ Not Started
```

## 📖 Source

The exercises are based on:

**Computer Programming Exercise Collection — Version 1.4**

Computer Engineering Department
Bonab University

The original exercise collection contains problems ranging from very basic programming exercises to more advanced problems involving algorithms, numerical methods, large numbers, matrices, and programming projects.

## 🤝 Contributions

Suggestions, improvements, alternative solutions, and optimizations are welcome.

If you find a better approach to solving a problem, feel free to open a pull request.

## ⚠️ Note

These solutions are intended for **learning and educational purposes**.

Try solving each problem yourself before checking the provided solution.

## ⭐ Support

If you find this repository useful, consider giving it a **star ⭐**.

Happy Coding! 🚀
