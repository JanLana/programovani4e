package cz.gyarab.ruchar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NejcastejsiCislo {
    static void main() {
        int[] numbers = {1, 5, 8, 94, 105, 267, 62, 3, 8, 1, 797, 55, 4, 66, 47, 8, 5, 8, 1, 16, 17};
        Arrays.sort(numbers);
        List<Integer> list = new ArrayList<Integer>(1000);

        for (int i = 0; i <= 1000; i++) {
            list.add(0);
        }

        for (int i = 0; i < numbers.length; i++) {
            int currNum = numbers[i];
            list.set(currNum, list.get(currNum) + 1);
        }

        int highest = Collections.max(list);
        int index = list.indexOf(highest);

        System.out.println("Nejcastejsi je: " + index);
        System.out.println("Pocet opakovani: " + highest);

    }
}
