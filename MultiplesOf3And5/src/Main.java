/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

*/
public class Main {

    public static void main(String[] args) {

        int sumTotal = 0;

        for (int wholeNumber = 1; wholeNumber <1000; wholeNumber++){

            if (wholeNumber % 3 == 0 || wholeNumber % 5 ==0){
                sumTotal += wholeNumber;
                System.out.println(wholeNumber);
            }
        }

        System.out.println(sumTotal);
    }



}
