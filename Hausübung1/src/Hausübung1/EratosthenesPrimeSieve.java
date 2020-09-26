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

    public EratosthenesPrimeSieve(int limit) {
        limit = 100;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = 3; i < Math.sqrt(p) + 1; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
