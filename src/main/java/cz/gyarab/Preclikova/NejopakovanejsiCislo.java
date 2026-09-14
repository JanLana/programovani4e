package cz.gyarab.Preclikova;

import java.util.Scanner;

public class NejopakovanejsiCislo {

        static void main() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kolik cisel chces zadat? ");
            int pocetCisel = scanner.nextInt();

            //  pole o velikosti yadanzch cisel
            int[] cisla = new int[pocetCisel];

            //načteni každého čísla jednotlive
            System.out.println("Zadej jednotliva cisla (oddelena mezerou):");
            for (int i = 0; i < pocetCisel; i++) {
                cisla[i] = scanner.nextInt();
            }

            //hledání nejčastějšího čísla
            int nejcastejsiCislo = cisla[0];
            int maximalniPocet = 0;

            for (int i = 0; i < cisla.length; i++) {
                int aktualniPocet = 0;

                for (int j = 0; j < cisla.length; j++) {
                    if (cisla[i] == cisla[j]) {
                        aktualniPocet++;
                    }
                }

                if (aktualniPocet > maximalniPocet) {
                    maximalniPocet = aktualniPocet;
                    nejcastejsiCislo = cisla[i];
                }
            }

            System.out.println("nejcastejsi je" + nejcastejsiCislo);
        }
    }


