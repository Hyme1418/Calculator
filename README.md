# Calculator
A very basic calculator application created using Java **Swing**. 

[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## testAddition
### Goal of the test case:
To test the addition operation in the calculator by verifying that it correctly handles addition of two numbers.
### Partition characteristic:
#### Interface-based
C1 = value of firstNumber
C2 = value of secondNumber
C3 = operator is empty
| **Characteristic**            | **b1** | **b2** | **b3** |
|-------------------------------|--------|--------|--------|
| C1 = *value of firstNumber*   | greater than 0 | equal to 0 | less than 0 |
| C2 = *value of secondNumber*  |  True  | False  |
| C3 = *operator is empty*      |  True  | False  |

#### Functionality-based
C1 = result of the calculation
### Input domain modelling:
1. Identify testable functions: calculate()
2. Identify parameters, return types, return values, and exceptional behavior
○ Parameters: firstNumber, secondNumber, operator
○ Return type: double
○ Return value: result of the calculation
○ Exceptional behavior: ?? 

