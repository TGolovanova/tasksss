import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class trainTask {

    /* дан массив целых чисел и ещё одно целое число.
    удалите все вхождения этого числа из массива (пропусков
    быть не должно)
     */

    public static String deleteInt(int[] arrOfInts, int someInt) {

        for (int i = 0; i < arrOfInts.length; i++) {
            if (arrOfInts[i] == someInt) {
                arrOfInts[i] = 0;
            }
        }
        return Arrays.toString(arrOfInts);
    }
}
