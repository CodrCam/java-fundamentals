# Dice Roller and Array Helper

This project consists of two main components: a dice roller that simulates rolling a six-sided die, and an array helper with various utility methods for working with arrays.

## 1. Problem Domain

The goal of this project is to provide utility methods for rolling a six-sided die, detecting duplicates in an array, calculating the average of an array, and finding the subarray with the lowest average in a 2D array.

## 2. Visual

![Dice Roller](dice-roller.png)

## 3. Algorithm

The main algorithms used in this project are:

- Dice roller: generating random integers between 1 and 6 (inclusive) using the `java.util.Random` class.
- Array helper:
  - Detect duplicates: using a HashSet to store unique values and check for duplicates.
  - Calculate the average: sum all elements in the array and divide by the number of elements.
  - Find the subarray with the lowest average: iterate through each subarray, calculate its average, and keep track of the lowest average and corresponding subarray.

## 4. Big O

- Dice roller: O(n), where n is the number of dice rolls.
- Array helper:
  - Detect duplicates: O(n), where n is the number of elements in the array.
  - Calculate the average: O(n), where n is the number of elements in the array.
  - Find the subarray with the lowest average: O(m * n), where m is the number of subarrays and n is the number of elements in each subarray.

## 5. Pseudocode

function roll(n)
Initialize an empty array of size n
For i = 0 to n-1
Generate a random integer between 1 and 6 (inclusive)
Add the random integer to the array
Return the array

function containsDuplicates(arr)
Initialize an empty HashSet
For each number in arr
If the HashSet contains the number
Return true
Add the number to the HashSet
Return false

function calculateAverage(arr)
Initialize sum to 0
For each number in arr
Add the number to sum
Return sum divided by the length of arr

function findSubArrayWithLowestAverage(arr)
Initialize indexWithLowestAverage to 0
Initialize lowestAverage to the average of arr[0]
For i = 1 to length of arr - 1
Calculate the average of arr[i]
If the average is less than lowestAverage
Update lowestAverage and indexWithLowestAverage
Return arr[indexWithLowestAverage]

markdown
Copy code

## 6. Code

Refer to the following files for the implementation:

- `Main.java`: The main class that demonstrates the usage of the dice roller and array helper.
- `DiceRoller.java`: The dice roller implementation.
- `ArrayHelper.java`: The array helper implementation.

## 7. Test

To run the tests for this project, use the following command:`./gradlew test`

The test cases for the dice roller and array helper methods are located in the `TestMethods.java` file.
