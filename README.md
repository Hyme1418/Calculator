# Calculator
A very basic calculator application created using Java **Swing**. 

[![License MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)

## testAddition
### Goal of the test case:
To test the addition operation in the calculator by verifying that it correctly handles addition of two numbers.

### Input domain modelling:
#### Identify testable functions: calculate()
#### Identify parameters, return types, return values, and exceptional behavior
- Parameters: firstNumber, secondNumber, operator
- Return type: double
- Return value: result of the calculation
- Exceptional behavior: ?? 
3. Model the input domain
### Partition characteristic:

#### Interface-based
| **Characteristic**            | **b1** | **b2** | **b3** |
|-------------------------------|--------|--------|--------|
| C1 = *value of firstNumber*   | greater than 0 | equal to 0 | less than 0 |
| C2 = *value of secondNumber*  | greater than 0 | equal to 0 | less than 0 |
| C3 = *operator is empty*      |  True  | False  |

#### Functionality-based  
| **Characteristic**            | **b1** | **b2** | **b3** |
|-------------------------------|--------|--------|--------|
| C1 = *result of the calculation*   | greater than 0 | equal to 0 | less than 0 |

