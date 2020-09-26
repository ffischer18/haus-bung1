/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fisch
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    List<Integer> primes = new ArrayList<>();
    private int limit = 100;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 3; i < Math.sqrt(p) + 1; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        primes.add(p);
        return true;
    }

    @Override
    public void printPrimes() {
        if (primes.size() < limit) {
            for (Integer prime : primes) {
                System.out.println(prime);
            }
        }
    }

}
