import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TrainTest {

    @Test
    public static void deleteOrNot() {

        int[] array = new int[]{1, 4, 10, 10, 4, 9, 4};
        int someInt = 4;

        Assert.assertEquals(new trainTask().deleteInt(array, someInt), Arrays.toString(new int[]{1,0,10,10,0,9,0}));
    }
}
