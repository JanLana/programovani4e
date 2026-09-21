package cz.gyarab.stepanova;

import java.util.Scanner;

public class NejcastejsiCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pocet = new int[10];

        int cislo = sc.nextInt();

        while (cislo != 0) {

            while (cislo > 0) {
                int cislice = cislo % 10;
                pocet[cislice]++;
                cislo = cislo / 10;
            }

            cislo = sc.nextInt();
        }

        int nejcastejsi = 0;

        for (int i = 1; i < 10; i++) {
            if (pocet[i] > pocet[nejcastejsi]) {
                nejcastejsi = i;
            }
        }

        System.out.println("Nejčastěji se opakuje číslice: " + nejcastejsi);
        System.out.println("Počet výskytů: " + pocet[nejcastejsi]);
    }
}
