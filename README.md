## testAddition()

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

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             |
      |---------------------------------|---------------------|--------------------|--------------------|
      | C1 = *result of the calculation*| 5      | 0         | -5        |

- **Combine partitions to define test requirements**:
  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (number of largest characteristic) = 3

- **Derive test values and expected values**:  
    `Each Choice Coverage (ECC)`
    | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
    |--------------------|---|---|---|
    | T1 (>0, >0) | 2 | 3 | 5 |
    | T2 (0, 0) | 0 | 0 | 0 |
    | T2 (<0, <0) | -2 | -3 | -5 |


## testPower()

### Goal of the test case:
To test the power operation in the calculator by verifying that it correctly handles the base number (firstNumber) raised to the power of exponent (secondNumber).

### Input Domain Modelling:

- **Identify Testable Functions**: 
  - `calculate()`

- **Identify Parameters, Return Types, Return Values, and Exceptional Behavior**:
  - **Parameters**: `firstNumber`, `secondNumber`, `operator`
  - **Return Type**: `double`
  - **Return Value**: Result of the calculation
  - **Exceptional Behavior**: If the base number `firstNumber` is equal to 0 and exponent `secondNumber` is equal to negative number, the expected result will be inifinity.

- **Model the Input Domain**:

  - **Partition Characteristics**:

    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | greater than 0       | equal to 0         | less than 0        |
      | C2 = *value of secondNumber*  | greater than 0       | equal to 0         | less than 0        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             | **b4** | **b5** |
      |---------------------------------|---------------------|--------------------|--------------------|--------|--------------|
      | C1 = *result of the calculation*| greater than 1      | equal to 1         | equal to 0        | less than 0 | infinity |

  - **Identify (possible) values**:
    
    - **Interface-Based Characteristics**:
    
      | **Characteristic**           | **b1**               | **b2**             | **b3**             |
      |------------------------------|----------------------|--------------------|--------------------|
      | C1 = *value of firstNumber*   | 2       | 0         | -2        |
      | C2 = *value of secondNumber*  | 3       | 0         | -3        |

    - **Functionality-Based Characteristics**:
    
      | **Characteristic**              | **b1**              | **b2**             | **b3**             | **b4** | **b5** |
      |---------------------------------|---------------------|--------------------|--------------------|--------|--------|
      | C1 = *result of the calculation*| 8      | 1 | 0         | -8        | infiinity |

- **Combine partitions to define test requirements**:
  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (number of largest characteristic) = 5

- **Derive test values and expected values**:
    `Each Choice Coverage (ECC)`
    | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
    |--------------------|---|---|---|
    | T1 (>0, >0) | 2 | 3 | 8 |
    | T2 (>0, 0)  | 2 | 0 | 1 |
    | T3 (0, >0)  | 0 | 3 | 0 |
    | T4 (<0, <0) | -2 | -3 | -8 |
    | T5 (0, <0)  | 0 | -3 | infinity |
