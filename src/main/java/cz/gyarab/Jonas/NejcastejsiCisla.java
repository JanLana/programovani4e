package cz.gyarab.Jonas;

public class NejcastejsiCisla {
    static void main() {
        int[] cisla = {500, 112, 904, 65, 88, 51, 8, 71, 99, 22, 112};
        System.out.println(nejcastejsi_hodnota(cisla));

    }

    static int nejcastejsi_hodnota(int[] pole) {
        int nejvetsi_vyskyt = 0;
        int nejcastejsi_hodnota = 0;
        int[] pocet = new int[pole.length];

        for (int i = 0; i < pole.length; i++) {
            for (int j = i; j < pole.length; j++) {
                if (pole[i] == pole[j]) {
                    pocet[i] += 1;
                }
            }
            if (nejvetsi_vyskyt < pocet[i]) {
                nejvetsi_vyskyt = pocet[i];
                nejcastejsi_hodnota = pole[i];
            }
        }
        return nejcastejsi_hodnota;
    }

}

