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

- **Combine partitions to define test requirements**:
  - **Assumption**: choose one value from each block
  - **Test requirements**: number of tests (upper bound) = 3

- **Derive test values and expected values** (pick from interface-based):  
**Each Choice Coverage (ECC)**
    | **Test** | **firstNumber** | **secondNumber** | **Expected result** |
    |--------------------|---|---|---|
    | T1 (0, 0, True)    | 0 | 0 | x |
    | T2 (>0, >0, False) | 2 | 3 | 5 |
    | T3 (<0, <0, False) | -2 | -3 | -5 |


## testPower()

### Goal of the test case:
To test the power operation in the calculator by verifying that it correctly handles the power of two numbers.

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

- **Combine partitions to define test requirements**:
  - **Assumption**: choose all possible combinations
  - **Test requirements**: number of tests (upper bound) = 3 * 3 = 9

- **Derive test values and expected values**:
