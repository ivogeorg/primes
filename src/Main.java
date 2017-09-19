// Quick implementation of the Sieve of Eratosthenes
// All primes up to and including a limit

public class Main {

    public static void main(String[] args) {

        // limit
        int number = Integer.parseInt(args[0]);

        boolean[] primes = new boolean[number + 1];

        // all numbers are prime...
        for (int i = 2; i < number + 1; i++) primes[i] = true;

        // except multiples
        for (int i = 2; i < number + 1; i++) {
            for (int j = 2; i * j < number + 1; j++) {
                primes[i * j] = false;
            }
        }

        // print out
        for (int i = 2; i < number + 1; i++)
            if (primes[i])
                System.out.print(i + " ");
    }
}
