/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/


public class SummationOfPrimes {

    public static void main(String[] args) {

        long howManyNumbers = 2000000L;
        long sum = 0L;

        for( int j= 2; j < howManyNumbers; j++  ){
            if (isPrime(j)){
                sum += j;
            }
        }
        System.out.println("Sum of all the primes: " + sum);  //142913828922
    }

    public static boolean isPrime(int number){
        boolean flag = false;

        for (int i = 2; i <= number / 2;i++){
            if (number % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag){
            return true;
        }
        else{
            return false;
        }
    }


}
