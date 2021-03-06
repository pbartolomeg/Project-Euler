/*
* The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is, 385

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*
* */
public class SumSquare {

    public static void main(String[] args) {


        int manyNumbers = 100;
        SumSquare.calculateExpSum(manyNumbers);
    }

    public static void calculateExpSum(int manyNumbers) {

        int sumSquares = 0;
        int expNumber;
        int squaresSum = 0;

        for (int i = 0; i <= manyNumbers; i++) {

            expNumber = i * i;
            sumSquares += expNumber;
            squaresSum += i;
        }
        System.out.println((squaresSum * squaresSum) - sumSquares);
    }

}
