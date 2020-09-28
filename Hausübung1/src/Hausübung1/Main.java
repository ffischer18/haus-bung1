/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hausübung1;

import java.util.Scanner;

/**
 *
 * @author fisch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(100);

        while (true) {
            System.out.println("");
            System.out.println("1 ... Primzahl prüfen");
            System.out.println("2 ... Primzahlen ausgeben");
            System.out.println("3 ... Summe mit Primzahlen berechnen");
            System.out.println("9 ... Beenden");
            System.out.println("-------------------------");
            int input = Integer.parseInt(sc.nextLine());
            switch(input){
                case 1:
                    System.out.print("Primzahl? -> ");
                    int primzahl = Integer.parseInt(sc.nextLine());
                    if(ep.isPrime(primzahl) == true){
                        System.out.println(primzahl + " ist eine Primzahl");
                    }
                    else if(ep.isPrime(primzahl) == false){
                        System.out.println(primzahl + " ist keine Primzahl");
                    }
                    break;
                
                case 2:
                    ep.printPrimes();
                    break;
                    
                case 3:
                    System.out.print("Bis zur welcher zahl soll die Summe berechnet werden? -> ");
                    int oZahl = Integer.parseInt(sc.nextLine());
                    ep.sumPrimes(oZahl);
                    break;
                
                case 9:
                    System.exit(0);
                
                default:
                    System.out.println("Falsche eingabe");
                    break;
            }
        }
    }

}