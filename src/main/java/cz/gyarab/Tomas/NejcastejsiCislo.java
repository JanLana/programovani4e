package cz.gyarab.Tomas;

import java.util.ArrayList;
import java.util.Collections;

public class NejcastejsiCislo {
     static void main() {
        ArrayList<Integer> cisla = new ArrayList<>();
        cisla.add(5);
        cisla.add(6);
        cisla.add(6);
        cisla.add(6);
        cisla.add(5);
        cisla.add(6);

        int nejcastejsiCislo = cisla.get(0);
        int maxPocet = 0;

        for (int cislo : cisla) {
            int pocet = Collections.frequency(cisla, cislo);

            if (pocet > maxPocet) {
                maxPocet = pocet;
                nejcastejsiCislo = cislo;
            }
        }

        System.out.println(nejcastejsiCislo);

    }
}
