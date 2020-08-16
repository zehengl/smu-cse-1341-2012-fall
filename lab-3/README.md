# lab-3

## Temperature Converter

Write a program called `TemperatureConverter` (TemperatureConverter.java) that will convert from Fahrenheit to Celsius (method `int fahrenheitToCelsius( int )` ) and Celsius to Fahrenheit (method `int celsiusToFahrenheit( int )` ) temperature using the two specified methods. The formulas for the temperatures are:

| Method              | Calculation                           |
| ------------------- | ------------------------------------- |
| fahrenheitToCelsius | (5.0 / 9.0) \* (fahrenheitValue – 32) |
| celsiusToFahrenheit | (((9.0 / 5.0) \* celsiusValue) + 32)  |

The application will provide a menu to ask which temperature conversion is being requested.
The application will then ask for the temperature value and show it and the converted value.
The application will exit if the user enters a menu choice of `3` or anything other than a `1` or `2`.

Sampe Run:

```
1. Fahrenheit to Celsius
2. Celsius to Fahrenheit
3. Exit
Choice: 1
Enter temperature: 32
32 Fahrenheit is 0 Celsius

1. Fahrenheit to Celsius
2. Celsius to Fahrenheit
3. Exit
Choice: 2
Enter temperature: 0
0 Celsius is 32 Fahrenheit

1. Fahrenheit to Celsius
2. Celsius to Fahrenheit
3. Exit
Choice: 3
```

## Display Number Systems

Write a program called `DisplayNumberSystems` (DisplayNumberSystems.java) that will display a table of the binary, octal, and hexadecimal equivalents of the decimal number enter (up to a maximum of 1024). The program will need to include/use the following methods:

| Method          | Signature                     |
| --------------- | ----------------------------- |
| convertToBinary | String convertToBinary( int ) |
| convertToOctal  | String convertToOctal( int )  |
| convertToHex    | String convertToHex( int )    |

Sample Run:

```
Enter decimal value to display to: 10
Decimal Binary      Octal   Hexadecimal
1       1           1       1
2       10          2       2
3       11          3       3
4       100         4       4
5       101         5       5
6       110         6       6
7       111         7       7
8       1000        10      8
9       1001        11      9
10      1010        12      A
```

## Greatest Common Divisor

Write a program called `GreatestCommonDivisor` (GreatestCommonDivisor.java) that will use Euclid’s (reference https://en.wikipedia.org/wiki/Euclidean_algorithm) or other algorithm to determine the greatest common divisor (GCD) of two integers.
The GCD is the largest integer that evenly divides the two numbers.
The problem will use a method gcd ( `int gcd(int, int)` ) that will take the two input integer values and return their GCD.

Sample Run:

```
Enter first number (-1 to exit): 10
Enter second number: 12
GCD is: 2

Enter first number (-1 to exit): 30
Enter second number: 5
GCD is: 5

Enter first number (-1 to exit): 7
Enter second number: 11
GCD is: 1

Enter first number (-1 to exit): -1
```

---

## Compile and Run

### TemperatureConverter

    javac TemperatureConverter.java
    java TemperatureConverter

### DisplayNumberSystems

    javac DisplayNumberSystems.java
    java DisplayNumberSystems

### GreatestCommonDivisor

    javac GreatestCommonDivisor.java
    java GreatestCommonDivisor
