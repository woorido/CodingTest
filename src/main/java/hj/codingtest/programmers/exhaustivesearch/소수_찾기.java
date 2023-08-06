package hj.codingtest.programmers.exhaustivesearch;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {
    public int solution(String numbers) {

        Set<Integer> primes = new HashSet<>();

        int[] ints = numbers.chars().map(c -> c - '0').toArray();

        getPrimes(0, ints, new boolean[ints.length], primes);

        return primes.size();
    }

    private void getPrimes(int acc, int[] numbers, boolean[] isUsed, Set<Integer> primes) {

        if (isPrime(acc)) {
            primes.add(acc);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            int nextAcc = acc * 10 + numbers[i];

            isUsed[i] = true;

            getPrimes(nextAcc, numbers, isUsed, primes);

            isUsed[i] = false;
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}