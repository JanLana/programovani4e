package cz.gyarab.ali;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Mode {
    static void main() {
        var numbers = new ArrayList<Integer>();
        var random = new Random();

        for (int i = 0; i < 10; i++)
            numbers.add(random.nextInt(11));

        IO.println(numbers);

        getMode(numbers);
    }

    static void getMode(List<Integer> arr) {
        var counts = new HashMap<Integer, Integer>();

        var mode = 0;
        var modeCount = 0;

        for (int x : arr) {
            var count = counts.getOrDefault(x, 0) + 1;
            counts.put(x, count);

            if (count > modeCount) {
                mode = x;
                modeCount = count;
            }
        }

        IO.println(counts);
        IO.println("mode: " + mode + " (" + modeCount + "x)");
    }
}
