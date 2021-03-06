/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/


public class Main {

    public static void main(String[] args) {

        int howManyNumbers = 10001;
        int j = 2;

        while ( howManyNumbers !=0){
            if (isPrime(j)){
                System.out.println(j);
                howManyNumbers--;
            }
            j++;
        }
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
