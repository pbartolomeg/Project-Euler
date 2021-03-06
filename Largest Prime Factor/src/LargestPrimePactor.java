/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/


public class LargestPrimePactor {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));

    }

    public static int getLargestPrime (int number) {


        if (number < 0 || number == 0 || number == 1)
            return -1;


     /* int i;

     for (  i = 2; i <= number; i++){
            if (number % i == 0){
                number = number / i;
             //   i--; //Very confusing
            }

        }
        return i;
       */

        int j = 2;
        while (number > 1) {

            if (number % j == 0) {
                number = number / j;
            }
            else
                j++;
        }
        return j;
    }
}


