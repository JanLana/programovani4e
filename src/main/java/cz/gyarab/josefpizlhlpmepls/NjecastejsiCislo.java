package cz.gyarab.josefpizlhlpmepls;

import java.util.Arrays;

public class NjecastejsiCislo {
    static void main() {
        int[] numbers = {4, 2, 7, 2, 4, 4, 1, 7, 2, 2};

        Arrays.sort(numbers);

        int maxCount = 0;
        int maxNumber = numbers[0];

        int count = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxNumber = numbers[i - 1];
                }

                count = 1;
            }
        }

        if (count > maxCount) {
            maxCount = count;
            maxNumber = numbers[numbers.length - 1];
        }

        System.out.println("jake " + maxNumber);
        System.out.println("kolik " + maxCount);
    }
}
