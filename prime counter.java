public class PrimeCounter {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 9};
        int primeCount = 0;

        for (int num : array) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println("Number of prime numbers: " + primeCount);
    }
}
