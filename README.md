## testAddition

### Goal of the test case:
To test the addition operation in the calculator by verifying that it correctly handles the addition of two numbers.

### Input Domain Modelling:

- **Identify Testable Functions**: 
  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:
  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**: ??

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |
      | C3 = *operator is empty*      | True                 | False              |                    |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| greater than 0      | equal to 0         | less than 0        |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |
      | C3 = *operator is empty*      | ''                 | '+'              |                    |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| 5      | 0         | -5        |