import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TrainTest {



    @Test
    public static void deleteOrNot() {

        int[] array = new int[]{1, 4, 10, 10, 4, 9, 4};
        int someInt = 4;

        Assert.assertEquals(new trainTask().deleteInt(array, someInt), Arrays.toString(new int[]{1,10,10,9}));
    }

    @Test
    public static void noDelete() {

        int[] array = new int[]{1, 4, 10, 10, 4, 9, 4};
        int someInt = 10;

        Assert.assertNotEquals(new trainTask().deleteInt(array, someInt), Arrays.toString(new int[]{1, 4, 10, 4, 9, 4}));
    }
}
