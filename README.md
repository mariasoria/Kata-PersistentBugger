# Persistence Bugger

Write a function, persistence, that takes in a positive parameter _number_ and returns its multiplicative persistence,
which is the number of times you must multiply the digits in _number_ until you reach a single digit.

For example:

**Input 1**
 
number = 39

**Output 1**

3 --> because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit


**Input 2**
 
number = 999

**Output 2**

4 -> because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 = 2


**Input 3**
 
number = 4

**Output 3**

0 -> because 4 is already a one-digit number
