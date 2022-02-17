//Main class
public class Primes {
    //Main method
    public static void main(String[] args) {
        //looping value
        for (int i = 2; i <= 100; i++)
            if (isPrime(i)) {
                System.out.println(i);
            }
    }
    //checking number simple or not
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
