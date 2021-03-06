/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestPositiveNumber {
    public static void main(String[] args) {

        boolean j = false;
        int findNumber = 232792558;

        while (!j){
            j = SmallestPositiveNumber.isDivisible (findNumber);
            findNumber += 1;
        }
    }
    private static boolean isDivisible(int number) {

        int i = 2;
        while (number % i == 0) {

            if (i < 20) {
                i += 1;
            }
            else if (i == 20) {
                System.out.println(number);
                return true;
            }
            else
                return false;
        }

        return false;
    }
}

