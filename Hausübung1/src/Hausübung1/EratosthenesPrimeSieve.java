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
//1 Beispiel
    private int limit = 100;
    List<Boolean> primes = aussieben(limit);

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int p) {
        // Wenn p kleiner/gleich 2 wird es auf 2 gesetzt (2 kleinste Primzahl)
        if (p <= 2) {
            return (p == 2);
        }
        // Es wird geprüft ob p ein Vielfaches von i ist und ob die zahl durch 2 teilbar ist
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        // Alle Zahlen von 1 - 100 (limit) ausgeben die Primzahlen sind
        System.out.println("Primzahlen sind: ");
        for (int i = 0; i <= limit; i++) {
            // Wenn in der Liste die Werte auf true gestzt sind und i größer 1 ist werden diese Zahlen ausgegeben
            if (primes.get(i) == true && i > 1) {
                System.out.print(i + " ");
            }
        }
    }

    private static ArrayList<Boolean> aussieben(int zahl) {
        ArrayList<Boolean> zahlenListe = new ArrayList<Boolean>();

        // Füllt die neue Liste mit lauter true Elementen
        for (int i = 0; i <= zahl; i++) {
            zahlenListe.add(i, true);
        }

        for (int i = 2; i <= zahl; i++) {

            if (zahlenListe.get(i) == true) {
                int j = i;
                do {
                    j = j + i;
                    if (j <= zahl) {
                        // Ist die Zahl ein Vielfaches einer Primzahl,
                        // dann wird sie mit false markiert
                        zahlenListe.set(j, false);
                    }
                } while (j <= zahl);
            }

        }
        return zahlenListe;
    }
//2 Beispiel
    public void sumPrimes(int o) {
        // Füllt die neue Liste mit geraden Zahlen bis zur Obergrenze
        List<Integer> numbers = new ArrayList<>();
        for (int i = 4; i <= o; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        
        // Holt sich die liste von getPrimes()
        List<Integer> prime = getPrimes();
        
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < prime.size(); j++) {
                // Berechnet die Differenz von einer Geraden zahl - der Primzahl ->
                int diff = numbers.get(i) - prime.get(j);
                //  Wenn Ergebnis Primzahl dann ausgeben ansonsten wiederholen
                if(prime.contains(diff) == true){
                    System.out.println(numbers.get(i) + " summe: " + diff + " + " + prime.get(j));
                    break;
                }
            }
        }
    }
    
    private List <Integer> getPrimes() {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= limit; i++) {
            // Wenn in der Liste die Werte auf true gestzt sind und i größer 1 ist werden diese Zahlen in die List gespeichert
            if (primes.get(i) == true && i > 1) {
                primeList.add(i);
            }
        }
        return primeList;
    }
}
