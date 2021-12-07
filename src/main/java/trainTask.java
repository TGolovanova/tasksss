import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class trainTask {

    /* дан массив целых чисел и ещё одно целое число.
    удалите все вхождения этого числа из массива (пропусков
    быть не должно)
     */

    public static String deleteInt(int[] arrOfInts, int someInt) {

        int ind = 0;

        for (int i = 0; i < arrOfInts.length; i++) {
            if (arrOfInts[i] != someInt) {
                arrOfInts[ind++] = arrOfInts[i];
            }
        }
        return Arrays.toString(Arrays.copyOf(arrOfInts, ind));
    }
}
