package cz.gyarab.OliverV;

public class NejcastejsiHodnota {
    static void main() {
        int[] cisla = {172, 69, 90, 265, 81, 19, 158, 77, 32, 82, 56};
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